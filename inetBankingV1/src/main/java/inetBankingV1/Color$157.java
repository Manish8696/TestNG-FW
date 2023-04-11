//package inetBankingV1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//
//public class Color$157 
//{
//	public static void main(String[] args) {
//		  
//		 ChromeOptions options = new ChromeOptions();
//	     options.addArguments("--remote-allow-origins=*");
//	     ChromeDriver driver = new ChromeDriver(options);
//	     
//	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//	     driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	     
//	        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//	        
//	        List<Integer> sel = new ArrayList<>();
//	        
//	        Random r = new Random();
//	        for (int i = 0; i < 3; i++) {
//	            int index;
//	            do {
//	                index = r.nextInt(checkboxes.size());
//	            } while (sel.contains(index));
//	            sel.add(index);
//	            checkboxes.get(index).click();
//	        }
//
//	     
////	     WebElement checkbox1 = driver.findElement(By.xpath("//div[1]/blockquote[1]/form/input[2]"));
////	     checkbox1.click();
////	    
////	    
////	     WebElement checkbox2 = driver.findElement(By.xpath("//div[1]/blockquote[1]/form/input[3]"));
////	     checkbox2.click();
////	     
////	     
////	     WebElement checkbox3 =  driver.findElement(By.xpath("//input[@value='purple']"));
////	     checkbox3.click();
//	     
//	     
////	     driver.close();
//	}
//
//}
package inetBankingV1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class Color$157 {
	public static void main(String[] args) throws IOException {
		  
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     ChromeDriver driver = new ChromeDriver(options);
	     
	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	     driver.manage().window().maximize();
	     
	     WebElement checkbox1 = driver.findElement(By.xpath("//div[1]/blockquote[1]/form/input[2]"));
	     checkbox1.click();
	  
	    
	     WebElement checkbox2 = driver.findElement(By.xpath("//div[1]/blockquote[1]/form/input[3]"));
	     checkbox2.click();
	     
	     
	     WebElement checkbox3 =  driver.findElement(By.xpath("//input[@value='purple']"));
	     checkbox3.click();
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;  
	     js.executeScript("window.scrollBy(0, 300)"); 
	     
	     TakeScreenshot(driver, "C:\\Users\\moolya\\git\\repository\\inetBankingV1\\ScreenShots\\ScreenShotstest1.png");
	 
	     driver.close();
	}
	public static void TakeScreenshot(WebDriver webdriver,String fileWithPath)
	        throws IOException
	    {
	       
			TakesScreenshot driver = (TakesScreenshot) webdriver;
			
			// Creating instance of File
	        File File = ((TakesScreenshot)driver )
	                        .getScreenshotAs(OutputType.FILE);
	        
	 
	        File DestFile=new File(fileWithPath);

            //Copy file at destination
	        java.io.File SrcFile = File;
          FileUtils.copyFile(SrcFile, DestFile);
	    }
}