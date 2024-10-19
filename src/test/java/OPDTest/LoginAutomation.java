package OPDTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ADTTest.ConfigReader;
import LabPages.Billing_prereq;
import LabPages.OPD_registrationn;
import LabPages.humspage;
import OPDpages.Login;
import OPDpages.Medcare_Registeration;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {

	ATUTestRecorder recorder;
	private ConfigReader configReader;
	
	//public static WebDriver driver=null;
	WebDriver driver;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		


		// Setup ChromeDriver
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
	
		// URL of the login page
		String url = "https://clinicare-uat.ums.edu.my/Clinicare/#/";

		
		// Number of login attempts
		int attempts = 2;

		for (int attempt = 1; attempt <= attempts; attempt++) {
			try {
				
				
				
				//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				driver.get(url);
				LabPages.humspage vv=new LabPages.humspage(driver);
				vv.HumsFunc();
				
				//Login
				
			/*
				driver.get(url);
				Login jj = new Login(driver);
				jj.login_Medcare_1();
    			driver.manage().window().maximize();
    			Thread.sleep(2000);
    			
    			// Register patient			
    			OPD_registrationn kk = new OPD_registrationn(driver);
    			kk.OPD_REGISTRATIONmm_1();
    			
    		
    			Thread.sleep(2000);
    			
              // Bliing add service 
    		/*
    			Billing_prereq ll = new Billing_prereq(driver);
    			ll.Billing();
    			driver.quit();
    			Thread.sleep(2000);
    		*/
			driver.quit();
			
			//driver.quit();
			
    			
			} 
			
			catch (Exception e) {
				System.out.println("An error occurred on attempt " + attempt + ": " + e.getMessage());
			}
		}

	
	}
	
	}
	
	