package org.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class UsingNavigateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		EventFiringWebDriver es=new EventFiringWebDriver(driver);
		MyListener ls=new MyListener();
		es.register(ls);
		es.get("https://google.com");
		es.get("https://facebook.com");
		System.out.println("before navigating back");
	 es.navigate().back();
	 System.out.println("After navigating");
	}

}
