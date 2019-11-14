package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePOM {
	private WebDriver driver;
	
	public  EditProfilePOM(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"profileCollapse\"]/div/ul/li[5]/a")
	private WebElement editProfileLink;
	public void clickonEditProfile()
	{
		this.editProfileLink.click();
	}
	
	@FindBy(id="profile_password0")
	private WebElement pwd;
	public void enterPassword(String password)
	{
		this.pwd.clear();
		this.pwd.sendKeys(password);
	}
	
	@FindBy(id="password1")
	private WebElement newpwd;
	public void newPassword(String password)
	{
		this.newpwd.clear();
		this.newpwd.sendKeys(password);
	}
	
	
	@FindBy(id="profile_password2")
	private WebElement cnfpwd;
	public void confirmPassword(String password)
	{
		this.cnfpwd.clear();
		this.cnfpwd.sendKeys(password);
	}
	
	@FindBy(id="profile_apply_change")
	private WebElement save;
	public void saveChanges()
	{
		this.save.click();
	}
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/div[1]")
	private WebElement Textmsg;
	public String TextMsg()
	{
		return this.Textmsg.getText();
	}
	

}
