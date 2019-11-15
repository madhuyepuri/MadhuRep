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
	
	
	
	

}
