package testjava;

import org.testng.Assert;
import org.testng.annotations.*;

public class Testlgnore {

    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("testBeforeSuite()");
    }

    @AfterSuite
    public void testAfterSuite(){
        System.out.println("testAfterSuite()");
    }

    @BeforeTest
    public void testBeforeTest(){
        System.out.println("testBeforeTest()");
    }

    @AfterTest
    public void testAfterTest(){
        System.out.println("testAfterTest()");
    }
}
