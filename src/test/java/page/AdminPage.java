package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;

    By Add =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By Drop =By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[@class='oxd-select-text oxd-select-text--active']");

    public AdminPage(WebDriver driver){
        this.driver=driver;

    }
    public  void AdminPage() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(Add).click();
        driver.findElement(Drop).click();


    }

}
