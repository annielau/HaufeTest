package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageObject {

    public WebDriver Driver;

    public PageObject (WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.ID, using = "input_UserName")
    public WebElement txtUserName;

    @FindBy (how = How.ID, using = "input_password")
    public WebElement txtPassword;

    @FindBy (how = How.NAME, using = "Login")
    public WebElement btnLogin;

    @FindBy (how = How.ID, using = "customdatablock_151642")
    public WebElement lblWelcome;

    @FindBy (how = How.CLASS_NAME, using = "form_content_label")
    public WebElement lblEvaluationHR;

    @FindBy (how = How.ID, using = "input_1169790")
    public WebElement txtComment;

    @FindBy (how = How.ID, using = "mainnavlink_14839")
    public WebElement tabEvaluation;

    @FindBy (how = How.ID, using = "showblockvalue_1169893")
    public WebElement lblComment;

    public void Login (String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

    public String url= "https://recruitingapp-90412258.umantis.com/";

}
