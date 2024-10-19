package LabTest;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import LabPages.Debit_Note_Final_Bill_Partial_Settlement;
import LabPages.Login;
import LabPages.OPD_registrationn;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;
public class hums 
{

	ATUTestRecorder recorder;
	//public static WebDriver driver=null;
	WebDriver driver;

	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	
	

	@Test(priority=1)

	public void TC_01_Generate_hums_pdf_record() throws InterruptedException, IOException, AWTException, ParseException 
	{

		LabPages.humspage vv=new LabPages.humspage(driver);
		vv.HumsFunc();


	}



	@BeforeTest

	public void startBrowser() throws ATUTestRecorderException, InterruptedException 
	{

		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
		
		

		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--disable-gpu"); // Disable GPU acceleration (optional)
        options.addArguments("--window-size=1920,1080"); // Optional for setting screen size

       
        
		//recorder = new ATUTestRecorder(".//Videos//","TC_01_Generate_hums_pdf_record "+dateFormat.format(date),false);
		//recorder.start();

	}


	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		//driver.quit();
		recorder.stop();

	}
}