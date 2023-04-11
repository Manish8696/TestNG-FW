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
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		
			logger.info("Login test passed");
		
		
	}
@Test (dependsOnMethods={"loginTest"})
public void logout() throws InterruptedException {
	LoginPage lp1 = new LoginPage(driver);
	Thread.sleep(500);
	lp1.logout();
	logger.info("Logout");
//	Assert.fail("failing it");
}
}
