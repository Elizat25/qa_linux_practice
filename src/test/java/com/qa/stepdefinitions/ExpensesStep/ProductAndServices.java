package com.qa.stepdefinitions.ExpensesStep;

import com.qa.pages.Expenses.ProductAndServicesP;
import com.qa.pages.SignUp.SignInNegativeP;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductAndServices {
    WebDriver driver = DriverHelper.getDriver();
    SignInNegativeP signInNegativeP = new SignInNegativeP(driver);
    ProductAndServicesP productAndServicesP = new ProductAndServicesP(driver);


    @Given("the user provides valid credentials and clicks the Sign In button")
    public void the_user_provides_valid_credentials_and_clicks_the_sign_in_button() throws InterruptedException {
        signInNegativeP.positiveSignInFunctionality(ConfigReader.readProperty("cashwise_email"), ConfigReader.readProperty("cashwise_password"));
    }

    @Then("the user is navigated to the Infographics page and validates the company name")
    public void the_user_is_navigated_to_the_infographics_page_and_validates_the_company_name() throws InterruptedException {

        signInNegativeP.validateTitleCompany();
    }

    @When("the user clicks the Expenses dropdown and selects the Products and Services option")
    public void the_user_clicks_the_expenses_dropdown_and_selects_the_products_and_services_option() throws InterruptedException {

        productAndServicesP.openProductAndServicesFromExpenses();
    }

    @When("the user is navigated to the Products and Services page")
    public void the_user_is_navigated_to_the_products_and_services_page() {

    }

    @When("the user validates and verifies the title {string}")
    public void the_user_validates_and_verifies_the_title(String string) {
        productAndServicesP.validatesProducts(ConfigReader.readProperty("actualMessage"));
    }

    @When("the user clicks Add Product and Services")
    public void the_user_clicks_add_product_and_services() {
        productAndServicesP.addProduct();
    }

    @When("the user provides the following information:name,price,service type,category,description,date")
    public void the_user_provides_the_following_information_name_price_service_type_category_description_date() throws InterruptedException {
        productAndServicesP.provideInformation();
    }

    @When("the user selects a Remind Before opt ion and clicks the Not Repeat box")
    public void the_user_selects_a_remind_before_opt_ion_and_clicks_the_not_repeat_box() {
        productAndServicesP.remindBeforeButtonAndNoRepeatBox();
    }

    @When("the user clicks the Save button")
    public void the_user_clicks_the_save_button() {
        productAndServicesP.saveButton();
    }

    @Then("the user validates that all entered information is correctly displayed in the Products and Services tab")
    public void the_user_validates_that_all_entered_information_is_correctly_displayed_in_the_products_and_services_tab() {
        productAndServicesP.validatesAllInformation();
    }

    @Then("the user deletes all information and validates that the list is empty")
    public void the_user_deletes_all_information_and_validates_that_the_list_is_empty() {
        productAndServicesP.deleteTheProduct();
    }


}
