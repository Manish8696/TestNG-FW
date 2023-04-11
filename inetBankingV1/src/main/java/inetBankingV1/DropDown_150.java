package inetBankingV1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown_150 {

	public static void main(String[] args) throws InterruptedException {
		
	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);
				
		//Get URL
		driver.get("https://jqueryui.com/selectmenu/");
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				
		//inspect the frame and switch to it
		WebElement demoFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(demoFrame);
			
		//Select speed as Medium 
		WebElement speed = driver.findElement(By.id("speed-button"));
		speed.click();
		
		//Implement Actions class to use mouse or keyboard actions
		Actions act = new Actions(driver);
		act.click(speed);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();

		Thread.sleep(500);
		
		//Select a title 
		WebElement titlefield = driver.findElement(By.id("salutation-button"));
	titlefield.click();
		
		
		act.click(titlefield);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(500);
		//Select files 
		WebElement files = driver.findElement(By.id("files-button"));
		
		act.click(files);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(500);
		//Select number 
		WebElement number = driver.findElement(By.id("number-button"));
		
		act.click(number);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
//		driver.close();
	
	
	}

}