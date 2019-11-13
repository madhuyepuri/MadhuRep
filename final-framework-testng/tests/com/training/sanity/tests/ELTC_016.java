package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_016 {

	private static final WebElement UsericonClick = null;
	private static final String By = null;
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private WebElement Usericon;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
//	@AfterMethod
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//		driver.quit();
//	}
	@Test
	public void validLoginTest() {
		loginPOM.sendUserName("reva");
		loginPOM.sendPassword("reva321");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		loginPOM.moveToUserIcon(Usericon, UsericonClick);
		System.out.println(loginPOM.Inboxlink());
		System.out.println(loginPOM.MyCertificateslink());
		System.out.println(loginPOM.logoutlink());		
		loginPOM.clickonLogOut();
	}
	
	
}
