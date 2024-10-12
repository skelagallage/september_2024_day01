package theory.testngex;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {

    @Test(dataProvider = "feedData")
    public void printMyDetail(String name, int age){
        System.out.printf("My name is %s and my age is %d \n", name, age);
    }

    @DataProvider
    public Object[][] feedData(){
        return new Object[][]{
                new Object[]{"Sanath", 36},
                new Object[]{"Chandima", 35},
                new Object[]{"Chathuni", 28}
        };
    }
}
