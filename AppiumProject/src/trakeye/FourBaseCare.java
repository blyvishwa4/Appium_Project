package trakeye;
//Mobile Automation
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class FourBaseCare {

	public AppiumDriver<MobileElement> driver;
	
	@Test
	public void Doctor() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Galaxy On5");
		cap.setCapability("udid", "S4CQWWA699999999");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("unlockType", "pin");
		cap.setCapability("unlockKey", "1926");
		
		cap.setCapability("appPackage", "com.tresbu.fourbasecare");
		cap.setCapability("appActivity", "com.tresbu.fourbasecare.activities.SplashActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("com.tresbu.fourbasecare:id/tvSignIn").click();
		driver.findElementById("com.tresbu.fourbasecare:id/etMobileNo").sendKeys("9535388882");
		driver.findElementById("com.tresbu.fourbasecare:id/et_password").sendKeys("cd@123");
		driver.findElementById("com.tresbu.fourbasecare:id/cbPasswordView").click();
		driver.findElementById("com.tresbu.fourbasecare:id/btnSignIn").click();
	}
}
