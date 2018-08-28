package Steps;

import Base.BaseUtil;
// import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public LoginStep(BaseUtil base){
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        base.Driver.navigate().to(page.url);
    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        page.clickLogin();
    }

    @Then("^I should see the WelcomePage$")
    public void iShouldSeeTheWelcomePage() throws Throwable {
        System.out.println("Should see WelcomePage");
        // PageObject page = new PageObject(base.Driver);
        base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement el= base.Driver.findElement(By.cssSelector("div.c-site-header__navbar-title-container.u-truncate"));
        Assert.assertEquals("Its not displayed", el.getText(), "Dashboard");

    }

    @And("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterTheUsernameAndPassword(String username, String password) throws Throwable {
        PageObject page= new PageObject (base.Driver);
        page.Login(username, password);
    }
}
