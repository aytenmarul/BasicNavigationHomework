package com.cbt.utilities;

public class StringUtility {

    public  static void verifyEqual(String actual, String expected){

        if(expected.equals(actual)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }


    }
}
