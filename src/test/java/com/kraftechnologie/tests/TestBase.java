package com.kraftechnologie.tests;

import com.kraftechnologie.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
   protected WebDriver driver;
   protected Actions actions;
   protected WebDriverWait wait;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        actions=new Actions(driver);
        //driver.manage().window().maximize();
        wait=new WebDriverWait(driver,15);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
