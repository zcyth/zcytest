package testjava;

import org.testng.annotations.Test;

public class TestOrder {

    @Test(groups = {"orderBo", "save"})
    public void testMakeOrder() {
        System.out.println("testMakerOrder");
    }

    @Test(groups = {"orderBo","save"})
    public void testUpdateOrder(){
        System.out.println("testUpdateOrder");
    }

    @Test(groups = "orderBo")
    public void testFindOrder(){
        System.out.println("testFindOrder");
    }
}
