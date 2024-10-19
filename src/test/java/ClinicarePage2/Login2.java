package ClinicarePage2;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Login2 
{
	WebDriver driver;

	//Finding locator for Password
	By tab1=By.id("tab1");
	By tab2=By.id("tab2");
	By tab3=By.id("tab3");
	By tab4=By.id("tab4");
	By tab5=By.id("tab5");
	By tab6=By.id("tab6");
	By tab7=By.id("tab7");
	By tab8=By.id("tab8");

	public Login2(WebDriver driver)
	{
		this.driver=driver;
	}

	public void login_Medcare2() throws InterruptedException, IOException 
	{
		//driver.manage().deleteAllCookies();
		//driver=new ChromeDriver();
		//driver.get("https://medcare-productqa.hatiintl.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(tab1).sendKeys("1");
		
		driver.findElement(tab2).sendKeys("0");
		
		driver.findElement(tab3).sendKeys("5");
	
		driver.findElement(tab4).sendKeys("7");
		
		driver.findElement(tab5).sendKeys("1");
		
		driver.findElement(tab6).sendKeys("0");
	
		driver.findElement(tab7).sendKeys("5");
	
		driver.findElement(tab8).sendKeys("7");

		//Thread.sleep(8000);

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShot//LoginSuccessfully.png"));


	}
	
	/*public void login_Medcare_2() throws InterruptedException, IOException, AWTException {
	    

	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(tab1).sendKeys("1");
	    driver.findElement(tab2).sendKeys("0");
	    driver.findElement(tab3).sendKeys("5");
	    driver.findElement(tab4).sendKeys("7");
	    driver.findElement(tab5).sendKeys("1");
	    driver.findElement(tab6).sendKeys("0");
	    driver.findElement(tab7).sendKeys("5");
	    driver.findElement(tab8).sendKeys("7");
	    
	    
	    //Assert(false);
	    
	    Thread.sleep(13000);
	    
	    
	    
	    
	}*/
}