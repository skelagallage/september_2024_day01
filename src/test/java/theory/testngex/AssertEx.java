package theory.testngex;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx {

    @Test
    public void hardAssertion(){
        System.out.println("A");
        System.out.println("B");
        Assert.assertTrue(false);
        System.out.println("C");
        System.out.println("D");
    }

    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("A");
        System.out.println("B");
        softAssert.assertTrue(false);
        System.out.println("C");
        System.out.println("D");
        softAssert.assertAll();
    }
}
