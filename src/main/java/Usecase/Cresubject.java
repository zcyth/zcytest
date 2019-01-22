package Usecase;

import Driver.BasePage;
import Util.ProUtil;
import org.testng.annotations.Test;

import java.util.Properties;

public class Cresubject extends BasePage {

    @Test
    public void clickHomePage(){
        Properties properties = ProUtil.getInstance().readProperties(filepath);
        click(ProUtil.getInstance().getPro(properties,"Home_Close"));
    //    click(ProUtil.getInstance().getPro(properties,"App_center"));
    //    click(ProUtil.getInstance().getPro(properties,"Cre_subject"));
    }
}
