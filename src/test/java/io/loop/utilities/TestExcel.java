package io.loop.utilities;

import java.io.File;

public class TestExcel {
    public static void main(String[] args) {


        ExcelUtils excelUtils = new ExcelUtils("C:/Users/Windows User/OneDrive/Desktop/Book1.xlsx", "Sheet1");
        System.out.println("Column Names: " + excelUtils.getColumnNames());

        System.out.println(excelUtils.getCellData(0,0));

        excelUtils.setCellData("Pavlo is awake","Pavlo is awake",0);
    }
}