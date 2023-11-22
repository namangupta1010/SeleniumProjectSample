package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {



        @Given("User is on login page")
        public void userIsOnLoginPage () {

            System.out.println("User is on login page");

        }


        @When("User enters username and password")
        public void userEntersUsernameAndPassword () {

            System.out.println("User enters username and password");

        }

        @And("Clicks on login button")
        public void clicksOnLoginButton () {

            System.out.println("Clicks on login button");
        }


        @Then("User is navigated to homepage")
        public void userIsNavigatedToHomepage () {

            System.out.println("User is navigated to homepage");
        }


    }
