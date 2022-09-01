package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    WebDriver driver;

    By userName=By.xpath("//input[@name='username']");

    By password=By.xpath("//input[@name='password']");

    By submit=By.xpath("//button");
    public LoginPage(WebDriver driver){
        this.driver=driver;

    }
    public  void LoginMethod() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(userName).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();

    }

}
