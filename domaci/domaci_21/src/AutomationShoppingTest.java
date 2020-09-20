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

public class AutomationShoppingTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/marko/chromedriver/chromedriver_linux64/chromedriver"
        );

        XSSFWorkbook wb, wbTest;
        WebDriver wd = new ChromeDriver();
        WebElement we;

        try(
            FileInputStream fis = new FileInputStream("tableTestUsersShop.xlsx");
            FileInputStream fistTest = new FileInputStream("userInfoTax.xlsx")
        ) {
            wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheetAt(0);

            wbTest = new XSSFWorkbook(fistTest);
            Sheet sheetout = wbTest.getSheetAt(0);

            for (int i = 1; i < 7; i++) {

                wd.get("https://www.saucedemo.com/");
                wd.manage().window().maximize();

                Row row = sheet.getRow(i); // i-th user

                we = wd.findElement(By.cssSelector("#user-name"));
                Cell cell = row.getCell(0); // info on that cell of i-th user
                we.sendKeys(cell.toString());

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
                for (int j = 1; j < sheetout.getPhysicalNumberOfRows(); j++) {
                    Row rowTest = sheetout.getRow(j); // rows are dynamic
                    Cell cellTest = rowTest.getCell(3); // cols are always 3, user name foreign key
                    cell = row.getCell(0); // username, row is dynamic
                    if (cellTest.toString().equals(cell.toString())) {
                        we = wd.findElement(By.xpath("//div[@class='summary_tax_label']")); // Get tax
                        if (we.getText().equals(rowTest.getCell(0).toString())) { // move to tax field in test
                            System.out.println("The taxes match!");
                        } else {
                            System.out.println("The taxes woun't match... something bad...");
                        }
                    }
                }


                we = wd.findElement(By.className("inventory_item_name")); // Get product name
                // TODO

                we = wd.findElement(By.className("summary_value_label")); // Get payment info
                // TODO

                we = wd.findElement(By.xpath("//a[@class='btn_action cart_button']")); // FINISH BTN
                we.click();
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
