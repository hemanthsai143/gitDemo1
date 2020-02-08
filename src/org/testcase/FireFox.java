package org.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
        driver.navigate().to("https://yahoo.com");
        driver.close();
        
        
		
		
	}

}
