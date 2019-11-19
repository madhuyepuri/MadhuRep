package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.pom.AddUsersToPagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_048  {
		
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
	private AddUsersToPagePOM AddUsersToPagePOM;

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
		AddUsersToPagePOM= new AddUsersToPagePOM(driver);
	}
	
//	@AfterMethod
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//		driver.quit();
//	}
	
	@Test
	public void ELTC_048() throws InterruptedException{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		//Thread.sleep(1000);
		AdminPOM.clickOnaddAUserLink(driver);
		AdminPOM.enterFirstName(driver, "maznoor");
		AdminPOM.enterLastName(driver, "mehadi");
		AdminPOM.enterEmail(driver, "manzoor@gmail.com");
		String Phone="9876543210";
		AdminPOM.enterPhoneNo(driver, Phone);
		AdminPOM.enterUserName(driver, "manzoor");
		AdminPOM.SelectPasswordRadioButton(driver);
		AdminPOM.enterPassword(driver, "manzoor");
		
		AdminPOM.clickOnProfile(driver);
		Thread.sleep(1000);
		AdminPOM.clickOnProfileName2(driver);
		Thread.sleep(2000);
		String Profile="Trainer";
		//AdminPOM.selectValueForProfile(driver, Profile);
		AdminPOM.clickOnaddButton(driver);
		
		
		AdminPOM.ClickonAdministrationlink(driver);
		AdminPOM.addUsersToCourseLink(driver);
		String userName="      1 Teacher (teacher1)          ";
		AddUsersToPagePOM.selectItemFromUserList(driver, userName);
		String courseName="             (ASWE) qww         ";
		AddUsersToPagePOM.selectItemFromCourseList(driver, courseName);
		//AddUsersToPagePOM.selectItemFromUserListByFirstVal(driver);
		//AddUsersToPagePOM.selectItemFromCourseListByFirstVal(driver);
		AddUsersToPagePOM.ClickonAddToTheCoursesButton(driver);
		String act="The selected users are subscribed to the selected course";
		Assert.assertEquals(AddUsersToPagePOM.userCourseConifrmText(driver), act);
	}
}
