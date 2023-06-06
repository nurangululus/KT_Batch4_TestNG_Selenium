package com.kraftechnologie.tests.day01_automationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        //make selenium ready to talk with Chrome
        WebDriverManager.chromedriver().setup();

        //create a driver object
        //driver --> represent a empty browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.krafttechnologie.com");

        //how to maximize window
        driver.manage().window().maximize();

        //how to get title
        System.out.println("driver.getTitle() = " + driver.getTitle());


        String actualTitle = driver.getTitle();
        String expectedTitle = "Kraft Technologie | Yazılım ve Bilişim Eğitimleri – Uzaktan Canlı Eğitim";

        //check if the actual and expected values match or not
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }
}
