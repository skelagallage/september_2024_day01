package theory.testngex;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {

    @Test
    @Parameters({"name", "age"})
    public void printMyDetails(@Optional("Kaushalya") String name, @Optional("35") String age){
        System.out.printf("My name is %s and my age is %s", name, age);
    }
}
