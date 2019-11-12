package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='form-login_submitAuth']")
	private WebElement loginBtn; 
	
	@FindBy(linkText="My certificates")
	private WebElement Mycertificates; 
	
	@FindBy(linkText="Inbox")
	private WebElement InboxLink;
	
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/a/span[2]")
	private WebElement Usericon;
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/a/span[2]")
	private WebElement UsericonClick;
	
	@FindBy(id="logout_button")
	private WebElement logout;
	
	
	
	
	public void moveToUserIcon(WebElement Usericon, WebElement UsericonClick)
	{
		this.Usericon=Usericon;
		Actions a= new Actions(driver);
		a.moveToElement(Usericon).build().perform();
		driver.findElement((By) this.UsericonClick).click();
		
	}
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
