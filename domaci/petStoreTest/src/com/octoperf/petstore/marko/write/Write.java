package com.octoperf.petstore.marko.write;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    private XSSFWorkbook wb;
    private FileOutputStream fos;

    public Write() {
        try {
            fos = new FileOutputStream("outputUserInfo.xlsx");
            wb = new XSSFWorkbook();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found.");
        }
    }

    // TODO

}
