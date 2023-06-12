package com.kraftechnologie.tests.day04_basic_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        WebElement example1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        example1.click();
        String actualText=driver.findElement(By.tagName("h3")).getText();
       // String actualText=driver.findElement(By.tagName("h4")).getText();

        String expectedText="Dynamically Loaded Page Elements";
       // String expectedText="Example 1: Element on page that is hidden";

        if(actualText.contains(expectedText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(2000);

        driver.navigate().back();

        driver.findElement(By.partialLinkText("rendered")).click();

        String actualText2 = driver.findElement(By.tagName("h4")).getText();
        String expectedText2="Example 2: Element rendered after the fact";


        if(actualText2.contains(expectedText2)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        Thread.sleep(2000);
        driver.close();

    }
}
