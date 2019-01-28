package com.farmrise.test;

import java.awt.dnd.DragGestureEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.farmrise.pom.HomePage_FarmRise;
import com.farmrise.utilities.ActionEngine;
import com.farmrise.utilities.MobileBaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class FarmRise extends MobileBaseClass {
	//private static  AndroidDriver<MobileElement> driver;
	HomePage_FarmRise hp=new HomePage_FarmRise();
	//@Test
	public void verify_MoreTab() throws Throwable
	{
		MobileBaseClass.logger=report.startTest("verify_MoreTab");
		hp.verifyMoreScreenTest(driver);
	}
	@Test
	public void verify_HomeTab() throws InterruptedException
	{

		MobileBaseClass.logger=report.startTest("verify_HomeTab");
		hp.verifyWeatherDetails();
	}
	

	


	
	
}
