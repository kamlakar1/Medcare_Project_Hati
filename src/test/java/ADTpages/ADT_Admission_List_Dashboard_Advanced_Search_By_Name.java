package ADTpages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ADT_Admission_List_Dashboard_Advanced_Search_By_Name 
{
	WebDriver driver=null;
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADT=By.xpath("//span[contains(text(),'ADT')]");
	By AdmissionDashboard=By.cssSelector("a[ng-reflect-router-link='admission-dashboard-new']");
	
	//Advanced Search
	By AdvancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By NameClick=By.cssSelector("input[ng-reflect-placeholder='Patient Name']");
	//Search
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");
	public void ADTDashboardAdmissionListAdvancedSearch_By_Name(String NamePar) throws InterruptedException, IOException 
	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		//ADT
		Thread.sleep(3000);
		driver.findElement(ADT).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(10000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(AdmissionDashboard).click();
		
		Thread.sleep(2000);
		
		//Click on Advanced Search
		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick).click();
		Thread.sleep(3000);
		driver.findElement(NameClick).sendKeys(NamePar);
		
		Thread.sleep(3000);
		driver.findElement(SearchClick).click();
		
	}
	public ADT_Admission_List_Dashboard_Advanced_Search_By_Name (WebDriver driver)
	{
		this.driver=driver;
	}
}
