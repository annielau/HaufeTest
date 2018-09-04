package com.haufe.Steps;

import com.haufe.Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import com.haufe.pages.PageObject;
import java.util.concurrent.TimeUnit;

public class EvaluationStep {

    private BaseUtil base;
    private PageObject page;

    public EvaluationStep(BaseUtil base){
        this.base = base;
        this.page = new PageObject(base.Driver);
    }

    @And("^I click on an employee from TopApplicants$")
    public void iClickOnAnEmployeeFromTopApplicants() throws Throwable {
        Thread.sleep(3000);
         base.Driver.navigate().to(PageObject.URL + "Recruiting/Applications/190/976/Details");
    }

    @Then("^I should see the Employee Information Page$")
    public void iShouldSeeTheEmployeeInformationPage() throws Throwable {
        Assert.assertTrue ("Employee information pages is not displayed", page.lblApplication.getText().contains("Direct online application"));
    }

    @And("^I click on Evaluation HR Department$")
    public void iClickOnEvaluationHRDepartment() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        base.Driver.navigate().to(PageObject.URL + "Recruiting/Applications/190/976/Details/QuickHandleApplication");
    }

    @Then("^I should see the Evaluation HR Department Page$")
    public void iShouldSeeTheEvaluationHRDepartmentPage() throws Throwable {
        Assert.assertTrue("Information Page is not displayed", page.lblEvaluationHR.getText().contains("Evaluation HR department"));
    }

    @And("^I complete form and click on Save$")
    public void iCompleteFormAndClickOnSave() throws Throwable {
        page.txtComment.clear();
        page.txtComment.sendKeys("This is a comment for employee 1");
        page.btnSave.click();
    }

    @And("^I navigate to Evaluation & Release tab$")
    public void iNavigateToEvaluationReleaseTab() throws Throwable {
        page.tabEvaluation.click();

    }

    @Then("^I should see the comment was properly saved$")
    public void iShouldSeeTheCommentWasProperlySaved() throws Throwable {
        Assert.assertEquals("Comment is not displayed", page.lblComment.getText(),"This is a comment for employee 1");

    }
}
