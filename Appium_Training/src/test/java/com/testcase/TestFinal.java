package com.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.baseclasses.BaseClassFinal;
import com.pages.PageFinal;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestFinal extends BaseClassFinal{
	
	@Test
	public void callApp() throws IOException, InterruptedException {
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFinal myPage = new PageFinal(driver);
		myPage .appTest();
		//service.stop();
		
	}

}
