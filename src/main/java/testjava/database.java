package testjava;

import org.testng.annotations.Test;

public class database {

    @Test(groups = "db",dependsOnMethods = "deploy")
    public void initDB(){
        System.out.println("this is initDB");
    }

    @Test(dependsOnMethods = {"initDB"}, groups = "db")
    public void  testconnection(){
        System.out.println("this is testconnection()");
    }
}
