package com.ucsc.automation.theory.fileio;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ExcelWrite {

    private static List<Object[]> studentDetails = Arrays.asList(
            new Object[]{"Sanath", 36},
            new Object[]{"Chandima", 35},
            new Object[]{"Chathuni", 28}
    );

    public static void write() throws IOException {
        OutputStream outputStream = new FileOutputStream("studentDetails.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("Sheet1");

        IntStream.range(0, studentDetails.size()).forEach((index) -> {
//            System.out.println(index);
            XSSFRow xssfRow = xssfSheet.createRow(index);

            Object[] details = studentDetails.get(index);

            List<Object> objectValues = Arrays.stream(details).toList();
            IntStream.range(0, objectValues.size()).forEach((index2) -> {
                XSSFCell xssfCell = null;
                if(objectValues.get(index2) instanceof String){
                    xssfCell = xssfRow.createCell(index2, CellType.STRING);
                    xssfCell.setCellValue((String)objectValues.get(index2));
                }else{
                    xssfCell = xssfRow.createCell(index2, CellType.NUMERIC);
                    xssfCell.setCellValue((int)objectValues.get(index2));
                }

            });
        });

        xssfWorkbook.write(outputStream);
    }

    public static void main(String[] args) throws IOException {
        ExcelWrite.write();
    }
}
