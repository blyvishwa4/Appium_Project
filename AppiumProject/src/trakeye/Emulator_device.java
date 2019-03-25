package trakeye;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Emulator_device {
	
	@Test
	public void Geny() throws MalformedURLException
	{
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("noReset", "true");
		cap.setCapability("fullReset", "false");
		cap.setCapability("deviceName", "192.168.249.102:5555");
		//cap.setCapability("udid", "192.168.249.102:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		WebDriver driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}

}
