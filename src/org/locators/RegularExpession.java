package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pacehr.techmahindra.com");
		//driver.findElement(By.cssSelector("input#user")).sendKeys("sfgsdfgdfg");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hb00431668");
		//driver.findElement(By.xpath("//input[contains(@id,'usern')]")).sendKeys("hb00431668");
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("hb00431668");
		//driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("aug#123");
		//driver.findElement(By.cssSelector("div.signInEnter")).click();
		driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("hb00431668");		
		

	}

}
