package com.testcase;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TestClass {
	public static void main(String [] args) throws MalformedURLException {
		 // String device = "real device";
		  String device = "emulator";
			File apppath= new File("C:\\Users\\bala_\\Desktop\\Agama\\Appium\\original.apk");
			DesiredCapabilities cap=new DesiredCapabilities();
			if(device.equalsIgnoreCase("emulator")) {
				 cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Demo-Mobile");
				}
				else if(device.equalsIgnoreCase("real device")) {
				 cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
				}
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo-Mobile");
			cap.setCapability(MobileCapabilityType.APP,apppath.getAbsolutePath());
			URL url=new URL("http://localhost:4723/wd/hub");
			AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(url,cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			 driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click(); 
			  driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
			  driver.findElement(By.xpath("//android.widget.LinearLayout[@index=1]")).click();
			  driver.findElement(By.xpath("//android.widget.LinearLayout[@index=2]")).click(); 
			  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Anu");
			  driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			
		
	}

	

}
	


