package theory.testngex;

import org.testng.annotations.*;

public class TestNGAnnotationOrder {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite is executed");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite is executed");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest is executed");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest is executed");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass is executed");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass is executed");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod is executed");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod is executed");
    }

    @Test
    public void testMethod1(){
        System.out.println("testMethod1 is executed");
    }

    @Test
    public void testMethod2(){
        System.out.println("testMethod2 is executed");
    }
}
