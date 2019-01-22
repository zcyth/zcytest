package Usecase;

import Driver.BasePage;
import Driver.LoginEvent;
import Driver.Webdriver;
import Util.Log;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

import org.apache.log4j.Logger;

public class Loginsucess{

    private static  Logger logger = Logger.getLogger(Loginsucess.class);

     @Test
    public void login() throws InterruptedException {

         PropertyConfigurator.configure("/Users/zcy/IdeaProjects/zcyessay/target/classes/config/log4j.properties");
        Webdriver webdriver = new Webdriver();
        BasePage.driver = webdriver.OpenChrome();

         LoginEvent loginEvent = new LoginEvent();
         loginEvent.Loginevent("61951195993","Okay@123");
         Thread.sleep(3000);
         Log.info(this.getClass().getName());

         webdriver.switchChrome(BasePage.driver);
    }
}
