package com.inetBankingV1.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.LoginPage;

public class TC_Login001 extends BaseClass{
	
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		
		logger.info("enter username");
		
		lp.setPassword(password);
		
		logger.info("enter password");
		
		lp.clickOn();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

}
