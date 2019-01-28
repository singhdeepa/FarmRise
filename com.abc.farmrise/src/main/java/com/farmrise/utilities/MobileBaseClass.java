package com.farmrise.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class MobileBaseClass 
{
	//protected static WebDriver driver;
	protected ExtentReports report;
	public static ExtentTest logger;
	public  AndroidDriver<MobileElement> driver;
	@BeforeSuite
	public void setupReport()
	{
		report=new ExtentReports(System.getProperty("user.dir")+"//Mobile_Reports//"+ActionEngine.getCurrentDateTime()+".html");
				//"/Users/deepa/Desktop/in.licious.appiumtest/Mobile_Reports/"+ActionEngine.getCurrentDateTime()+".html");
	}
	@AfterSuite
	public void generateReport()
	{
		report.flush();
	}
	
	@AfterMethod
	public void tearDownReport()
	{
		//driver.removeApp("com.licious");
		report.endTest(MobileBaseClass.logger);
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
		
	}
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException, InterruptedException {
	        
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    
	    capabilities.setCapability("platformName","android");
	    capabilities.setCapability("platformVersion","6.0");
	   
	    capabilities.setCapability("deviceName","Moto E");
	    capabilities.setCapability("device","T03850CEE4");
	    
	    capabilities.setCapability("autoGrantPermissions", true);
	    //capabilities.setCapability("noReset","true");
	    capabilities.setCapability("automationName","uiautomater2");
	    
	    capabilities.setCapability("appPackage","com.climate.farmrise");
	   
	    capabilities.setCapability("appActivity","com.climate.farmrise.SplashScreen");
	    		capabilities.setCapability("app", System.getProperty("user.dir")+"/Application/farmrise_latest.apk");
	    		capabilities.setCapability("autoAcceptAlerts", true);	
	    capabilities.setCapability("unicodeKeyboard", true);
	    capabilities.setCapability("resetKeyboard", true);
	  
	   
	
	    Thread.sleep(500);
	    driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    driver.resetApp();
	  //  driver.pressKeyCode(AndroidKeyCode.ENTER);
	}

	

	@AfterMethod
	public void afterMethod() {
		//driver.removeApp("com.climate.farmrise");
	}
	
}
