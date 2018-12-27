
// Programmer: Shamim Chowdhury
//  Website name : www.taxifare.us
package com.test;

import general.commonAPI.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
//
public class FacebookHome extends Base {

    @Test
    public void getTableData() throws InterruptedException {
        System.out.println( "\n \n ---------Test is Running-- shamim  10.46----------\n \n");
       String currentUrl =  webDriver.getTitle();
        System.out.print(" Title  "+currentUrl);
        Thread.sleep(1000);
    }

}