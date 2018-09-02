package com.haufe.Steps;

import com.haufe.Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import com.haufe.pages.PageObject;
import java.util.concurrent.TimeUnit;

public class LoginStep extends BaseUtil{

    private BaseUtil base;
    private PageObject page;

    public LoginStep(BaseUtil base){
        this.base = base;
        this.page = new PageObject(base.Driver);
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        base.Driver.navigate().to(PageObject.URL);
    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        page.clickLogin();
    }

    @Then("^I should see the WelcomePage$")
    public void iShouldSeeTheWelcomePage() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue("Welcome page is not displayed", page.lblWelcome.getText().contains("Welcome"));
    }

    @And("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterTheUsernameAndPassword(String username, String password) throws Throwable {
        page.Login(username, password);
    }
}
