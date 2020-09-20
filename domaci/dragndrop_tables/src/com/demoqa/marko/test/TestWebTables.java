package com.demoqa.marko.test;

import com.demoqa.marko.pages.WebTables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebTables {
    public static void main(String[] args) {
        System.setProperty(TestSortable.web_driver, TestSortable.PATH);
        WebDriver wd = new ChromeDriver();
        wd.get(WebTables.URL);
        wd.manage().window().maximize();
        WebTables.deleteTable3(wd);
        WebTables.deleteTable2(wd);
        WebTables.clickAddTable(wd);
        WebTables.setModalFirstName(wd, "Marko");
        WebTables.setModalLastName(wd, "Stank");
        WebTables.setModalEmail(wd, "test@test.com");
        WebTables.setModalAge(wd, "20");
        WebTables.setModalSalary(wd, "3000");
        WebTables.setModalDepartment(wd, "QA");
        WebTables.clickModalSubmit(wd);
    }
}
