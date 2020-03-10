package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String>urls= Arrays.asList("https://lulugandgeorgia.com","https://wayfair.com/","https://walmart.com",
                "https://westelm.com");

        WebDriver driver = BrowerFactory.getDriver("chrome");
        for (String each : urls){
            driver.get(each);
            String title = driver.getTitle().replace(" ","").toLowerCase();
            for (int i = 0; i <title.length()-2 ; i++) {
                if(title.substring(i,i+3).equals("com")){
                    title=title.substring(0,i);
                }
            }
            String url = driver.getCurrentUrl();
            System.out.println(url.contains(title));
        }
        driver.close();
    }
}
