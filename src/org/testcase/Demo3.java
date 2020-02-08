package org.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","E:\\work\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://google.com");
		

	}

}
