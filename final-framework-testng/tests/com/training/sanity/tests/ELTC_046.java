package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.CoCatPOM;


public class ELTC_046 extends LoginAsStudent 
{
	private static final WebElement UsericonClick = null;
	private static final String By = null;
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CoCatPOM courseCat;
	
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
		courseCat = new CoCatPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}
		
	@Test
	public void  ELTC_046() {
				
		loginPOM.sendUserName("reva");
		loginPOM.sendPassword("reva321");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		loginPOM.moveToUserIcon(Usericon, UsericonClick);
		loginPOM.ClickonCourseCatalog();
		
		//LoginAsStudent();
		String CourseName="MadhuCourse";
		courseCat.EnterTosearchCourseCatalog(CourseName);
		courseCat.ClickOnSearchButton();
		String exp="Already subscribed";
		String act=courseCat.getAlreadysubscribed();
		Assert.assertEquals(act, exp);
		
		courseCat.ClickoncourseNmaelink();
		courseCat.ClickoncourseHomeButton();
		courseCat.ClickonprojectLink();
		courseCat.ClickonhomeIcon();
		courseCat.ClickontaskLink();
		
		
	}
	
	
	
}

