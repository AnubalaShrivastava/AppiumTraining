package com.baseclasses;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass {
	public static AndroidDriver<AndroidElement> Capability(String device) throws MalformedURLException {
		
		File apppath = new File("C:\\Users\\bala_\\Desktop\\Agama\\Appium\\original.apk"); 
    	DesiredCapabilities cap = new DesiredCapabilities();
		if(device.equalsIgnoreCase("emulator")) {
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Demo-Mobile");
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		}
		else if(device.equalsIgnoreCase("real device")) {
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		}
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
// Next two line  code is not necessary here I am repeating
		
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo-Mobile");
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		 
		//cap.setCapability(MobileCapabilityType.APP,apppath.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		URL url=new URL("http://localhost:4723/wd/hub");
		
		//System.out.println(device);
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
		/*
		 * cap.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
		 * //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,
		 * AutomationName.APPIUM);
		 * cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,
		 * AutomationName.APPIUM); cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
		 * MobilePlatform.ANDROID); //cap.setCapability("chromedriverExecutable",
		 * "C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win"
		 * ); cap.setCapability(MobileCapabilityType.APP, apppath.getAbsolutePath());
		 * 
		 * 
		 * //URL url = new URL("http://127.0.0.1:4723/wd/hub"); URL url=new
		 * URL("http://localhost:4723/wd/hub");
		 * 
		 * AndroidDriver<AndroidElement> driver = new
		 * AndroidDriver<AndroidElement>(url,cap);
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); return
		 * driver;
		 */
}

	

}
