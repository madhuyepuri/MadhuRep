package com.training.pom;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddUsersToPagePOM 
{

	private WebDriver driver ; 
	public  AddUsersToPagePOM(WebDriver driver) 
	{
				this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='UserList[]']")
	private WebElement userList;
	public void selectItemFromUserList(WebDriver driver, String userName)
	{
		Select s= new Select(userList);

		java.util.List<WebElement> users= s.getOptions();
		
		for(WebElement user :users) 
		{
			String listValue=user.getText();
			System.out.println("Value Selected is1: "+listValue);
			if(listValue.equals(userName)) {
				s.selectByVisibleText(userName);
				//s.deselectByIndex(0);
				System.out.println("Value Selected is2: "+listValue);
				break;
			}
		}
	}
	
	//select[@name='CourseList[]']
	
	@FindBy(xpath="//select[@name='CourseList[]']")
	private WebElement courseList;
	public void selectItemFromCourseList(WebDriver driver, String courseName)
	{
		Select s= new Select(courseList);

		java.util.List<WebElement> courses= s.getOptions();
		
		for(WebElement course :courses) 
		{
			String listValue=course.getText();
			System.out.println("Value Selected is3: "+listValue);
			if(listValue.equals(courseName)) {
				s.selectByVisibleText(courseName);
				//s.deselectByIndex(0);
				System.out.println("Value Selected is4: "+listValue);
				break;
			}
		}
	}
	
	public void selectItemFromUserListByFirstVal(WebDriver driver)
	{
		Select s= new Select(userList);

		java.util.List<WebElement> users= s.getOptions();
		
		for(WebElement user :users) 
		{
			String listValue=user.getText();
			//System.out.println("Value Selected is1: "+listValue);
			//if(listValue.equals(userName)) {
				//s.selectByVisibleText(userName);
				s.deselectByIndex(1);
				System.out.println("Value Selected is2: "+listValue);
				break;
			//}
		}
	}
	
	public void selectItemFromCourseListByFirstVal(WebDriver driver)
	{
		Select s= new Select(courseList);

		java.util.List<WebElement> courses= s.getOptions();
		
		for(WebElement course :courses) 
		{
			String listValue=course.getText();
			//System.out.println("Value Selected is3: "+listValue);
			//if(listValue.equals(courseName)) {
				//s.selectByVisibleText(courseName);
				s.deselectByIndex(1);
				System.out.println("Value Selected is4: "+listValue);
				break;
			//}
		}
	}
	@FindBy(xpath="//*[@id='cm-content']/div/form[2]/table/tbody/tr[2]/td[2]/button")
	private WebElement AddToTheCoursesButton;
	public void ClickonAddToTheCoursesButton(WebDriver driver)
	{
		this.AddToTheCoursesButton.click();
	}
	
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[3]")
	private WebElement userCourseConifrmText;
	public String  userCourseConifrmText(WebDriver driver)
	{
		return(this.userCourseConifrmText.getText());
	}
	
	
}
