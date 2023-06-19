package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioBtnIsSelected() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demo.aspnetawesome.com/");
       // Thread.sleep(2000);
        WebElement vegetablesRadio = driver.findElement(By.xpath("//div[text()='Vegetables']/../input"));
        System.out.println("vegetablesRadio.isSelected() = " + vegetablesRadio.isSelected());

        Assert.assertTrue(vegetablesRadio.isSelected(),"verify that \"vegetables\" radio is selected");

        /**
         * verify that legumes is NOT selected
         * click legumes
         * verify that legumes is selected
         * verify that vegetables is NOT selected
         */

        Thread.sleep(2000);
        driver.close();
    }
}
