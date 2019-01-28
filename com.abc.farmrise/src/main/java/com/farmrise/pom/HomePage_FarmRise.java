package com.farmrise.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.farmrise.utilities.ActionEngine;
import com.farmrise.utilities.MobileBaseClass;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;



public class HomePage_FarmRise extends MobileBaseClass{
	//public  AndroidDriver<MobileElement> driver;
ActionEngine act=new ActionEngine();	
//MobileElement lang=driver.findElement(By.xpath("//*[@text = 'English']"));
//MobileElement proceed =driver.findElement(By.xpath("//*[@text = 'Proceed']"));;
//MobileElement agreeBtn=driver.findElement(By.xpath("//*[@text = 'Agree and Continue']"));
//MobileElement okBtn=driver.findElement(By.xpath("//*[@text = 'OK']"));
//MobileElement moreTab=driver.findElement(By.xpath("//*[@text = 'More']"));
//MobileElement searchBtn=driver.findElementById("android:id/search_button");
//MobileElement searchText=driver.findElementById("android:id/search_src_text");
//public HomePage_FarmRise(AndroidDriver<MobileElement> driver){
//	super();
//	PageFactory.initElements(driver, this);
//}
	public void verifyMoreScreenTest(AndroidDriver<MobileElement> driver) throws Throwable {
		
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(500);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		if(driver.findElement(By.xpath("//*[@text = 'English']")).isEnabled())
		{
			driver.findElement(By.xpath("//*[@text = 'English']")).click();
		 MobileBaseClass.logger.log(LogStatus.PASS,"Language is selected Successfully");
		}else
		{
			 MobileBaseClass.logger.log(LogStatus.FAIL,"Language is NOT selected ");	
		}
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@text = 'Proceed']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@text = 'Proceed']")).click();
		 MobileBaseClass.logger.log(LogStatus.PASS,"Proceed Button is Clicked Successfully");
		}else
		{
			 MobileBaseClass.logger.log(LogStatus.FAIL,"Proceed Button is Not Clicked");	
		}
		
		if(driver.findElement(By.xpath("//*[@text = 'Agree and Continue']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@text = 'Agree and Continue']")).click();
		 MobileBaseClass.logger.log(LogStatus.PASS,"Agree And Proceed Button is Clicked Successfully");
		}else
		{
			 MobileBaseClass.logger.log(LogStatus.FAIL,"Agree And Proceed Button is Not Clicked");	
		}
		try
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@text = 'Drumstick']")).click();
			driver.findElement(By.xpath("//*[@text = 'Proceed']")).click();
			driver.findElement(By.xpath("//*[@text = 'Allow and Proceed']")).click();
			try
			{
			driver.findElement(By.xpath("//*[@text = 'OK']")).click();
			}catch(Exception e)
			{
				
			}
			try {
			driver.findElement(By.xpath("//*[@text = 'Allow']")).click();
			try {
				driver.findElement(By.xpath("//*[@text = 'OK']")).click();
			}catch(Exception e1){
				
			}
}catch(Exception e1){
				
			}
		}catch(Exception e)
		{
			
		}
  driver.findElementById("com.climate.farmrise:id/icon").click();
try {
	for(int i=0;i<4;i++)
	{
		driver.findElement(By.xpath("//*[@text = 'OK']")).click();
	}

}catch(Exception e)
{
	
}
//try {
//	driver.findElement(By.xpath("//*[@text = 'Allow']")).click();
//	try {
//		driver.findElement(By.xpath("//*[@text = 'OK']")).click();
//	}catch(Exception e1){
//		
//	}
//}catch(Exception e)
//{
//	
//}
driver.findElement(By.xpath("//*[@text = 'More']")).click();
Thread.sleep(5000);
//driver.findElementById("com.climate.farmrise:id/more_govtSchemes").click();
act.scrollAndClick(driver,"Government Schemes");

try {
	String moreschemesExp="Load More schemes";
	String moreschemesActual=act.scrollAndGetText(driver,"Load More schemes");
	Assert.assertEquals(moreschemesActual, moreschemesExp,"Load More schemes Button is Verified as expected");
}catch(Exception e)
{
	System.out.println("There is no Load More schemes Button is Present");
}

//driver.findElementById("android:id/search_button").click();
if(driver.findElementById("android:id/search_button").isDisplayed())
{
	driver.findElementById("android:id/search_button").click();
 MobileBaseClass.logger.log(LogStatus.PASS,"Search Button is Clicked Successfully");
}else
{
	 MobileBaseClass.logger.log(LogStatus.FAIL,"Search Button is Not Clicked");	
}
//driver.findElementById("android:id/search_src_text").sendKeys("scheme");
if(driver.findElementById("android:id/search_src_text").isDisplayed())
{
	driver.findElementById("android:id/search_src_text").sendKeys("scheme");
 MobileBaseClass.logger.log(LogStatus.PASS,"Scheme is written Search Box is Clicked Successfully");
}else
{
	 MobileBaseClass.logger.log(LogStatus.FAIL,"Scheme is NOT written Search Box");	
}
((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.ENTER);
	}
	
	public void verifyWeatherDetails() throws InterruptedException
	{
		
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(500);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		if(driver.findElement(By.xpath("//*[@text = 'English']")).isEnabled())
		{
			driver.findElement(By.xpath("//*[@text = 'English']")).click();
		 MobileBaseClass.logger.log(LogStatus.PASS,"Language is selected Successfully");
		}else
		{
			 MobileBaseClass.logger.log(LogStatus.FAIL,"Language is NOT selected ");	
		}
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@text = 'Proceed']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@text = 'Proceed']")).click();
		 MobileBaseClass.logger.log(LogStatus.PASS,"Proceed Button is Clicked Successfully");
		}else
		{
			 MobileBaseClass.logger.log(LogStatus.FAIL,"Proceed Button is Not Clicked");	
		}
		
		if(driver.findElement(By.xpath("//*[@text = 'Agree and Continue']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@text = 'Agree and Continue']")).click();
		 MobileBaseClass.logger.log(LogStatus.PASS,"Agree And Proceed Button is Clicked Successfully");
		}else
		{
			 MobileBaseClass.logger.log(LogStatus.FAIL,"Agree And Proceed Button is Not Clicked");	
		}
		try
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@text = 'Drumstick']")).click();
			driver.findElement(By.xpath("//*[@text = 'Proceed']")).click();
			driver.findElement(By.xpath("//*[@text = 'Allow and Proceed']")).click();
			try
			{
			driver.findElement(By.xpath("//*[@text = 'OK']")).click();
			}catch(Exception e)
			{
				
			}
			try {
			driver.findElement(By.xpath("//*[@text = 'Allow']")).click();
			try {
				driver.findElement(By.xpath("//*[@text = 'OK']")).click();
			}catch(Exception e1){
				
			}
}catch(Exception e1){
				
			}
		}catch(Exception e)
		{
			
		}
  driver.findElementById("com.climate.farmrise:id/icon").click();
try {
	for(int i=0;i<4;i++)
	{
		driver.findElement(By.xpath("//*[@text = 'OK']")).click();
	}

}catch(Exception e)
{
	
}
		if(driver.findElement(By.xpath("//*[@text = 'Access Weather Details']")).isEnabled())
		{
			driver.findElement(By.xpath("//*[@text = 'Access Weather Details']")).click();
		 MobileBaseClass.logger.log(LogStatus.PASS,"Access Weather Details is Taped Successfully");
		}else
		{
			 MobileBaseClass.logger.log(LogStatus.FAIL,"Access Weather Details is NOT Taped ");	
		}	
	}
}
