package theory.testngex;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestEx {

    @Test(enabled = false)
    public void skipTest(){
        System.out.println("Skip Test");
    }

    @Test
    public void throwSkip(){
        System.out.println("print before condition");
        int x = 3;
        if(x == 3){
            throw new SkipException("Reason");
        }
    }
}
