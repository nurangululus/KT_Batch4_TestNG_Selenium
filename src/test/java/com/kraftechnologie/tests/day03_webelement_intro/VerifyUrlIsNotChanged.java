package com.kraftechnologie.tests.day03_webelement_intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlIsNotChanged {
    public static void main(String[] args) throws InterruptedException {

        /** Class Task 1
         * open the chrome browser
         * go to  https://www.krafttechexlab.com/login  page
         * click on login button
         * verify that url is not changed
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome"); //empty browser
        driver.get("https://www.krafttechexlab.com/login");


        String expectedURL= driver.getCurrentUrl();
        System.out.println("expectedURL = " + expectedURL);

        //click on login button
        WebElement loginBtn =driver.findElement(By.cssSelector("[type=\"submit\"]"));
        loginBtn.click();

        String actualURL=driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        if(expectedURL.equals(actualURL)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        Thread.sleep(5000);
        driver.close();


    }
}
