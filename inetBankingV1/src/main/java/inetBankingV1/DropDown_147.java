package inetBankingV1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown_147 {
	
	public static void main(String [] args) throws Exception
	{
		

		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized"); 
    	WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://jqueryui.com/selectmenu/"); 
        js.executeScript("window.scrollBy(0,150)");  

        
        Actions a = new Actions(driver);
        
        WebElement demoFrame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(demoFrame);
        
        String xpathForSpeedDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[1]";     
        WebElement speedDropDown = driver.findElement(By.xpath(xpathForSpeedDropDown));
        
//       speedDropDown.click();
        a.click(speedDropDown);
        a.sendKeys(Keys.ENTER).build().perform(); 
        
        
        String xpathForFileDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[2]";     
        WebElement fileDropDown = driver.findElement(By.xpath(xpathForFileDropDown));
        
//        fileDropDown.click();
        a.click(fileDropDown);
        a.sendKeys(Keys.ARROW_DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform(); 
        
        
        String xpathForNumberDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[3]";     
        WebElement numberDropDown = driver.findElement(By.xpath(xpathForNumberDropDown));
        
//        numberDropDown.click();
        a.click(numberDropDown);
        a.sendKeys(Keys.ARROW_DOWN).build().perform();
        a.sendKeys(Keys.ARROW_DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform(); 
        
        
        String xpathForTitleDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[4]";     
        WebElement titleDropDown = driver.findElement(By.xpath(xpathForTitleDropDown));
        
//        titleDropDown.click();
        a.click(titleDropDown);
        a.sendKeys(Keys.ARROW_DOWN).build().perform();
        a.sendKeys(Keys.ARROW_DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform(); 
        
        
       
        
//        driver.quit();
             
		
		
	}

}