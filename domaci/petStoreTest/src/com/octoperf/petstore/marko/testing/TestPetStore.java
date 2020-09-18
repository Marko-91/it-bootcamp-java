package com.octoperf.petstore.marko.testing;
import com.octoperf.petstore.marko.pages.Dashboard;
import com.octoperf.petstore.marko.pages.Home;
import com.octoperf.petstore.marko.pages.Login;
import com.octoperf.petstore.marko.pages.UserInformation;
import com.octoperf.petstore.marko.read.Read;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class TestPetStore {
    public static void main(String[] args) {
        Read reader = new Read("testDataUsers.xlsx");
        UUID uuid = UUID.randomUUID();
        System.setProperty(Home.web_driver, Home.path);
        WebDriver wd = new ChromeDriver();
        wd.get(Home.url);
        wd.manage().window().maximize();
        Home.clickEnterTheStore(wd);
        Dashboard.clickSingInBtn(wd);
        Login.clickRegisterNow(wd);
        UserInformation.setUserID(wd, uuid.toString());
        reader.setExcelTableCell(1, 0, uuid.toString());
        UserInformation.setNewPassword(wd, "fleka");
        reader.setExcelTableCell(1, 1, "fleka");
        UserInformation.setRepeatPassword(wd, "fleka");
        reader.setExcelTableCell(1, 2, "fleka");
        UserInformation.setFirstName(wd, "Marko");
        reader.setExcelTableCell(1, 3, "Marko");
        UserInformation.setLastName(wd, "Markovic");
        reader.setExcelTableCell(1, 4, "Markovic");
        UserInformation.setEmail(wd, "test@test.com");
        reader.setExcelTableCell(1, 5, "test@test.com");
        UserInformation.setPhone(wd, "011/111-222");
        reader.setExcelTableCell(1, 6, "011/111-222");
        UserInformation.setAddress_1(wd, "Mirkova 8");
        reader.setExcelTableCell(1, 1, "fleka");
        UserInformation.setAddress_2(wd, "Stankova");
        reader.setExcelTableCell(1, 1, "fleka");
        UserInformation.setCity(wd, "Beograd");
        reader.setExcelTableCell(1, 1, "fleka");
        UserInformation.setState(wd, "Serbia");
        reader.setExcelTableCell(1, 1, "fleka");
        UserInformation.setZip(wd, "11000");
        reader.setExcelTableCell(1, 1, "fleka");
        UserInformation.setCountry(wd, "Srbija Brale!");
        reader.setExcelTableCell(1, 1, "fleka");
        UserInformation.clickLanguagePreference(wd);
        UserInformation.clickFavoriteCategory(wd);
        UserInformation.clickMyList(wd);
        UserInformation.clickMyBanner(wd);
        UserInformation.clickSaveAccountInfo(wd);
    }
}
