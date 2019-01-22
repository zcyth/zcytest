package Driver;

import Util.ResourceUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * 打开教师空间域名
 */
public class Webdriver {

    public WebDriver OpenChrome(){

        System.setProperty("webdriver.chrome.driver","/Users/zcy/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jiaoshi.qa-dev.xk12.cn");
        return driver;
    }

    /**
     * 刷新教师空间
     * @param driver
     */
    public void switchChrome(WebDriver driver){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.location.href = 'https://jiaoshi.qa-dev.xk12.cn' ");

    }
    /**
     *关闭教师空间
     */
    public  void closeCurrentBrowser(WebDriver driver){
        driver.close();
    }

    /**
     * 返回按钮
     * @param driver
     */
    public void returnToPrevPage(WebDriver driver){
        driver.navigate().back();
    }

    /**
     * 下一页
     * @param driver
     */
    public void forwardToNextPage(WebDriver driver){
        driver.navigate().forward();
    }

    /**
     * 刷新教师空间
     * @param driver
     */
    public void refreshPage(WebDriver driver){
        driver.navigate().refresh();
    }

    public void takeScreenshot(WebDriver driver, long filename)  {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            System.out.println("save snapshot path is:");
            FileUtils.copyFile(srcFile, new File("/Users/zcy/Pictures/自动化测试截图/ "+ filename));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
