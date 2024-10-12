package theory.testngex;

import org.testng.annotations.Test;

public class HomeTest {

    @Test
    public void makeFoundation(){
        System.out.println("makeFoundation :: Foundation is created");
    }

    @Test(dependsOnMethods = "makeFoundation")
    public void makeWall(){
        System.out.println("makeWall :: Wall is created");
    }

    @Test(dependsOnMethods = "makeWall")
    public void makeRoof(){
        System.out.println("makeRoof :: Roof is created");
    }

    @Test(dependsOnMethods = {"makeWall", "makeRoof"})
    public void fixDoorsAndWindows(){
        System.out.println("fixDoorsAndWindows :: Doors and windows are fixed");
    }

    @Test(dependsOnMethods = {"makeWall", "makeRoof"})
    public void supplyElectricity(){
        System.out.println("supplyElectricity :: Electricity is supplied");
    }

    @Test(dependsOnMethods = "makeWall")
    public void supplyWater(){
        System.out.println("supplyWater :: Water is supplied");
    }
}
