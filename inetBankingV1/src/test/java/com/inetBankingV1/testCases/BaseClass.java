package com.inetBankingV1.testCases;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.inetBankingV1.utilies.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig read = new ReadConfig();
	
 
	public String baseUrl = read.getApplicationURL();
	public String username = read.getUserName();
	public String password = read.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moolya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		if(br.equals("chrome")) {
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		}
		
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\moolya\\eclipse-workspace\\inetBankingV1\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	
	@AfterClass
	public void closed() {
		driver.quit();
	}
}
