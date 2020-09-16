import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/marko/chromedriver/chromedriver_linux64/chromedriver"
        );

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        WebElement we = driver.findElement(By.xpath("//input[@name='firstname']"));
        we.sendKeys("Marko");

        we = driver.findElement(By.xpath("//input[@name='lastname']"));
        we.sendKeys("Silni");

        we = driver.findElement(By.cssSelector("#sex-0"));
        we.click();

        we = driver.findElement(By.cssSelector("#exp-0"));
        we.click();

        we = driver.findElement(By.cssSelector("#datepicker"));
        we.sendKeys("2020.6.5");

        we = driver.findElement(By.cssSelector("#profession-1"));
        we.click();

        we = driver.findElement(By.cssSelector("#tool-2"));
        we.click();

        we = driver.findElement(By.id("continents"));
        we.click();

        we = driver.findElement(By.xpath("//option[contains(text(),'Europe')]"));
        we.click();

        we = driver.findElement(By.xpath("//input[@id='photo']"));
        we.sendKeys("/home/marko/Downloads/Socrates_Louvre.jpg");

        we = driver.findElement(By.xpath("//button[@id='submit']"));
        we.click();

        we = driver.findElement(By.xpath("//a[contains(text(),'Click here to Download File')]"));
        we.click();
    }
}
