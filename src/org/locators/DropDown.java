package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		//driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		//driver.findElement(By.xpath("//*[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Select s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
		s.selectByIndex(2);
		
		WebDriverWait d=new WebDriverWait(driver,5);
		
		
	
	
		
		
		
		

	}

}
