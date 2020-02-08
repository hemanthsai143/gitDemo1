package Miscelleniious;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtlitity {

	
	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{ 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./screenshots/"+screenshotName+".png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		
	}
}
