package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.PageFactory;


public class BaseClass {

    protected static PageFactory pageFactory;
    static WebDriver driver;
    public static void setup()
    {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pageFactory  = new PageFactory(driver);
    }
public void close()
    {
        driver.close();
    }
}
