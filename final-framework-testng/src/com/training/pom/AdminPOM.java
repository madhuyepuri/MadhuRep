package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AdminPOM 
{ 
	private WebDriver driver ; 
	public  AdminPOM(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


//@FindBy(xpath="//*[@id='navbar']/ul[1]/li[1]/a")
@FindBy(xpath="//*[contains(@title,'Homepage')]")
private WebElement HomePage;
public void ClickonHomePage(WebDriver driver)
{
	 this.HomePage.click();
}

@FindBy(xpath="//*[@id='tabs-2']/div/div[2]/div[2]/ul/li[5]/a")
private WebElement CoursesCatogiries;
public void ClickonCoursesCatogiries(WebDriver driver)
{
	 this.CoursesCatogiries.click();
}
//*[@id='cm-content']/div/div[2]/a/img

@FindBy(xpath="//*[@id='cm-content']/div/div[2]/a/img")
private WebElement AddCategory;
public void ClickonAddCategory(WebDriver driver)
{
	 this.AddCategory.click();
}


@FindBy(id="course_category_code")
private WebElement categorycode;
public void Entercategorycode(WebDriver driver, String category_code)
{
	 //this.AddCategory.clear();
	 this.categorycode.sendKeys(category_code);
}
@FindBy(id="course_category_name")
private WebElement categoryname;
public void Entercategoryname(WebDriver driver, String categor_name)
{
	 //this.categoryname.clear();
	 this.categoryname.sendKeys(categor_name);
}


@FindBy(id="course_category_submit")
private WebElement AddCategorySubmit;
public void ClickonAddCategorySubmit(WebDriver driver)
{
	 this.AddCategorySubmit.click();
}


@FindBy(xpath="\"//*[@id='cm-content']/div/table\"")
private WebElement CategoryTable;

@FindBy(xpath="//*[@id='cm-content']/div/table/tbody/tr[20]/td[1]/a")
private WebElement CreatedCategoryName;

public void VerifytheCatoryExists(WebDriver driver)
{
	String act=this.CreatedCategoryName.getText();
	Assert.assertEquals(act, "Blended Learning (BL)");
}


@FindBy(xpath="//*[@id='cm-content']/div/ul/li[1]/a")
private WebElement Administrationlink;
public void ClickonAdministrationlink(WebDriver driver)
{
	 this.Administrationlink.click();
}

@FindBy(xpath="//*[@id='tabs-2']/div/div[2]/div[2]/ul/li[2]/a")
private WebElement CreateAcourselink;
public void ClickonACreateAcourselink(WebDriver driver)
{
	 this.CreateAcourselink.click();
}

@FindBy(id="update_course_title")
private WebElement updatecoursetitle;
public void EnterValueInupdate_course_title(WebDriver driver, String update_course_title)
{
	 this.updatecoursetitle.sendKeys(update_course_title);
}

@FindBy(id="visual_code")
private WebElement visualcode;
public void EnterValueInvisualcode(WebDriver driver, String visual_code)
{
	 this.visualcode.sendKeys(visual_code);
}


@FindBy(xpath="//*[@id='update_course']/fieldset/div[4]/div[1]/span/span[1]/span/ul")
				//*[@id="update_course"]/fieldset/div[4]/div[1]/span/span[1]/span/ul
private WebElement Teachers;
public void EnterValueInTeachers(WebDriver driver, String Teachers_name) 
{	 this.Teachers.click();
	this.Teachers.clear();
	 this.Teachers.sendKeys(Teachers_name);
}
//*[@id="update_course"]/fieldset/div[3]/div[1]/div/button/div/div/div
//*[@id="update_course"]/fieldset/div[3]/div[1]/div/button/div/div/div
@FindBy(xpath="//*[@id='update_course']/fieldset/div[4]/div[1]/span/span[1]/span/ul")
private WebElement CategorySelectClick;
public void ClickonCategorySelect(WebDriver driver)
{    this.CategorySelectClick.click();
}

@FindBy(id="update_course_category_code")
private WebElement ValueCategorySelectClick;
public void EnterValueInCategorySelect(WebDriver driver, String Category_Select)
{    
   Select s= new Select(ValueCategorySelectClick);
	//s.selectByValue(Category_Select);
	s.selectByVisibleText(Category_Select);
}

@FindBy(id="update_course_submit")
private WebElement updatecoursesubmit;
public void Clickonupdate_course_submit(WebDriver driver)
{    this.updatecoursesubmit.click();
}
//-------for test case ELTC_048
@FindBy(xpath="//*[@id='tabs-1']/div/div[2]/div[2]/ul/li[2]/a")
private WebElement addAUser;
public void clickOnaddAUserLink(WebDriver driver) 
{
	this.addAUser.click();
}

@FindBy(id="firstname")
private WebElement firstName;
public void enterFirstName(WebDriver driver, String firstName) 
{
	this.firstName.sendKeys(firstName);
}
@FindBy(id="lastname")
private WebElement lastName;
public void enterLastName(WebDriver driver, String lastName) 
{
	this.lastName.sendKeys(lastName);
}
@FindBy(id="email")
private WebElement email;
public void enterEmail(WebDriver driver, String Email) 
{
	this.email.sendKeys(Email);
}
@FindBy(id="phone")
private WebElement phone;
public void enterPhoneNo(WebDriver driver, String Phone) 
{
	this.phone.sendKeys(Phone);
}

@FindBy(id="username")
private WebElement userName;
public void enterUserName(WebDriver driver, String UserName) 
{
	this.userName.sendKeys(UserName);
}

@FindBy(name="password[password_auto]")
private WebElement enterPwdRadioButton;
public void SelectPasswordRadioButton(WebDriver driver) 
{
	if (!this.enterPwdRadioButton.isSelected())
	{this.enterPwdRadioButton.click();}
}
@FindBy(id="password")
private WebElement password;
public void enterPassword(WebDriver driver, String Password) 
{
	
	this.password.sendKeys(Password);
}

@FindBy(xpath="//*[@id='user_add']/fieldset/div[10]/div[1]/div/button/div/div/div")
private WebElement profileClick;
public void clickOnProfile(WebDriver driver) 
{
	this.profileClick.click();
}

@FindBy(xpath="//*[@id='user_add']/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[1]/a/span")
private WebElement ClickonProfileName;
public void clickOnProfileName2(WebDriver driver) 
{
	this.ClickonProfileName.click();
}
//@FindBy(xpath="//*[@id='user_add']/fieldset/div[10]/div[1]/div/div/div[1]/input")

@FindBy(xpath="//*[@id='user_add']/fieldset/div[10]/div[1]/div/div/div[1]/input")
private WebElement profileDropdown;
public void selectValueForProfile(WebDriver driver, String Profile)
{    
   //Select s= new Select(profileDropdown);
	//s.selectByValue(Category_Select);
	//s.selectByVisibleText(Profile);
   this.profileDropdown.sendKeys(Profile);
}
@FindBy(name="submit")
private WebElement addButton;
public void clickOnaddButton(WebDriver driver) 
{
	this.addButton.click();
}

@FindBy(xpath="//*[@id='tabs-2']/div/div[2]/div[2]/ul/li[6]/a")
private WebElement addUsersToCourse;
public void addUsersToCourseLink(WebDriver driver) 
{
	this.addUsersToCourse.click();
}













}

