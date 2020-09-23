package com.pages;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClassFinal;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageFinal extends BaseClassFinal{
	public PageFinal(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Preference']")
	AndroidElement pref;
	@FindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	AndroidElement prefdep;
	@FindBy(xpath="//android.widget.LinearLayout[@index=1]")
	AndroidElement layout1;
	@FindBy(xpath="//android.widget.LinearLayout[@index=2]")
	AndroidElement layout2;
	@FindBy(xpath="//android.widget.EditText[@resource-id='android:id/edit']")
	AndroidElement name;
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	AndroidElement ok;
	
	
	public void appTest() throws IOException, InterruptedException {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  pref.click();
		  prefdep.click();
		  layout1.click();
		  layout2.click();
		  name.sendKeys("Anubala");
		  ok.click();
		  	
	}
	
	
	
	/*
	 * public static AndroidDriver<AndroidElement> setPreference(String devicetype)
	 * throws IOException, InterruptedException { AndroidDriver<AndroidElement>
	 * driver=capabilities(devicetype);
	 * 
	 * return driver;
	 * 
	 * }
	 */
	
	
	/*
	 * @AndroidFindBy(id="com.androidsample.generalstore:id/nameField") private
	 * WebElement nameField;
	 * 
	 * @AndroidFindBy(xpath="//*[@text='Female']") public WebElement femaleOption;
	 * // driver.findElement(By.id("android:id/text1")).click();
	 * 
	 * @AndroidFindBy(id="android:id/text1") private WebElement countrySelection;
	 * 
	 * public WebElement getNameField() {
	 * System.out.println("trying to find the Name field"); return nameField; }
	 * public WebElement getcountrySelection() {
	 * System.out.println("Selecting the option from dropdown"); return
	 * countrySelection; }
	 */
	

}
