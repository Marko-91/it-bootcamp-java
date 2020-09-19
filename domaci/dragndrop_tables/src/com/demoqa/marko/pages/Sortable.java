package com.demoqa.marko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sortable {
    public static String URL = "https://demoqa.com/sortable";
    private static String firstItemXpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";
    private static String sixthItemXpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]";

    private static WebElement getFirstItem(WebDriver wd) {
        return wd.findElement(By.xpath(firstItemXpath));
    }

    private static WebElement getBottomItem(WebDriver wd, String bottomItemXpath) {
        return wd.findElement(By.xpath(bottomItemXpath));
    }

    public static void dragNDropItem(WebDriver wd, Actions action, String bottomItemXpath) {
        action.dragAndDrop(getFirstItem(wd), getBottomItem(wd, bottomItemXpath)).build().perform();
    }

    public static void sortDragNDropElements(WebDriver wd, StringBuilder sb, Actions action) {
        sb.append("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/");
        for (int i = 6; i > 1; i--) {
            String divXpath = String.format("div[%s]", i);
            sb.append(divXpath);
            dragNDropItem(wd, action, sb.toString());
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
