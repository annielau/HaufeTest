package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import pages.PageObject;
import ru.stqa.selenium.wait.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EvaluationStep {

    private BaseUtil base;

    public EvaluationStep(BaseUtil base){
        this.base = base;
    }

    @And("^I click on an employee from TopApplicants$")
    public void iClickOnAnEmployeeFromTopApplicants() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        Thread.sleep(3000);
        base.Driver.navigate().to(page.url + "Recruiting/Applications/190/976/Details");
//        List<WebElement> listEmployees = base.Driver.findElements(By.tagName("a"));
//        WebElement employee1= listEmployees.get(1);
//        employee1.click();
    }

    @Then("^I should see the Employee Information Page$")
    public void iShouldSeeTheEmployeeInformationPage() throws Throwable {
        System.out.println("Should see information page");
    }

    @And("^I click on Evaluation HR Department$")
    public void iClickOnEvaluationHRDepartment() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        // Thread.sleep(3000);
        base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // System.out.println(page.btnEvaluationHR);
        base.Driver.navigate().to(page.url + "Recruiting/Applications/190/976/Details/QuickHandleApplication");
    }

    @Then("^I should see the Evaluation HR Department Page$")
    public void iShouldSeeTheEvaluationHRDepartmentPage() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        // WebElement lbl= base.Driver.findElement(By.className("form_content_label"));
        System.out.println("Should see evaluation HR page" + page.lblEvaluationHR.getText());
    }

    @And("^I complete form and click on Save$")
    public void iCompleteFormAndClickOnSave() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        page.txtComment.clear();
        page.txtComment.sendKeys("This is a comment for employee 1");

        base.Driver.findElement (By.id("Button_1169800")).click();
    }

    @And("^I navigate to Evaluation & Release tab$")
    public void iNavigateToEvaluationReleaseTab() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        page.tabEvaluation.click();

    }

    @Then("^I should see the comment was properly saved$")
    public void iShouldSeeTheCommentWasProperlySaved() throws Throwable {
        PageObject page= new PageObject (base.Driver);
        Assert.assertTrue("Comment is not displayed", page.lblComment.getText().contains("This is a comment for employee 1"));

    }


}
