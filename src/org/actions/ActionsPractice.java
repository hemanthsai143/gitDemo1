package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		Actions a=new Actions(driver);
		//a.moveToElement(element).build().perform();
	    WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	    a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	    a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();    
	    a.moveToElement(searchbox).contextClick();
	    
	    		
	    		

	}

}
