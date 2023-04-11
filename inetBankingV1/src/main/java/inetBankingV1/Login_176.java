package inetBankingV1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_176 {
	public static void main(String [] args) throws Exception
	{
				
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized");
       
    	WebDriver driver = new ChromeDriver(options);
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://hms.techcanvass.co/");  
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        
        WebElement loginTextBox= driver.findElement(By.xpath("//input[@id='txtUserName']"));   
        loginTextBox.sendKeys("Pradnya");
        
        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='txtPassword']")); 
        passwordTextBox.sendKeys("1994");
        
        WebElement staySignedIn = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='chkstaysignedin']")));
       

        //WebElement staySignedIn = driver.findElement(By.xpath("//input[@id='chkstaysignedin']")); 
        staySignedIn.click();    
        
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='LoginButton']")); 
        loginButton.click();
        
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
        
        
        Thread.sleep(2000);
        driver.quit();

	}
}