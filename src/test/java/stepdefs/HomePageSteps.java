package stepdefs;

import general.MainCall;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageSteps {
    @Given("I click on the Testim learn more button")
    public void iClickontheTestimlearnmorebutton(){
        MainCall.homePage.arriveToHomePage();
        MainCall.homePage.learnMoreBtn();
    }

    @Then("I am redirected to the Testim home page")
    public void iAmredirectedtotheTestimhomepage() {
        MainCall.homePage.verifyTestimUrl();
    }
}
