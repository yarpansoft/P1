import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Main {
    WebDriver webDriver;
    public static String driverPath = "C:\\DATA\\Selenium_Drivers\\chromedriver.exe";
    //public static String driverPath = "src/test/resources/chromedriver.exe";
    public static String baseUrl = "https://www.evernote.com/Login.action";


    @Test
    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        //WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.navigate().to(baseUrl);
    }
}

