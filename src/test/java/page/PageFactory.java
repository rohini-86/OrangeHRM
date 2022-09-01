package page;

import org.openqa.selenium.WebDriver;

public class PageFactory{
    WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private AdminPage adminpage;


    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage getLoginPage()
    {
        if(loginPage == null)
        {
            loginPage = new LoginPage(driver);

        }
        return loginPage;
    }

    public DashboardPage getDashboardPage(){
        if(dashboardPage == null){
            dashboardPage = new DashboardPage(driver);
        }
        return dashboardPage;
    }
    public AdminPage getAdminPage(){
        if(adminpage == null){
            adminpage = new AdminPage(driver);
        }
        return adminpage;
    }
}
