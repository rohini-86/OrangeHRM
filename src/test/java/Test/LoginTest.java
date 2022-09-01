package Test;

public class LoginTest extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getLoginPage().LoginMethod();
        pageFactory.getDashboardPage().Admin();
      //  pageFactory.getAdminPage().AdminPage();
    }

}
