package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginAsAdmin {
	private static final WebElement UsericonClick = null;
	private static final String By = null;
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AdminPOM AdminPOM;
	//private CoCatPOM CoCatPOM;
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
		//CoCatPOM = new CoCatPOM(driver)
	}
	
//	@AfterMethod
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//		driver.quit();
//	}
	public void LoginAsAdmin() throws InterruptedException{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		Thread.sleep(1000);
		//AdminPOM.ClickonHomePage();
		AdminPOM.ClickonCoursesCatogiries(driver);
		AdminPOM.ClickonAddCategory(driver);
		String category_code="BL";
		AdminPOM.Entercategorycode(driver, category_code);
		String categor_name="Blended Learning";
		AdminPOM.Entercategoryname(driver, categor_name);
		AdminPOM.ClickonAddCategorySubmit(driver);
		AdminPOM.VerifytheCatoryExists(driver);
		AdminPOM.ClickonAdministrationlink(driver);
		AdminPOM.ClickonACreateAcourselink(driver);
		String update_course_title="MadhuTesting";
		AdminPOM.EnterValueInupdate_course_title(driver, update_course_title);
		String visual_code="MadhuTestingCode";
		AdminPOM.EnterValueInvisualcode(driver, visual_code);
		String Teachers_name="maznoor";
		//AdminPOM.EnterValueInTeachers(driver, Teachers_name);
		//AdminPOM.ClickonCategorySelect(driver);
		String Category_Select="Blended Learning (BL)";
		AdminPOM.EnterValueInCategorySelect(driver, Category_Select);
		AdminPOM.Clickonupdate_course_submit(driver);
		
	
	
	}
	
}



