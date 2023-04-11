package inetBankingV1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Try {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);

		driver.get("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		//Switching into iframe
		WebElement demoframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(demoframe);

		//Selecting speed
		WebElement speed= driver.findElement(By.xpath("//span[@id='speed-button']"));
		speed.click();
		System.out.println("Selecting speed as fast ");
		WebElement speedValue= speed.findElement(By.xpath("//div[@id='ui-id-4']"));
		speedValue.click();
		//Adding wait
		Thread.sleep(5000);
		//Using utility for scrolling down
//		seleniumUtils.scrolldown(driver);
		//Selecting title

		System.out.println("Selecting title as Mr.");
		WebElement titleDropDown= driver.findElement(By.xpath("//span[@id='salutation-button']"));
		titleDropDown.click();
		WebElement titleValue=driver.findElement(By.xpath("//div[@id='ui-id-7']"));
		titleValue.click();
		System.out.println("title clicked");

		//Selecting other dropdown
		Thread.sleep(3000);
		System.out.println("file dropdown");
		WebElement file=driver.findElement(By.xpath("//span[@id='files-button']"));
		file.click();
		//using action class for performing click operation
		Actions action = new Actions(driver);
	    System.out.println("selecting ui.jQuery.js file");
		WebElement fileoption=driver.findElement(By.xpath("//div[@id='ui-id-13']"));
		action.moveToElement(fileoption).click().perform();

		//Selecting number dropdown
		System.out.println("Number dropdown");
		Thread.sleep(3000);
		WebElement number=driver.findElement(By.id("number-button"));
		System.out.println("clicking and performing key actions");
		action.moveToElement(number).click().perform();
		action.sendKeys(Keys.ARROW_DOWN).click().perform();
		action.sendKeys(Keys.ARROW_DOWN).click().perform();                      

//		driver.quit();



	}

}