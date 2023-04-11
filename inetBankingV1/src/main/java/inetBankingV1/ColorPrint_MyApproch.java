package inetBankingV1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ColorPrint_MyApproch {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     ChromeDriver driver = new ChromeDriver(options);
	     driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	     WebElement we = driver.findElement(By.xpath("//blockquote[@class='Example']/form[contains(text(),'My favourite colors are:')]"));
		  js.executeScript("arguments[0].scrollIntoView();", we);
		  
		  List <WebElement> wer = driver.findElements(By.xpath("//blockquote[@class='Example']/form"));
		  
		  for(WebElement rew : wer) {
			 System.out.println(rew.getText());
		  }
	     

	}

}
