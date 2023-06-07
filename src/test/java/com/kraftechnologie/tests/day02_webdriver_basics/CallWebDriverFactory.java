package com.kraftechnologie.tests.day02_webdriver_basics;

import com.kraftechnologie.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) throws InterruptedException {
        //TASK
        //go to "https://www.krafttechexlab.com" with chrome by using getDriver() method
        //verify that the url is "https://www.krafttechexlab.com/"

        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.krafttechexlab.com");
        String actualUrl = driver.getCurrentUrl();*/

        WebDriver driver = WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        String expectedUrl = "https://www.krafttechexlab.com/";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }
}
