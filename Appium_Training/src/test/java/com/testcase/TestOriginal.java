package com.testcase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestOriginal {

	@Test
	public void capability() throws MalformedURLException {
		
		File apppath= new File("C:\\Users\\bala_\\Desktop\\Agama\\Appium\\original.apk");
		//File apppath= new File("C:\\Users\\bala_\\Downloads\\change2.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "demo-mobile");
		cap.setCapability(MobileCapabilityType.APP,apppath.getAbsolutePath() );
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		//driver.findElement(By.xpath("//android.widget.Image[@text='K02H113803']")).click();
		//driver.findElement(By.xpath("//android.widget.Image[@text='nOXvh11503']")).click();
		
	}
}
