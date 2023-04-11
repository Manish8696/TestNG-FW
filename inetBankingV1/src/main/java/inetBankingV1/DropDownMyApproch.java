package inetBankingV1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownMyApproch {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		


		ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     ChromeDriver driver = new ChromeDriver(options);
	     driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	    
	     driver.get("https://jqueryui.com/selectmenu/");
	     js.executeScript("window.scrollBy(0,150)");
	     
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	     driver.switchTo().frame(iframe);
	     
	     Actions a=new Actions(driver);
	     WebElement frame = driver.findElement(By.xpath("//span[text()='Medium']"));
	     a.click(frame);
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
         a.sendKeys(Keys.ENTER).build().perform();
	     
	     WebElement frame1 = driver.findElement(By.xpath("//span[text()='jQuery.js']"));
	     a.click(frame1);
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
    	  a.sendKeys(Keys.ENTER).build().perform();
	     
	     Thread.sleep(500);
	     WebElement frame2 = driver.findElement(By.xpath("//span[text()='2']"));
	     a.click(frame2);
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ENTER).build().perform();
	      
	     WebElement frame3 = driver.findElement(By.xpath("//span[text()='Please pick one']"));
	     
	     
	     a.click(frame3);
         a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ENTER).build().perform();
	    
	}

}
