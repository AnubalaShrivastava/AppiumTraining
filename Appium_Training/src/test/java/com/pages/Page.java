package com.pages;

import java.net.MalformedURLException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Page extends BaseClass{
	
	public Page(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Preference']")
	AndroidElement pref;
	AndroidElement prefdep;
	@FindBy(xpath="//android.widget.LinearLayout[@index=1]")
	AndroidElement layout1;
	@FindBy(xpath="//android.widget.LinearLayout[@index=2]")
	AndroidElement layout2;
	@FindBy(xpath="//android.widget.EditText[@resource-id='android:id/edit']")
	AndroidElement name;
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	AndroidElement ok;
	
	
	public static AndroidDriver<AndroidElement>  setPreference(String devicetype) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capability(devicetype);
		
		return driver;
		
	}
	

}
