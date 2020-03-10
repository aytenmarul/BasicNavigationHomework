package com.cbt.tests;

import com.cbt.utilities.BrowerFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NavigationTest {

    static WebDriver driver;
    public static void chromeTest() {

        driver = BrowerFactory.getDriver("chrome");

        driver.get("https://google.com");

        String title = driver.getTitle();

        driver.navigate().to("https://etsy.com");

        String title2 = driver.getTitle();

        driver.navigate().back();

        String title3 = driver.getTitle();

        StringUtility.verifyEqual(title, title3);

        driver.navigate().forward();

        String title4 = driver.getTitle();

        StringUtility.verifyEqual(title2, title4);
        driver.quit();
    }
    public static void firefoxTest() {

        driver = BrowerFactory.getDriver("firefox");

        driver.get("http://google.com");

        String title = driver.getTitle();

        driver.navigate().to("http://etsy.com");

        String title2 = driver.getTitle();

        driver.navigate().back();

        String title3 = driver.getTitle();

        driver.navigate().forward();

        String title4 = driver.getTitle();


        StringUtility.verifyEqual(title, title3);

        StringUtility.verifyEqual(title2, title4);


        driver.quit();


    }


    public static void edgeTest() {

        driver = BrowerFactory.getDriver("edge");

        driver.get("http://google.com");

        String title = driver.getTitle();

        driver.navigate().to("http://etsy.com");

        String title2 = driver.getTitle();

        driver.navigate().back();

        String title3 = driver.getTitle();

        driver.navigate().forward();

        String title4 = driver.getTitle();


        StringUtility.verifyEqual(title, title3);

        StringUtility.verifyEqual(title2, title4);


        driver.quit();

    }
    public static void main(String[] args) {

        chromeTest();

        firefoxTest();

        edgeTest();
    }

}



//    public static void main(String[] args) throws Exception {
//
//        WebDriverManager.chromedriver().version("79").setup();
//        WebDriver driver = new ChromeDriver();
//        Thread.sleep(3000);
//        driver.close();
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver1 = new FirefoxDriver();
//        Thread.sleep(3000);
//        driver.close();
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver2 = new EdgeDriver();
//        Thread.sleep(3000);
//        driver.close();
//    }
//}
//













//
//         //In selenium, everything starts from WebDriver interface'
//         //ChromeDriver extends RemoteWebDriver --> implements WebDriver
//         driver.get("http://google.com");//to open a website
//         Thread.sleep(3000);//for demo, wait 3 seconds
//         //method that return page title
//         //you can also see it as tab name, in the browser
//         String title = driver.getTitle();//returns <title>Some title</title> text
//         System.out.println("Title is..."+title);
//         driver.close();//to close browser
//         //browser cannot close itself
//         }
//         }
