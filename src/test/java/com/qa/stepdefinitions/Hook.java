package com.qa.stepdefinitions;

import com.utils.BrowserUtils;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;


public class Hook {
    public WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setup() {
        driver.get(ConfigReader.readProperty("cashWise_url"));
    }

    @After
    public void tearDown(Scenario scenario) {
        BrowserUtils.getScreenShotForCucumber(driver, scenario);
        DriverHelper.quit();
    }
}
