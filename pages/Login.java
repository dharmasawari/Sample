package com.ip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"loginButton\"]") WebElement clickLogin;
	@FindBy(how=How.XPATH, using="//*[@id=\"username\"]") WebElement username;
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]") WebElement password;
	@FindBy(how=How.XPATH, using="//*[@id=\"login\"]") WebElement login;


	public void clickLogin() {
		clickLogin.click();
	}
	
	public void setEmail(String user) {
		username.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		login.click();
	}
}


