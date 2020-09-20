package com.demoqa.marko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {
    public static String URL = "https://demoqa.com/webtables";
    private static String table3Css = "#delete-record-3";
    private static String table2Css = "#delete-record-2";
    private static String addBtnCss = "#addNewRecordButton";
    private static String modalFirstNameCss = "#firstName";
    private static String modalLastNameCss = "#lastName";
    private static String modalEmailCss = "#userEmail";
    private static String modalAgeCss = "#age";
    private static String modalSalaryCss = "#salary";
    private static String modalDepartmentCss = "#department";
    private static String modalSubmit = "#submit";

    private static WebElement getModalSubmit(WebDriver wd) {
        return wd.findElement(By.cssSelector(modalSubmit));
    }

    private static WebElement getTable3(WebDriver wd) {
        return wd.findElement(By.cssSelector(table3Css));
    }

    private static WebElement getTable2(WebDriver wd) {
        return wd.findElement(By.cssSelector(table2Css));
    }

    private static WebElement getAddBtn(WebDriver wd) {
        return wd.findElement(By.cssSelector(addBtnCss));
    }

    private static WebElement getModalFirstName(WebDriver wd) {
        // Wait until first element in the modal is visible
        WebDriverWait wait = new WebDriverWait(wd, 5);
        WebElement firstName;
        firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(modalFirstNameCss)));
        return firstName;
    }

    private static WebElement getModalLastName(WebDriver wd) {
        return wd.findElement(By.cssSelector(modalLastNameCss));
    }

    private static WebElement getModalEmail(WebDriver wd) {
        return wd.findElement(By.cssSelector(modalEmailCss));
    }

    private static WebElement getModalAge(WebDriver wd) {
        return wd.findElement(By.cssSelector(modalAgeCss));
    }

    private static WebElement getModalSalary(WebDriver wd) {
        return wd.findElement(By.cssSelector(modalSalaryCss));
    }

    private static WebElement getModalDepartment(WebDriver wd) {
        return wd.findElement(By.cssSelector(modalDepartmentCss));
    }

    public static void deleteTable3(WebDriver wd) {
        getTable3(wd).click();
    }

    public static void deleteTable2(WebDriver wd) {
        getTable2(wd).click();
    }

    public static void clickAddTable(WebDriver wd) {
        getAddBtn(wd).click();
    }

    public static void setModalFirstName(WebDriver wd, String firstName) {
        getModalFirstName(wd).sendKeys(firstName);
    }

    public static void setModalLastName(WebDriver wd, String lastName) {
        getModalLastName(wd).sendKeys(lastName);
    }

    public static void setModalEmail(WebDriver wd, String email) {
        getModalEmail(wd).sendKeys(email);
    }

    public static void setModalAge(WebDriver wd, String age) {
        getModalAge(wd).sendKeys(age);
    }

    public static void setModalSalary(WebDriver wd, String salary) {
        getModalSalary(wd).sendKeys(salary);
    }

    public static void setModalDepartment(WebDriver wd, String dept) {
        getModalDepartment(wd).sendKeys(dept);
    }

    public static void clickModalSubmit(WebDriver wd) {
        getModalSubmit(wd).click();
    }
}
