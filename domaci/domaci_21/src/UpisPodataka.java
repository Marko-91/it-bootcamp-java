import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpisPodataka {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/marko/chromedriver/chromedriver_linux64/chromedriver"
        );

        XSSFWorkbook wb, wbout;
        WebDriver wd = new ChromeDriver();
        WebElement we;

        try(
                FileInputStream fis = new FileInputStream("tableTestUsersShop.xlsx");
                FileOutputStream fos = new FileOutputStream("userInfoTax.xlsx")
        ) {
            wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheetAt(0);

            wbout = new XSSFWorkbook();
            Sheet sheetout = wbout.createSheet("Sheet_1");
            Row rowout = sheetout.createRow(0);

            Cell cellout = rowout.createCell(0);
            cellout.setCellValue("TAX");

            cellout = rowout.createCell(1);
            cellout.setCellValue("PRODUCT NAME");

            cellout = rowout.createCell(2);
            cellout.setCellValue("PAYMENT INFO");

            cellout = rowout.createCell(3);
            cellout.setCellValue("USER NAME");


            for (int i = 1; i < 7; i++) {
                rowout = sheetout.createRow(i);

                wd.get("https://www.saucedemo.com/");
                wd.manage().window().maximize();

                Row row = sheet.getRow(i); // i-th user

                we = wd.findElement(By.cssSelector("#user-name"));
                Cell cell = row.getCell(0); // info on that cell of i-th user
                we.sendKeys(cell.toString());

                cellout = rowout.createCell(3);
                cellout.setCellValue(cell.toString() /*userName*/); // Send the user name to another sheet

                we = wd.findElement(By.cssSelector("#password"));
                cell = row.getCell(1);
                we.sendKeys(cell.toString());

                we = wd.findElement(By.cssSelector("#login-button"));
                we.click();

                we = wd.findElement(By.xpath("//select[@class='product_sort_container']"));
                we.click();

                we = wd.findElement(By.xpath("//option[contains(text(),'Price (low to high)')]"));
                we.click();

                we = wd.findElement(By.xpath("//div[6]//div[3]//button[1]"));
                we.click();

                we = wd.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
                we.click();

                we = wd.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
                we.click();

                we = wd.findElement(By.cssSelector("#first-name"));
                cell = row.getCell(2);
                we.sendKeys(cell.toString());

                we = wd.findElement(By.cssSelector("#last-name"));
                cell = row.getCell(3);
                we.sendKeys(cell.toString());

                we = wd.findElement(By.cssSelector("#postal-code"));
                cell = row.getCell(4);
                we.sendKeys(cell.toString());

                we = wd.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
                we.click();

                we = wd.findElement(By.xpath("//div[@class='summary_tax_label']")); // Get tax
                cellout = rowout.createCell(0);
                cellout.setCellValue(we.getText());

                we = wd.findElement(By.className("inventory_item_name")); // Get product name
                cellout = rowout.createCell(1);
                cellout.setCellValue(we.getText());

                we = wd.findElement(By.className("summary_value_label")); // Get payment info
                cellout = rowout.createCell(2);
                cellout.setCellValue(we.getText());

                we = wd.findElement(By.xpath("//a[@class='btn_action cart_button']")); // FINISH BTN
                we.click();

                wbout.write(fos); // Upis

            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not recognized...");
            e.printStackTrace();
        }
    }
}
