package com.qa.pages.SignUp;

import com.utils.BrowserUtils;
import com.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInNegativeP {
    public SignInNegativeP(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[.='Sign in']")
    WebElement signInButton;

    @FindBy(css = "#email_input_text")
    WebElement email;

    @FindBy(css = "#password_input_text")
    WebElement password;


    @FindBy(xpath = "//div[@error='1']//p")
    WebElement errorInputMessage;


    @FindBy(xpath = "(//form/button)[2]")
    WebElement signInButton2;

    @FindBy(xpath = "//*[@id=\"header\"]/h2")
    WebElement titleOfTheCompany;


    public void clicksSignInButton() {
        signInButton.click();
    }

    // @Parameters({"errorEmailMessage", "errorPasswordMessage"})
    public void negativeSignInFunctionality1(String email, String password) {

        this.email.sendKeys(email);
        this.password.sendKeys(password);

    }

    public void clicksSignInButton2() {
        this.signInButton2.click();
    }

    public String errorMessage1() {
        return BrowserUtils.getText(errorInputMessage);//it will return the error message
    }

    public void validateTheErrorMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, BrowserUtils.getText(errorInputMessage));

    }

    public void positiveSignInFunctionality(String email, String password) throws InterruptedException {

        signInButton.click();
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        signInButton2.click();
        Thread.sleep(2000);
    }
    public void validateTitleCompany(){
        Assert.assertEquals(BrowserUtils.getText(titleOfTheCompany), ConfigReader.readProperty("cashwiseUser_businessName"));

    }
}
