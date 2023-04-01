package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;

public LoginPage(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(name ="uid")
WebElement userName;

@FindBy(name ="password")
WebElement password;

@FindBy(name ="btnLogin")
WebElement clickon;

@FindBy(xpath="//*[text()='Log out']")
WebElement logout;

public void setUserName(String user) {
	userName.sendKeys(user);
}

public void setPassword(String pass) {
	password.sendKeys(pass);
	
}

public void clickOn() {
	clickon.click();
}
public void logout() {
	logout.click();
}
}
