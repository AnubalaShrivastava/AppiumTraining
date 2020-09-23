package com.testcase;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.baseclasses.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestChromeBrowser extends BaseClass{
	
	@Test
	public void basicTest() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= Capability("emulator");
		driver.get("https://www.facebook.com/");
		//"chrome://inspect/#devices” in chrome browser
		
		//driver.findElement(By.id("m_login_email")).sendKeys("myname@gmail.com");
		driver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys("dkhfdkh");
		driver.findElement(By.xpath("//[@id='m_login_password']"));
		driver.findElement(By.xpath("//[@name='login']"));

		
	}

}
