package trakeye;

import static org.testng.Assert.assertNotNull;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Vibrant {
	
	public AppiumDriver<MobileElement> driver;
	
	@Test
	public void Login() throws InterruptedException, IOException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability("noReset", "true");
		//cap.setCapability("fullReset", "false");
		cap.setCapability("deviceName", "Galaxy On5");
		cap.setCapability("udid", "S4CQWWA699999999");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1.1");
		
//		cap.setCapability("appPackage", "com.android.calculator2");
//		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
//		cap.setCapability("appPackage", "com.agent.trakeye.tresbu.trakeyeagent");
//		cap.setCapability("appActivity", "com.agent.trakeye.tresbu.trakeyeagent.activities.LoginActivity");
//		
		cap.setCapability("appPackage", "com.tresbu.fourbasecare");
		cap.setCapability("appActivity", "com.tresbu.fourbasecare.activities.SplashActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.findElementById("com.tresbu.fourbasecare:id/spinner_user_type").click();
//		
//		driver.findElementByXPath("//android.widget.TextView[@text='I AM A PATIENT']").click();
//		
		driver.findElementById("com.tresbu.fourbasecare:id/tvSignIn").click();
		
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SIGN IN\")").click();
//		AndroidElement list = (AndroidElement) driver.findElement(By.id("com.tresbu.fourbasecare:id/viewPager"));
//		MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//                                + "new UiSelector().text(\"26th July 2018\"));"));
//		assertNotNull(listGroup.getLocation());
//		listGroup.click();
		driver.findElementById("com.tresbu.fourbasecare:id/btn_list_of_patients").click();
		driver.findElementById("com.tresbu.fourbasecare:id/fabAddPatientDetails").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Enter Patient Name\")").sendKeys("xyz");
		driver.findElementById("com.tresbu.fourbasecare:id/etEmail").sendKeys("xyz@yopmail.com");
		driver.findElementById("com.tresbu.fourbasecare:id/etMobileNo").sendKeys("9880436742");
		driver.hideKeyboard();
		driver.findElementById("com.tresbu.fourbasecare:id/iv_calendar").click();
		//driver.findElementByAccessibilityId("01 February 2000").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"OK\")").click();
		driver.findElementById("com.tresbu.fourbasecare:id/tvSelectHospital").click();
		driver.findElementById("com.tresbu.fourbasecare:id/name").click();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int starty=(int)(size.height*0.80);
		System.out.println(starty);
		int endy=(int)(size.height*0.20);
		System.out.println(endy);
		int startx=size.width/2;
		System.out.println(startx);
		AndroidElement list = (AndroidElement) driver.findElementByClassName("android.widget.ScrollView");
		MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
		                          + "new UiSelector().class(\"android.widget.Spinner\"));"));

//		driver.findElementById("android:id/date_picker_year").click();
//		AndroidElement list = (AndroidElement) driver.findElementByXPath("//android.widget.ListView/android.widget.TextView");
//		MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//                                + "new UiSelector().text(\"2025\"));"));
//		List<MobileElement> Year = driver.findElementsByXPath("//android.widget.ListView/android.widget.TextView");
//		int s = Year.size();
//		System.out.println(s);
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"2025\")").click();
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Click here to select start time\")").click();
//		driver.findElementByXPath("//android.widget.NumberPicker[@index='0']").sendKeys("13");
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"13\")").click();
//		driver.findElementById("com.tresbu.fourbasecare:id/selected_clinic").click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.findElementById("com.tresbu.fourbasecare:id/iv_calendar").click();
//		driver.findElementByAccessibilityId("28 February 2019").click();
//		driver.findElementById("android:id/button1").click();
//		driver.findElementById("com.tresbu.fourbasecare:id/spinner_consultation_purpose").click();
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Diagnosis\")").click();
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"OK\")").click();
//		driver.navigate().back();

//		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(f, new File("E:\\Selenium\\Selenium Script\\Screenshot4.jpg"));
		
		//driver.findElementByAccessibilityId("Upcoming").click();
	     
		
//		driver.findElementById("com.agent.trakeye.tresbu.trakeyeagent:id/etUserName").sendKeys("nihal.s");
//		driver.findElementById("com.agent.trakeye.tresbu.trakeyeagent:id/etPassword").sendKeys("Trak@123");
//		driver.hideKeyboard();
		//driver.findElementById("com.agent.trakeye.tresbu.trakeyeagent:id/btLogin").click();
		//driver.findElementByXPath("//android.widget.Button[@text='Login']").click();

	}

}
