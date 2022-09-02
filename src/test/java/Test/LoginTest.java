package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LoginTest extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getLoginPage().LoginMethod();
        pageFactory.getDashboardPage().Admin();

        pageFactory.getLoginPage().select();
 pageFactory.getLoginPage().value();


    }
}
