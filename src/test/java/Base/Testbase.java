package Base;

import Driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testbase {


    @BeforeMethod
    protected void setUp() {
        DriverManager.init();
    }

        @AfterMethod
    protected void tearDown() {
           DriverManager.down();
        }
    }

