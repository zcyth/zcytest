package testjava;

import org.testng.annotations.Test;

public class testapp {

    @Test(dependsOnMethods = {"deploy", "db"})
    public void method1(){
        System.out.println("this is method1");
    }

    @Test(dependsOnMethods = {"method1"})
    public void method2(){
        System.out.println("this is method2");
    }
}
