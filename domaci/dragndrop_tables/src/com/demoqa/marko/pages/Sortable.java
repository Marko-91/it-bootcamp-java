package com.demoqa.marko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sortable {
    public static String URL = "https://demoqa.com/sortable";
    public static String firstItemXpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";
    public static String firstItemGridXpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
    private static String gridItemXpath = "//a[@id='demo-tab-grid']";

    public static WebElement getItem(WebDriver wd, String Xpath) {
        return wd.findElement(By.xpath(Xpath));
    }

    public static void dragNDropItem(WebDriver wd, Actions action, String topItemXpath, String bottomItemXpath) {
        action.dragAndDrop(getItem(wd, topItemXpath), getItem(wd, bottomItemXpath)).build().perform();
    }

    public static WebElement getGrid(WebDriver wd) {
        return wd.findElement(By.xpath(gridItemXpath));
    }

    public static void clickGrid(WebDriver wd) {
        getGrid(wd).click();
    }

    public static void sortDragNDropElements(int numberOfElements, WebDriver wd, String topItemXpath) {
        // This method will sort drag and drop items in reverse order
        Actions action = new Actions(wd);
        StringBuilder sb = new StringBuilder();
        sb.append(topItemXpath);
        sb.delete(sb.length() - 6, sb.length());
        for (int i = numberOfElements; i > 1; i--) {
            String divXpath = String.format("div[%s]", i);
            sb.append(divXpath);
            dragNDropItem(wd, action, topItemXpath, sb.toString());
            sb.delete(sb.length() - 6, sb.length());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong!");
                e.printStackTrace();
            }
        }
    }
}
