package com.steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.baseclasses.BaseClassFinal;
import com.pages.PageFinal;
import com.pages.PageFinalWithSteps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TestSteps extends  BaseClassFinal {
	PageFinalWithSteps myPage;
	@Given("I have the app")
	public void i_have_the_app() throws IOException, InterruptedException {
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 myPage = new PageFinalWithSteps(driver);
		 myPage.LaunchApp(); 
	   
	}

	@Then("I click the preferences")
	public void i_click_the_preferences() {
		myPage.clickPreference();
	   
	    
	}

	@Then("I click the preference dependencies")
	public void i_click_the_preference_dependencies() {
		myPage.clickPrefdepen();
	}

	@Then("I check the wifi  option")
	public void i_check_the_wifi_option() {
		myPage.clickwifi();
	}

	@Then("I click te wifi settings")
	public void i_click_te_wifi_settings() {
		myPage.clickwifisettings();
	    
	}

	@Then("I enter user name")
	public void i_enter_user_name() {
		myPage.setname();
	   
	}

	@Then("click on ok")
	public void click_on_ok() {
		myPage.clickok();
		service.stop();
	    
	}

	@Then("I should be successfully able to finish setting")
	public void i_should_be_successfully_able_to_finish_setting() {
		//service.stop();
		//Assert.assertEquals(true,myPage.verifyexpredep());
	}

}
