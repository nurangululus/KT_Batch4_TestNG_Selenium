package com.kraftechnologie.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        //selenium is ready to talk with chrome
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        //navigate() is another method that takes us to the target website
        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(3000);

        //getting back
        driver.navigate().back();

        Thread.sleep(3000);

        //going forward
        driver.navigate().forward();

        Thread.sleep(3000);

        //refresh the page
        driver.navigate().refresh();
    }

}
