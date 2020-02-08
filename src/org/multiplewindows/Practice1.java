package org.multiplewindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
       driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[3]/a")).click();
       Set<String> ids= driver.getWindowHandles();
       Iterator<String> itr=ids.iterator();
       String parentid=itr.next();
       String childid=itr.next();
       driver.switchTo().window(childid);
       System.out.println(driver.getTitle());
       driver.switchTo().defaultContent();
       
	}
}
