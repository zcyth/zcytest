package Driver;

import Util.ProUtil;
import org.openqa.selenium.WebElement;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;


public class Login extends BasePage{

    public void setName(String name) {
        Properties pro = ProUtil.getInstance().readProperties(filepath);
        sendKeys(ProUtil.getInstance().getPro(pro,"name"), name);
    }

    public String getName(String name){

        return name;
    }

    public void setPassword(String password){
       Properties properties = ProUtil.getInstance().readProperties(filepath);
       sendKeys(ProUtil.getInstance().getPro(properties, "password"), password);
    }

    public String getPassword(String password){
        return password;
    }

    public void clickLogin(){
        Properties properties = ProUtil.getInstance().readProperties(filepath);
        click(ProUtil.getInstance().getPro(properties,"login"));
    }
}
