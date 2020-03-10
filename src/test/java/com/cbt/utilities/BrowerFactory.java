package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerFactory {

    public static WebDriver getDriver(String browser) {
        String osName = System.getProperty("os.name");
        if ((osName.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("safari")) ||
                (osName.equalsIgnoreCase("Mac OS X") && browser.equalsIgnoreCase("edge"))) {
            return null;
        }
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("safari")){
            return null;
        }
        System.out.println("Browser is not found!");
        return null;
    }
}























//            if (browser.equals("chrome")) {
//                WebDriverManager.chromedriver().setup();
//                return new ChromeDriver();
//            } else if (browser.equals("firefox")) {
//                WebDriverManager.chromedriver().setup();
//                //  return new FirefoxDriver();
//            } else {
//                //return null;
//            }
