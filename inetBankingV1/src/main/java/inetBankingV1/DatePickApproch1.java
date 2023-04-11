package inetBankingV1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickApproch1 {
	
 public static void main(String[] args) throws Exception {
	System.out.println("Enter date : ");
	Scanner s = new Scanner(System.in);
	String Date = s.nextLine();
	System.out.println("Enter month in words : ");
	String Month = s.nextLine();
	System.out.println("Enter year (YYYY) : ");
	String Year = s.nextLine();
	s.close();


	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
    driver.get("https://jqueryui.com/datepicker/#buttonbar");
    WebElement calendarFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));        
    driver.switchTo().frame(calendarFrame);
    driver.findElement(By.id("datepicker")).click();
    
    while(true) {
    	String s2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
    	String s1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
    	
    	if(Month.equalsIgnoreCase(s2)  && Year.equalsIgnoreCase(s1))
    		break;
    	else
    		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    }
    List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
    
    
    
    for(WebElement date : dates)
    {
    	if(date.getText().equals(Date))
    	{
    		date.click();
    	}
    }
	
}

}
	


