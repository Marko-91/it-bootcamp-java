package com.octoperf.petstore.marko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserInformation {
    private static String userIDName = "username";
    private static String newPasswordXpath = "//input[@name='password']";
    private static String repeatPasswordXpath = "//input[@name='repeatedPassword']";
    private static String firstNameXpath = "//input[@name='account.firstName']";
    private static String lastNameXpath = "//input[@name='account.lastName']";
    private static String emailXpath = "//input[@name='account.email']";
    private static String phoneXpath = "//input[@name='account.phone']";
    private static String address_1Xpath = "//input[@name='account.address1']";
    private static String address_2Xpath = "//input[@name='account.address2']";
    private static String cityXpath = "//input[@name='account.city']";
    private static String stateXpath = "//input[@name='account.state']";
    private static String zipXpath = "//input[@name='account.zip']";
    private static String countryXpath = "//input[@name='account.country']";
    private static String languagePreferenceXpath = "//select[@name='account.languagePreference']";
    private static String categoryXpath = "//select[@name='account.favouriteCategoryId']";
    private static String myListRadioXpath = "//input[@name='account.listOption']";
    private static String myBannerRadioXpath = "//input[@name='account.bannerOption']";
    private static String saveAccountInfoXpath = "//input[@name='newAccount']";


    public static void setUserID(WebDriver wd, String s) {
        wd.findElement(By.name(userIDName)).sendKeys(s);
    }

    public static void setNewPassword(WebDriver wd, String s) {
        wd.findElement(By.xpath(newPasswordXpath)).sendKeys(s);
    }

    public static void setRepeatPassword(WebDriver wd, String s) {
        wd.findElement(By.xpath(repeatPasswordXpath)).sendKeys(s);
    }

    public static void setFirstName(WebDriver wd, String s) {
        wd.findElement(By.xpath(firstNameXpath)).sendKeys(s);
    }

    public static void setLastName(WebDriver wd, String s) {
        wd.findElement(By.xpath(lastNameXpath)).sendKeys(s);
    }

    public static void setEmail(WebDriver wd, String s) {
        wd.findElement(By.xpath(emailXpath)).sendKeys(s);
    }

    public static void setPhone(WebDriver wd, String s) {
        wd.findElement(By.xpath(phoneXpath)).sendKeys(s);
    }

    public static void setAddress_1(WebDriver wd, String s) {
        wd.findElement(By.xpath(address_1Xpath)).sendKeys(s);
    }

    public static void setAddress_2(WebDriver wd, String s) {
        wd.findElement(By.xpath(address_2Xpath)).sendKeys(s);
    }

    public static void setCity(WebDriver wd, String s) {
        wd.findElement(By.xpath(cityXpath)).sendKeys(s);
    }

    public static void setState(WebDriver wd, String s) {
        wd.findElement(By.xpath(stateXpath)).sendKeys(s);
    }

    public static void setZip(WebDriver wd, String s) {
        wd.findElement(By.xpath(zipXpath)).sendKeys(s);
    }

    public static void setCountry(WebDriver wd, String s) {
        wd.findElement(By.xpath(countryXpath)).sendKeys(s);
    }

    public static void clickLanguagePreference(WebDriver wd) {
        wd.findElement(By.xpath(languagePreferenceXpath)).click();
        wd.findElement(By.xpath("//option[contains(text(),'english')]")).click();
    }

    public static void clickFavoriteCategory(WebDriver wd) {
        wd.findElement(By.xpath(categoryXpath)).click();
        wd.findElement(By.xpath("//option[contains(text(),'FISH')]")).click();
    }

    public static void clickMyList(WebDriver wd) {
        wd.findElement(By.xpath(myListRadioXpath)).click();
    }

    public static void clickMyBanner(WebDriver wd) {
        wd.findElement(By.xpath(myBannerRadioXpath)).click();
    }

    public static void clickSaveAccountInfo(WebDriver wd) {
        wd.findElement(By.xpath(saveAccountInfoXpath)).click();
    }

}
