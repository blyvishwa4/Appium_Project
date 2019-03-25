package trakeye;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartChrome {
	
	public AppiumDriver<MobileElement> driver;
	
	@Test
	public void test1() throws MalformedURLException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Panasonic P75");
		cap.setCapability("udid", "S4CQWWA699999999");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		cap.setCapability("browserName","Chrome");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Jars\\chromedriver.exe");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.get("http://www.google.com");
	}

}
