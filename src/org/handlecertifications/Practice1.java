package org.handlecertifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  DesiredCapabilities ch=DesiredCapabilities.chrome();
  ch.acceptInsecureCerts();
  ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
  ChromeOptions c=new ChromeOptions();
  c.merge(ch);
  WebDriver driver=new ChromeDriver(c);
  
	}

}
