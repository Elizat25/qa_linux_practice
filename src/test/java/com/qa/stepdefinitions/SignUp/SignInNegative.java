package com.qa.stepdefinitions.SignUp;

import com.qa.pages.SignUp.SignInNegativeP;
import com.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SignInNegative {
    WebDriver driver = DriverHelper.getDriver();

    SignInNegativeP signInNegativeP = new SignInNegativeP(driver);


    @Given("the user is on the Cashwise login page and clicks the Sign In button.")
    public void the_user_is_on_the_cashwise_login_page_and_clicks_the_sign_in_button() {
        signInNegativeP.clicksSignInButton();
    }

    @When("User provides   {string} and  {string}")
    public void user_provides_and(String email, String password) {
        signInNegativeP.negativeSignInFunctionality1(email, password);
    }

    @When("User  clicks the Sign In button")
    public void user_clicks_the_sign_in_button() {
        signInNegativeP.clicksSignInButton2();

    }

    @Then("User validates the {string}")
    public void user_validates_the(String expectedMessage) {
        signInNegativeP.validateTheErrorMessage(expectedMessage);


    }
}
