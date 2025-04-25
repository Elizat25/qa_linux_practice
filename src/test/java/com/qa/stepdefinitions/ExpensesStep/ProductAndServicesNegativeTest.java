package com.qa.stepdefinitions.ExpensesStep;

import com.qa.pages.Expenses.ProductAndServicesNegative;
import com.qa.pages.Expenses.ProductAndServicesP;
import com.qa.pages.SignUp.SignInNegativeP;
import com.utils.DriverHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductAndServicesNegativeTest {
    WebDriver driver = DriverHelper.getDriver();
    SignInNegativeP signInNegativeP = new SignInNegativeP(driver);
    ProductAndServicesP productAndServicesP = new ProductAndServicesP(driver);
    ProductAndServicesNegative productAndServicesNegative = new ProductAndServicesNegative(driver);


    @When("the user clicks the Save button without filling in the required fields \\(name, price, service type, category, description, date)")
    public void the_user_clicks_the_save_button_without_filling_in_the_required_fields_name_price_service_type_category_description_date() {
        productAndServicesP.saveButton();
    }

    @Then("the user validates that appropriate error messages are displayed for each required field")
    public void the_user_validates_that_appropriate_error_messages_are_displayed_for_each_required_field() {
        productAndServicesNegative.validateErrorMessages();
    }

}
