package com.octoperf.petstore.marko.read;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read {
    private XSSFWorkbook wb;
    private FileInputStream fis;
    private String path;

    public Read(String path) {
        this.path = path;
        try {
            fis = new FileInputStream(path);
            wb = new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Input format not correct.");
        }



    }

    public String getExcelTableCell(int row, int col) {
        Sheet sheet = wb.getSheetAt(0);     // Get sheet number 1
        Row r = sheet.getRow(row);
        Cell cell = r.getCell(col);
        return cell.toString();
    }

    public void setExcelTableCell(int row, int col, String data) {
        Row r;
        Cell c;
        Sheet sheet = wb.getSheetAt(0);
        if (sheet.getRow(row) == null) {
            sheet.createRow(row);
        }
        r = sheet.getRow(row);
        if (r.getCell(col) == null) {
            r.createCell(col);
        }
        c = r.getCell(col);
        c.setCellValue(data);

        try (FileOutputStream outputStream = new FileOutputStream(path)) {
            wb.write(outputStream);     // Overwrite it.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
