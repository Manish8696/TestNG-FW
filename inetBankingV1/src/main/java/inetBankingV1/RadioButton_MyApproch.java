package inetBankingV1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton_MyApproch {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//create an instance of web driver interface
	    WebDriver driver;
	    //creating obj of chrome driver class
	    driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	   
		/*
		 * // call scrolldown utility SeleniumUtils.scrollDown(driver);
		 */
	    WebElement RadioButton = driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]//input[1]"));
 		
		
		  // Scrolling down the page till the element is found 
	      JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", RadioButton);
		  
		  Thread.sleep(2000);
		  
		  if(RadioButton.isSelected()) {
			  System.out.println("already selected ");
		  }
		  
		  else {
			  RadioButton.click();
		  }
	 		
	   
		//driver.close();
	}

}