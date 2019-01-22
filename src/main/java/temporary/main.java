package temporary;

import Driver.BasePage;
import Driver.LoginEvent;
import Driver.Webdriver;
import Util.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class main {

    private static  Logger logger = Logger.getLogger(main.class);


    public static void main(String[] args) throws InterruptedException {

        PropertyConfigurator.configure("/Users/zcy/IdeaProjects/zcyessay/target/classes/config/log4j.properties");

        Webdriver webdriver = new Webdriver();
        BasePage.driver = webdriver.OpenChrome();

        LoginEvent loginEvent = new LoginEvent();
        loginEvent.Loginevent("6257186","123456");

        Thread.sleep(3000);
        //Log.info(this.getClass().getName());

        webdriver.switchChrome(BasePage.driver);
    }
}
