package com.visenze.testautomation.stepdef.widget.sanity;

import com.visenze.mainautomation.questions.widget.ForTheWidget;
import com.visenze.mainautomation.tasks.Navigate;
import com.visenze.mainautomation.tasks.OpenSBIImage;
import com.visenze.mainautomation.tasks.UploadPhotoOnLocalPC;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.model.TestOutcome;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SanWidget {

    @Before
    public void set_the_stage(){
        setTheStage(new OnlineCast());
    }

    @Before
    public void cucumberBeforeSecnario(){
        System.out.println("BEFORE TEST");
    }

    @BeforeScenario
    public void beforeScenario(TestOutcome testOutcome){
        System.out.println("BEFORE SCENARIO " + testOutcome.getName());
    }
    
    @When("{string} attempts to launch page {string}")
    public void attemptsToLaunchPage(String arg0, String arg1) {
        theActorCalled(arg0).attemptsTo(
                Navigate.toPage(arg1)
        );
    }

    @Then("he should see that the icon exist")
    public void heShouldSeeThatTheIconExist() {
        theActorInTheSpotlight().should(
                seeThat(ForTheWidget.theIconShouldShows(), Matchers.equalTo(true))
        );
    }

    @Given("{string} launches page {string}")
    public void launchesPage(String arg0, String arg1) {
        theActorCalled(arg0).attemptsTo(
                Navigate.toPage(arg1)
        );
    }

    @When("{string} attempts to open SBI Image")
    public void attemptsToOpenSBIImage(String arg0) {
        theActorInTheSpotlight().attemptsTo(OpenSBIImage.andWaitForDialogToShow());
    }

    @Then("he should see that the main dialog shows")
    public void heShouldSeeThatTheMainDialogShows() {
        theActorInTheSpotlight().should(
                seeThat("the image dialog body is being displayed",ForTheWidget.theImageDialogBodyShouldDisplay(), Matchers.equalTo(true))
        );
    }

    @And("he should see that the Title {string} shows")
    public void heShouldSeeThatTheTitleShows(String sTitle) {
        theActorInTheSpotlight().should(
                seeThat("the image dialog title showed "+sTitle,ForTheWidget.theImageDialogTitleShouldDisplay(), Matchers.equalTo(sTitle))
        );
    }

    @And("he should see that the Description {string} shows")
    public void heShouldSeeThatTheDescriptionShows(String sDescription) {
        theActorInTheSpotlight().should(
                seeThat("the image dialog description showed " + sDescription,ForTheWidget.theImageDialogDescriptionShouldDisplay(), Matchers.equalTo(sDescription))
        );
    }

    @And("he should see that the following tabs {string} and {string} shows")
    public void heShouldSeeThatTheFollowingTabsAndShows(String sTabName_1, String sTabName_2) {
        theActorInTheSpotlight().should(
                seeThat("the image dialog tab 1 showed " + sTabName_1,ForTheWidget.theImageDialogTabNameShouldDisplayForTab(1), Matchers.equalTo(sTabName_1)),
                seeThat("the image dialog tab 2 showed " + sTabName_2,ForTheWidget.theImageDialogTabNameShouldDisplayForTab(2), Matchers.equalTo(sTabName_2))
        );
    }

    // Under Given Situation
    @And("he has opened SBI Image")
    public void heHasOpenedSBIImage() {
        theActorInTheSpotlight().wasAbleTo(OpenSBIImage.andWaitForDialogToShow());
    }


    @When("he attempts to click on tab {string} to upload {string}")
    public void heAttemptsToClickOnTabToUpload(String sTab, String sFileName) {
        theActorInTheSpotlight().attemptsTo(
                UploadPhotoOnLocalPC.withThisFile(sTab,sFileName)
        );
    }

    @Then("he should see that the {string} dialog shows")
    public void heShouldSeeThatTheDialogShows(String sTitle) {
        theActorInTheSpotlight().should(
                seeThat(String.format("%s dialog popup",sTitle),ForTheWidget.theFindSimilarProductDialogShouldShow(),Matchers.equalTo(sTitle))
        );
    }
}
