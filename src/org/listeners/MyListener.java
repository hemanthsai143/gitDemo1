package org.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyListener extends AbstractWebDriverEventListener {
	
	public void beforeNavigateBack(WebDriver driver) {
		
		System.out.println("Before navigating back");
	}
	
	public void afterNavigateBack(WebDriver driver)
	{
		System.out.println("After navigatig back");
	}
	
	public void beforeNavigateforward(WebDriver driver)
	{
		System.out.println("before navigating forward");
	}
	

}
