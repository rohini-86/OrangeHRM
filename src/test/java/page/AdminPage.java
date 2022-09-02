package page;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;


    By Drop =By.xpath("//div[@class='oxd-select-wrapper']/div[@class='oxd-select-text oxd-select-text-focus oxd-select-text--error']/div[@class='oxd-select-dropdown --position-bottom']");

    public AdminPage(WebDriver driver){
        this.driver=driver;

    }
    public  void AdminPage() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
      //  driver.findElement(Add).click();
        driver.findElement(Drop).click();


    }

}
