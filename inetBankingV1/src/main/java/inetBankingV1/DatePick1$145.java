package inetBankingV1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePick1$145 {
	
    public static void main(String[] args) throws Exception {


    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
       
    	WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://jqueryui.com/datepicker/#buttonbar");   
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
               
        WebElement calendarFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));        
        driver.switchTo().frame(calendarFrame);
        driver.findElement(By.id("datepicker")).click();
        
        driver.findElement(By.xpath("//a[@data-date='9']")).click();

    	
    }


}
