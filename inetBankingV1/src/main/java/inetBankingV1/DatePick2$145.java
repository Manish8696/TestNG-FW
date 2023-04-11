package inetBankingV1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePick2$145 {
	
    public static void main(String[] args) throws Exception {
    	
    	String dateInput="24-april-2023";
    	
    	String dateNo=dateInput.split("-")[0];    	
    	String month=dateInput.split("-")[1];
    	String year=dateInput.split("-")[2];


    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
       
    	WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://jqueryui.com/datepicker/#buttonbar");        
        
               
        WebElement calendarFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));        
        driver.switchTo().frame(calendarFrame);
        
        driver.findElement(By.id("datepicker")).click();
        
        
        while(true) {
        	String s = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	String s1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	
        	if(month.equalsIgnoreCase(s)  && year.equalsIgnoreCase(s1))
        		break;
        	else
        		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        
        
        
       List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
       
      
        
        for(WebElement date : dates)
        {
        	if(date.getText().equals(dateNo))
        	{
        		date.click();
        	}
        }
            
        
//       Thread.sleep(2000);
//        
//       driver.quit();

    	
    }


}
