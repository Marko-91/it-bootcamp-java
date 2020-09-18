package com.octoperf.petstore.marko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private static String registerNowXpath = "//a[contains(text(),'Register Now!')]";
    private static String loginXpath = "//input[@name='signon']";
    private static String userNameName = "username";
    private static String passwordXpath = "//input[@name='password']";

    private static WebElement getRegisterNow(WebDriver wd) {
        return wd.findElement(By.xpath(registerNowXpath));
    }

    private static WebElement getLogin(WebDriver wd) {
        return wd.findElement(By.xpath(loginXpath));
    }

    private static WebElement getUserName(WebDriver wd) {
        return wd.findElement(By.name(userNameName));
    }

    private static WebElement getPassword(WebDriver wd) {
        return wd.findElement(By.xpath(passwordXpath));
    }

    public static void clickRegisterNow(WebDriver wd) {
        getRegisterNow(wd).click();
    }

    public static void clickLogin(WebDriver wd) {
        getLogin(wd).click();
    }

    public static void setUserName(WebDriver wd, String s) {
        getUserName(wd).sendKeys(s);
    }

    public static void setPassword(WebDriver wd, String s) {
        getPassword(wd).sendKeys(s);
    }
}
