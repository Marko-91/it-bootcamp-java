package com.demoqa.marko.test;

import com.demoqa.marko.pages.Sortable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSortable {
    public static String PATH = "/home/marko/chromedriver/chromedriver_linux64/chromedriver";
    public static String web_driver = "webdriver.chrome.driver";
    public static void main(String[] args) {
        System.setProperty(web_driver, PATH);
        WebDriver wd = new ChromeDriver();
        Actions act = new Actions(wd);
        StringBuilder sb = new StringBuilder();
        Thread t = new Thread();

        wd.get(Sortable.URL);
        wd.manage().window().maximize();
        Sortable.sortDragNDropElements(wd, sb, act);

    }
}
