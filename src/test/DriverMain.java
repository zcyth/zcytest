package Usecase;
import Driver.BasePage;
import Driver.LoginEvent;
import Driver.Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class DriverMain{

    public static void main(String[] args) throws InterruptedException {

        Webdriver webdriver = new Webdriver();
        BasePage.driver = webdriver.OpenChrome() ;

        LoginEvent loginEvent = new LoginEvent();
        loginEvent.Loginevent("6257186", "123456");

        Thread.sleep(3000);
        Date date = new Date();
        System.out.println(date);




       webdriver.takeScreenshot(BasePage.driver, date.getTime());
       webdriver.returnToPrevPage(BasePage.driver);
       webdriver.closeCurrentBrowser(BasePage.driver);

    }
}