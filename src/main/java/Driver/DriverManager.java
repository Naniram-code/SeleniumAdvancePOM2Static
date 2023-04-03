package Driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {
    static WebDriver driver;
    @BeforeMethod

    public static void init(){
        if(driver==null){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(chromeOptions);

    }}
    @AfterMethod
    public static void down(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
