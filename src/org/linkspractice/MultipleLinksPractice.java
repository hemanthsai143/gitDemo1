package org.linkspractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinksPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("https://www.optus.com.au");
		int size=driver.findElements(By.tagName("a")).size();
       System.out.println(size);
       WebElement footerdriver=driver.findElement(By.id("global_footer"));
      int size1=footerdriver.findElements(By.tagName("a")).size();
       System.out.println(size1);
       //driver.findElement(By.linkText("Contact Us")).click();
       for(int i=0;i<4;i++)
       {
    	   String clickonlink=Keys.chord(Keys.SHIFT,Keys.ENTER);
    	   footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
    	 
       }
       Set<String> abc= driver.getWindowHandles();
 	  Iterator<String> itr=abc.iterator();
    	   while(itr.hasNext())
    	   {
    		   driver.switchTo().window(itr.next());
    		  System.out.println(driver.getTitle());
    	   
    	  
    	  
    	 
    	   
       }
       driver.quit();
       
	}

}
