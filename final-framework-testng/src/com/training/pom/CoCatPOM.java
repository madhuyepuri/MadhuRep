package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoCatPOM 
{
	private WebDriver driver ; 
	
	public  CoCatPOM(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(name="search_term")
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/div/div/div[1]/form/div/input")
	private WebElement searchCourseCatalog;
	public void EnterTosearchCourseCatalog(String CourseName) 
	{
		this.searchCourseCatalog.sendKeys(CourseName);		
	
	}
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/div/div/div[1]/form/div/div/button")
	private WebElement searchButton;
	public void ClickOnSearchButton() 
	{
		this.searchButton.click();	
	
	}
	
	@FindBy(id="register")
	private WebElement alreadysubscribed;
	public String  getAlreadysubscribed() {
		return(this.alreadysubscribed.getText());		
	
	}
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[3]/div[2]/div/div[2]/div[4]/div/a")
	private WebElement subscribebutton;
	public void ClickonSubscribe() {
		this.subscribebutton.click();		
	
	}
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/a/img")
	private WebElement AddCatogory;
	public void ClickonAddCatogory() {
		this.AddCatogory.click();		
	
	}
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[3]/div/div/div[2]/div[1]/h4/a")
	private WebElement courseNmaelink;
	public void ClickoncourseNmaelink() {
		this.courseNmaelink.click();		
	
	}
	
	@FindBy(xpath="//*[@id='course-info-bottom']/div/div[2]/div[1]/div/div/a")
	private WebElement courseHomeButton;
	public void ClickoncourseHomeButton() {
		this.courseHomeButton.click();		
	
	}
	
	@FindBy(xpath="//*[@id='istooldesc_8278']")
	private WebElement projectLink;
	public void ClickonprojectLink() {
		this.projectLink.click();		
	
	}

	@FindBy(xpath="//*[@id='toolbar']/div/div/a/img")
	private WebElement homeIcon;
	public void ClickonhomeIcon() {
		this.homeIcon.click();		
	
	}
	
	@FindBy(xpath="//*[@id='post-105']/div/div/h3/a")
	private WebElement taskLink;
	public void ClickontaskLink() {
		this.taskLink.click();		
	
	}
	
	
	

}
