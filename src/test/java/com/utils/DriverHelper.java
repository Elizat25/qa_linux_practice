package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverHelper {
    private static WebDriver driver;

    private DriverHelper() {
    }

//    private static WebDriver createChromeDriver(boolean isHeadless) {
//        ChromeOptions options = new ChromeOptions();
//        if (isHeadless) {
//            options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
//        }
//        return new ChromeDriver(options);
//    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.readProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
        return driver;

    }


    public static void quit() {
        driver.quit();
        driver = null;
    }
}
