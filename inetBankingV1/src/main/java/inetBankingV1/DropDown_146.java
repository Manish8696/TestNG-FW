package inetBankingV1;



import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class DropDown_146 {
	 public static void main(String[] args) throws InterruptedException {
	  
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     ChromeDriver driver = new ChromeDriver(options);
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     driver.get("https://jqueryui.com/selectmenu/");
			js.executeScript("window.scrollBy(0,250)");

	     driver.manage().window().maximize();
	     WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	     driver.switchTo().frame(iframe);
	     
	     Actions a = new Actions(driver);
	     
	     WebElement selectspeed = driver.findElement(By.xpath("//span[@class='ui-selectmenu-text']"));
	     a.moveToElement(selectspeed).click();
	    a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ENTER).build().perform();
	     
	     String xpathForFileDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[2]";     
	     WebElement fileDropDown = driver.findElement(By.xpath(xpathForFileDropDown));
	     a.moveToElement(fileDropDown).click();
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ENTER).build().perform();
	     
	     String xpathForNumberDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[3]";     
	     WebElement numberDropDown = driver.findElement(By.xpath(xpathForNumberDropDown));
	     a.moveToElement(numberDropDown).click();
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ENTER).build().perform();
        
	     
	     String xpathForTitleDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[4]";     
	     WebElement titleDropDown = driver.findElement(By.xpath(xpathForTitleDropDown));
	     a.click(titleDropDown);
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ARROW_DOWN).build().perform();
	     a.sendKeys(Keys.ENTER).build().perform();
	     
//	     driver.quit();
	 }
}