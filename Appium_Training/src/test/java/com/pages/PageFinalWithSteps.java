package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClassFinal;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageFinalWithSteps  extends BaseClassFinal{
	public PageFinalWithSteps(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	AndroidElement pref;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	AndroidElement prefdep;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index=1]")
	AndroidElement layout1;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index=2]")
	AndroidElement layout2;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='android:id/edit']")
	AndroidElement name;
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	AndroidElement ok;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Example preference dependency']")
	AndroidElement exprefdep;
	
	
	public void LaunchApp() throws IOException, InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //pref.click();
		 // prefdep.click();
		 // layout1.click();
		 // layout2.click();
		  //name.sendKeys("Anubala");
		  //ok.click();
		  	
	}
	
	
	public void clickPreference() {
		pref.click();
	}
	public void clickPrefdepen() {
		 prefdep.click();
	}
	public void clickwifi() {
		layout1.click();
	}
	public void clickwifisettings() {
		layout2.click();
	}
	public void setname() {
		name.sendKeys("Anubala");
	}
	
	public void clickok() {
		ok.click();
	}
	
	public boolean verifyexpredep() {
		return exprefdep.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
}
