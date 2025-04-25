package com.qa.pages.Expenses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class ProductAndServicesNegative {
    public ProductAndServicesNegative(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//p[@class='css-7ndbs7']")
    List<WebElement> errorMessages;

    public  void validateErrorMessages(){
        List<String> actualMessages= Arrays.asList("Product title cannot be empty","Price cannot be empty","Required field","Required field");
        for(int i=0;i<errorMessages.size();i++){
            Assert.assertEquals(errorMessages.get(i).getText(),actualMessages.get(i));
        }

    }
}
