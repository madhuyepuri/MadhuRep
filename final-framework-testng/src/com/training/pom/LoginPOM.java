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
	
	@FindBy(className="img-circle")
	public WebElement Usericon;
	
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/a/span[2]")
	public WebElement UsericonClick;
	
	@FindBy(id="logout_button")
	private WebElement logout;
	
	@FindBy(className="user-body")
	private WebElement linkOps;
	
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/ul/li[3]/a")
	private WebElement Inboxlink;
	
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/ul/li[4]/a")
	//*[@id="navbar"]/ul[2]/li[2]/ul/li[4]/a
	private WebElement MyCertificateslink;
	
	
	
	
	public void moveToUserIcon(WebElement Usericon, WebElement UsericonClick)
	{
//		this.Usericon=Usericon;
//		Actions a= new Actions(driver);
//		a.moveToElement(UsericonClick).build().perform();
		this.Usericon.click();
		//this.logout.click();
		
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
	public void clickonLogOut() {
		this.logout.click();
	}
	public String Inboxlink() {
		return (this.Inboxlink.getText());
	}
	public String MyCertificateslink() {
		return (this.MyCertificateslink.getText());
	}
	public String logoutlink() {
		return (this.logout.getText());
	}
	
	
	
}
