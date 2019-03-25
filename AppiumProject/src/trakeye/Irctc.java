package trakeye;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;

public class Irctc {
	
	public AppiumDriver<MobileElement> driver;
	
	@Test
	public void Ticket() throws MalformedURLException, Exception 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Panasonic P75");
		cap.setCapability("udid", "S4CQWWA699999999");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		//Thread.sleep(5000);
		cap.setCapability("appPackage", "cris.org.in.prs.ima");
		//Thread.sleep(5000);
		cap.setCapability("appActivity", "cris.org.in.ima.activities.IRCTCConnectActivity");
		cap.setCapability("noReset", "true");
//		cap.setCapability("appWaitActivity", "com.apollo.android.home.HomeScreenActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementById("cris.org.in.prs.ima:id/rl_train_ticket").click();
		driver.findElementById("cris.org.in.prs.ima:id/et_valid_pin").sendKeys("1926");
		driver.findElementById("cris.org.in.prs.ima:id/tv_login").click();
		driver.findElementById("cris.org.in.prs.ima:id/Name").click();
		driver.findElementById("cris.org.in.prs.ima:id/fromStn_code").click();
		driver.findElementById("cris.org.in.prs.ima:id/tv_search_text").sendKeys("SBC");
		driver.findElementById("cris.org.in.prs.ima:id/tv_station_code").click();
		driver.findElementById("cris.org.in.prs.ima:id/toStn_code").click();
		driver.findElementById("cris.org.in.prs.ima:id/tv_search_text").sendKeys("DLI");
		driver.findElementById("cris.org.in.prs.ima:id/tv_station_code").click();
		driver.findElementById("cris.org.in.prs.ima:id/journey_date").click();
		
        driver.findElementByAccessibilityId("23 March 2019").click();
		driver.findElementById("android:id/button1").click();
		driver.findElementById("cris.org.in.prs.ima:id/tv_search").click();
		AndroidElement list = (AndroidElement) driver.findElementByXPath("//android.widget.FrameLayout");
		MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"DURONTO EXPRESS\"));"));//DURONTO EXPRESS TATA YPR EXP
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SAMPARK KRANTI\")").click();//SAMPARK KRANTI BANGALORE EXP
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SL\")").click();
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));  
		
		//driver.findElementByXPath("//android.widget.RelativeLayout[@index='6']/android.widget.TextView[@index='0']").click();
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Plan My Journey\")").click();
		
	}


}
