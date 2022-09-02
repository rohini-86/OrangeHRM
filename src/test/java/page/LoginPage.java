package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver;

    By userName = By.xpath("//input[@name='username']");

    By password = By.xpath("//input[@name='password']");

    By submit = By.xpath("//button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void LoginMethod() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(userName).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();

    }



    public void select() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[1]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
    }
    public void value() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[0]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
    }
}