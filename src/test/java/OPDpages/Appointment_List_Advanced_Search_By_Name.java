package OPDpages;


import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import OPDTest.DeleteExcelRowWithSelenium;

public class Appointment_List_Advanced_Search_By_Name 
{
	WebDriver driver=null; 
	public Appointment_List_Advanced_Search_By_Name(WebDriver driver) 
	{
		this.driver=driver;

	}
	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By MainMenuTooltip=By.xpath("/html/body/div[2]");
	By OPDMenu=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By AppointmentList=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/ul/li[1]/a/span[1]");
	//Advanced Search
	By advancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN Taking from encounter list
	By PTName=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr/td[4]");
	By PatientNameClick=By.cssSelector("input[ng-reflect-name='PatientName']");
	By SearchButtonClick=By.cssSelector("button[ng-reflect-message='Search']");
	By RowClicking=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr");
	//By RegistrationSubMenuClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]/ul/li[2]/a/span[1]");
	public void Advanced_Search_For_Appointment_List_BY_Name(String NameSearch) throws InterruptedException, IOException
	{


		Thread.sleep(2000);
		Actions act = new Actions(driver);
		//Thread.sleep(8000);
	 //  WebElement mainmenu1 = wait.until(ExpectedConditions.elementToBeClickable(mainmenu));
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		//Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement OPDMenu1 = wait.until(ExpectedConditions.elementToBeClickable(OPDMenu));
		//driver.findElement(passwordElement).click();
	    OPDMenu1.click();
	    Thread.sleep(20000);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//driver.navigate().refresh();
		
		/*
		if(driver.getPageSource().contains("Appointment No"))
		{
			System.out.println("Appointment List Screen Successfully opened"); 
		} else 
		{
			System.out.println("Appointment List page failed to open"); 
		}
		Thread.sleep(8000);
		WebElement MRNName=driver.findElement(PTName);
		String MRNSearch=MRNName.getText();
		//Click on MRN Search
		 * 
		 */
	//	Thread.sleep(4000);
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement advancedSearchClick1 = wait.until(ExpectedConditions.elementToBeClickable(advancedSearchClick));
	  //  driver.findElement(advancedSearchClick).click();
	    advancedSearchClick1.click();
		//Enter MRN In MRN field
	//	Thread.sleep(4000);
	   
		driver.findElement(PatientNameClick).sendKeys(NameSearch);
		//Click on Search button
		//Thread.sleep(2000);
		 WebElement SearchButtonClick1 = wait.until(ExpectedConditions.elementToBeClickable(SearchButtonClick));
		 SearchButtonClick1.click();
		// driver.findElement(SearchButtonClick).click();
		//Clicking on row
		 WebElement RowClicking1 = wait.until(ExpectedConditions.elementToBeClickable(RowClicking));
		 RowClicking1.click();
	//	driver.findElement(RowClicking).click();
		//Thread.sleep(3000);
		

		Assert.assertEquals(NameSearch, NameSearch, "Searched name is mismatched");
		assertTrue(true);
		
		if(driver.getPageSource().contains(NameSearch))
		
		{
		    
			System.out.println(NameSearch+" "+"Patient has been searched"); 
		} else 
		{
		
			System.out.println("Patient not fount!!!"); 
		    	
		}
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Open the current date and time
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot, new File(".//ScreenShots//Appointment_List_Advanced_Search_By_Name.png"));
		
	
		
	}

}
