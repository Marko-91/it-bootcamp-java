package com.octoperf.petstore.marko.testing;

import com.octoperf.petstore.marko.pages.Dashboard;
import com.octoperf.petstore.marko.pages.Home;
import com.octoperf.petstore.marko.pages.Login;
import com.octoperf.petstore.marko.read.Read;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class TestLogin {
    public static void main(String[] args) {
        Read reader = new Read("testDataUsers.xlsx");
        System.setProperty(Home.web_driver, Home.path);
        WebDriver wd = new ChromeDriver();
        wd.get(Home.url);
        wd.manage().window().maximize();
        Home.clickEnterTheStore(wd);
        Dashboard.clickSingInBtn(wd);
        Login.setUserName(wd, reader.getExcelTableCell(1, 0));
        Login.setPassword(wd, reader.getExcelTableCell(1, 1));
        Login.clickLogin(wd);
    }
}
