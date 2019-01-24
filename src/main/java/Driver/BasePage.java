package Driver;

 import Util.ProUtil;
import Util.ResourceUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public  class BasePage {

    public static WebDriver driver;
    protected String filepath;

    /**
     * 加载配置文件
     */
    public BasePage() {
        filepath = ResourceUtil.getClassPath() + "config/" + this.getClass().getSimpleName().toLowerCase() + ".properties";
        System.out.println(filepath);
    }

    /**
     * 等待元素出现
     * @param element
     * @return
     */

    protected WebElement waitForElement(final String element) {
        WebElement webElement = null;

        try {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            webElement = wait.until(new ExpectedCondition<WebElement>() {
                @Override
                public WebElement apply(WebDriver driver) {
                    By by = getBy(element);
                    System.out.println("by------" + by);
                    return driver.findElement(getBy(element));

                }
            });
        } catch (TimeoutException e) {
            System.out.println("is not null");
        }
        return webElement;
    }

    /**
     * 根据id／class／name／xpath定位元素
     * @param key
     * @return
     */
    private By getBy(String key) {

        By by = null;
        ProUtil proUtil = ProUtil.getInstance();
        String value =  ProUtil.getInstance().readProperties(filepath).getProperty(key);

        String params[] = key.split(":=");
        switch (params[0]){
            case "id":
                by = By.id(params[1]);
                break;
            case "class":
                by = By.className(params[1]);
                break;
            case "name":
                by = By.name(params[1]);
                break;
            case "xpth":
                by = By.xpath(params[1]);
                break;
             default:
                by = By.xpath(params[1]);
        }

       return by;
    }

    /**
     * 点击事件
     * @param key
     */
    protected void click(String key) {
        if (key != null) {
            waitForElement(key).click();
        } else {
            System.out.println(getBy(key) + "元素未找到");
        }
    }

    /**
     * 像输入框中输入数据
     * @param key
     * @param value
     */
     protected void sendKeys(String key, String value){
         waitForElement(key).sendKeys(value);
    }

    /**
     * 清除元素
     * @param key
     */
     protected void celarElement(String key){
         waitForElement(key).clear();
     }

    /**
     *
     */
}
