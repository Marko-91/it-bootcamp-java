package com.octoperf.petstore.marko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
    public static String path = "/home/marko/chromedriver/chromedriver_linux64/chromedriver";
    public static String web_driver = "webdriver.chrome.driver";
    public static String url = "https://petstore.octoperf.com/";

    private static String enterTheStoreXpath = "//a[contains(text(),'Enter the Store')]";

    public static WebElement getEnterTheStore(WebDriver wd) {
        return wd.findElement(By.xpath(enterTheStoreXpath));
    }

    public static void clickEnterTheStore(WebDriver wd) {
        getEnterTheStore(wd).click();
    }
}
