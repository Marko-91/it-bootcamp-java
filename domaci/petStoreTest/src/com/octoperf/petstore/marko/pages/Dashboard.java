package com.octoperf.petstore.marko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
    private static String singInBtnXpath = "//a[contains(text(),'Sign In')]";

    private static WebElement getSingInBtn(WebDriver wd) {
        return wd.findElement(By.xpath(singInBtnXpath));
    }

    public static void clickSingInBtn(WebDriver wd) {
        getSingInBtn(wd).click();
    }
}
