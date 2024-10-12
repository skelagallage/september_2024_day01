package theory.testngex;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelDataProvider {

    @Test(dataProvider = "feedData")
    public void printMyDetail(String name, int age){
        System.out.printf("My name is %s and my age is %d \n", name, age);
    }

    @DataProvider
    public Object[][] feedData() throws IOException {
        List<Object[]> returnObjArray = new ArrayList<>();
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook("studentDetails.xlsx");
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet1");

        Iterator<Row> rowIterator = xssfSheet.rowIterator();
        while(rowIterator.hasNext()){
            Row row = rowIterator.next();
            List<Object> objectList = new ArrayList<>();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                if(cell.getCellType().equals(CellType.STRING)){
                    objectList.add(cell.getStringCellValue());
                }else{
                    objectList.add((int)cell.getNumericCellValue());
                }

            }
            returnObjArray.add(objectList.toArray(new Object[0]));
        }

        return returnObjArray.toArray(new Object[0][]);
    }
}
