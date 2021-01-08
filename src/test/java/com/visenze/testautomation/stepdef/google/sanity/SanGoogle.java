package com.visenze.testautomation.stepdef.google.sanity;

import com.visenze.mainautomation.questions.google.ForTheResultPage;
import com.visenze.mainautomation.tasks.Navigate;
import com.visenze.mainautomation.tasks.SearchForArticle;
import com.visenze.mainautomation.tasks.TypeIntoGoogleSearchBar;
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

public class SanGoogle {

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

    @Given("{string} is on Google Homepage")
    public void isOnGoogleHomepage(String sUser) {
        theActorCalled(sUser).attemptsTo(
                Navigate.toWebPage("Google")
        );
    }

    @When("{string} attempts to type {string}")
    public void attemptsToType(String sUser, String sText) {
        theActorInTheSpotlight().attemptsTo(
                TypeIntoGoogleSearchBar.with(sText)
        );
    }

    @And("search for article {string}")
    public void searchForArticle(String arg0) {
        theActorInTheSpotlight().attemptsTo(
                SearchForArticle.of(arg0)
        );
    }

    @Then("he should see the passage number {string} contain the word {string}")
    public void heShouldSeeThePassageNumberContainTheWord(String arg0, String arg1) {
        theActorInTheSpotlight().should(
                seeThat(ForTheResultPage.paragraphOf(arg0),Matchers.containsString(arg1))
        );
    }
}
