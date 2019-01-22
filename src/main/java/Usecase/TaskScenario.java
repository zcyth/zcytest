package Usecase;

import Driver.BasePage;
import Util.ProUtil;
import org.testng.annotations.Test;

import java.util.Properties;

public class TaskScenario extends BasePage {

    @Test
    public void clickHomePage() {
        Properties properties = ProUtil.getInstance().readProperties(filepath);



        click(ProUtil.getInstance().getPro(properties,"Catalog")); //目录
      //  click(ProUtil.getInstance().getPro(properties,"Courseware")); //课件
      //  click(ProUtil.getInstance().getPro(properties,"Release"));  //发布
      //  click(ProUtil.getInstance().getPro(properties,"Preview")); //预习

       // click(ProUtil.getInstance().getPro(properties,"Class")); //按班级
      //  click(ProUtil.getInstance().getPro(properties,"Time"));//时间
      //  click(ProUtil.getInstance().getPro(properties,"Time_Confirm")); //确定时间

       // click(ProUtil.getInstance().getPro(properties,"Confirm"));


    }
}
