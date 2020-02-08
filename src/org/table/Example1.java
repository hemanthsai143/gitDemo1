package org.table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21251/ind-vs-wi-4th-odi-windies-tour-of-india-2018");
		 WebElement table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		 int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms]div:nth-child(3)")).size();
		 System.out.println(rowcount);
	for(int i=0;i<count;i++)
	{
	System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms] div:nth-child(3)")).get(i).getText());
	}
	
	driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	}

}
