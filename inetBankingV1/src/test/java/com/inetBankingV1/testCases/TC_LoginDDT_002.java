package com.inetBankingV1.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.LoginPage;
import com.inetBankingV1.utilies.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException{
	driver.get(baseUrl);
	
	logger.info("URL is opened");
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(user);
	logger.info("user name provided");
	lp.setPassword(pwd);
	logger.info("password provided");
	lp.clickOn();
	
	Thread.sleep(3000);
	
	if(isAlert()==true) {
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		logger.warn("invalid user");
	}
	else {
		Assert.assertTrue(true);
		logger.info("valid user");
		lp.logout();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	
}
public boolean isAlert() {
	try {
	driver.switchTo().alert();
	return true;
	}
	catch(NoAlertPresentException e) {
		return false;
	}
}


@DataProvider(name="LoginData")
String [][] getData() throws IOException{
	String path ="C:\\Users\\moolya\\git\\repository\\inetBankingV1\\src\\test\\java\\com\\inetBankingV1\\testData\\LoginData.xlsx";
	int rownum=XLUtils.getRowCount(path, "Sheet1");
	int colcount =XLUtils.getCellCount(path, "Sheet1",1);
	String logindata[][]= new String[rownum][colcount];
	
	for(int i=1;i<=rownum;i++) {
		for(int j=0;j<colcount;j++) {
			logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
		}
	}
	return logindata;
}
}
