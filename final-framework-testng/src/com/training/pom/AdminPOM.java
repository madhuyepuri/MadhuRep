package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	
}
