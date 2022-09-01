package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage
{
    WebDriver driver;

    By Admin =By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");
    By Add =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public DashboardPage(WebDriver driver){
        this.driver=driver;

    }
    public  void Admin() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(Admin).click();
        driver.findElement(Add).click();


    }

}


