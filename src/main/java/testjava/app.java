package testjava;

import org.testng.annotations.Test;

@Test(groups = "deploy")
public class app {
    @Test
    public void deployserver(){
        System.out.println("Deploying server.....");
    }

    @Test(dependsOnMethods = "deployserver")
    public void deploybackupserver(){
        System.out.println("Deploying backup server....");
    }
}
