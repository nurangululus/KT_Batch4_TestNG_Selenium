package com.kraftechnologie.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.safaridriver().setup();

        WebDriver driver = new SafariDriver();

        driver.navigate().to("https://www.krafttechexlab.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        //close the driver with close() method
        //close the current tab
        driver.close();



        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.amazon.com");

        Thread.sleep(3000);

        //close the driver with the quit() method
        //close all the tabs
        driver1.quit();
    }
}
