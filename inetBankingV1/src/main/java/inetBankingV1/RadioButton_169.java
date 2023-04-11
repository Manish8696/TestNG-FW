package inetBankingV1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;




public class RadioButton_169 {
	public static void main(String[] args) throws InterruptedException {
		
		
		 //Initializing the webdriver 
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     ChromeDriver driver = new ChromeDriver(options);
	     
	     
	     //Redirecting to the web URL
	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;  
	     js.executeScript("window.scrollBy(0, 1400)"); 
	     

	     WebElement radiobutton= driver.findElement(By.xpath("//input[@type='radio'][2]"));
	     radiobutton.click();
	     boolean selectState = radiobutton.isEnabled();	     
	     if (selectState == false) {
	    	 radiobutton.click();
			}
	     
	     Assert.assertEquals(true, selectState);
	     
	     Thread.sleep(3000);
	 
	     driver.close();
	}
	
}
