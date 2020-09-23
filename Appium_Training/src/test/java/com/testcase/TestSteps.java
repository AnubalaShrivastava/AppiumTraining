package com.testcase;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.baseclasses.BaseClass;
import com.pages.Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestSteps extends BaseClass{

	public Page myPage;
	AndroidDriver<AndroidElement> driver;
	
	//public TestSteps(AndroidDriver<AndroidElement> driver) {
		//super(driver);
		// TODO Auto-generated constructor stub
	//}

	@Test
	public void testPref() throws MalformedURLException {
		
		//service=startServer();
		driver=myPage.setPreference("emulator");
		
	}
	
	
}
