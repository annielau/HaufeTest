package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    public PageObject (WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.ID, using = "input_UserName")
    public WebElement txtUserName;

    @FindBy (how = How.ID, using = "input_password")
    public WebElement txtPassword;

    @FindBy (how = How.NAME, using = "Login")
    public WebElement btnLogin;

    // @FindBy (how = How.Css, using = ".div.c-site-header__navbar-title-container.u-truncate")

    // public WebElement lblDashboard;

    public void Login (String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

    public String url= "https://recruitingapp-11003.umantis.com/SelfServiceLine?redirectAfterLogin=/HiringManager/";

}
