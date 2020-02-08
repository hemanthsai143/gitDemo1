package Miscelleniious;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenshotsExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		ScreenshotUtlitity.captureScreenshot(driver,"google");
		driver.get("https://facebook.com");
		ScreenshotUtlitity.captureScreenshot(driver,"google1");
		
	}

}
