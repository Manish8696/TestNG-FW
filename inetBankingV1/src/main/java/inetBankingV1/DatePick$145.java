package inetBankingV1;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePick$145 {
	
    public static void main(String[] args) throws Exception {
    	
//    	String dateInput="9-Mar-2023";
//    	
//    	String dateNo=dateInput.split("-")[0];    	
//    	String month=dateInput.split("-")[1];
//    	String year=dateInput.split("-")[2];


    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
       
    	WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://jqueryui.com/datepicker/#buttonbar");    
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
               
//        WebElement calendarFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));        
        driver.switchTo().frame(0);
        
        driver.findElement(By.id("datepicker")).click();
        
        
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        
        Random r = new Random();
        int index = r.nextInt(dates.size());
        WebElement sel = dates.get(index);
        sel.click();
        
//        for(WebElement date : dates)
//        {
//        	if(date.getText().equals(dateNo))
//        	{
//        		date.click();
//        	}
//        }
            
        
//       Thread.sleep(2000);
//        
//       driver.quit();

    	
    }


}
