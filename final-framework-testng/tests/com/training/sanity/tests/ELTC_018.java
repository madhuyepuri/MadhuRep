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
import com.training.pom.EditProfilePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_018 {
	private static final WebElement UsericonClick = null;
	private static final String By = null;
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AdminPOM AdminPOM;
	private EditProfilePOM EditProfilePOM;
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
		AdminPOM = new AdminPOM(driver);
		EditProfilePOM = new EditProfilePOM(driver);
	}
	
//	@AfterMethod
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//		driver.quit();
//	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		Thread.sleep(1000);
		AdminPOM.ClickonHomePage(driver);
		EditProfilePOM.clickonEditProfile();
		EditProfilePOM.enterPassword("reva123");
		EditProfilePOM.newPassword("reva321");
		EditProfilePOM.confirmPassword("reva321");
		EditProfilePOM.saveChanges();
		String txtval=EditProfilePOM.TextMsg();
		Assert.assertEquals("The current password is incorrect", txtval);
	}

}
