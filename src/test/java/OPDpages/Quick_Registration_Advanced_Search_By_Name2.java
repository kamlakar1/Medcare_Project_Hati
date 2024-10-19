package OPDpages;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Quick_Registration_Advanced_Search_By_Name2 
{
	WebDriver driver=null; 
	public Quick_Registration_Advanced_Search_By_Name2(WebDriver driver) 
	{
		this.driver=driver;

	}
	By advancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//Quick Registration
	By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

	//Basic Information
	//for all search same xpath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	//Gender
	By Genderclick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Genderselectvalue=By.xpath("//span[contains(text(),'FEMALE')]");
	//MRN Field
	By MRNFieldClick=By.cssSelector("input[ng-reflect-name='patientName']");
	//search Button
	By SearchButtonClick=By.cssSelector("button[ng-reflect-message='Search']");
	//Tariff
	By Tariffclick12=By.cssSelector("mat-select[aria-labelledby='mat-select-value-55']");
	By Tariffselect12=By.xpath("//span[contains(text(),'Self Tariff')]");	

	//Add Payer Button
	By AddPayerButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");

	//Payer Type Click
	By PayerTypeClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/mat-select/div/div[1]");
	By PayerTypeSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Payer
	By PayerCLick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[3]/mat-select/div/div[1]"); 
	By PayerSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[4]/span");

	//Tariff2
	By Tariff22Click=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[4]/mat-select/div/div[1]");
	By Tariff22Selopt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//Policy number
	By PolicyNoClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[9]/input");

	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	//Referral Details

	public void Quick_Registration_Advanced_Search_name(String namePar) throws InterruptedException, IOException 
	{

		WebDriverWait wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		WebElement mainmenu1 = wait.until(ExpectedConditions.elementToBeClickable(mainmenu));
		mainmenu1.click();
		WebElement OPDMenu1 = wait.until(ExpectedConditions.elementToBeClickable(OPDMenu));
		OPDMenu1.click();
		
		
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  Thread.sleep(20000);
		WebElement overforopdslide11 = wait.until(ExpectedConditions.elementToBeClickable(SideBarMenu));
		//overforopdslide11.act.
		// WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide11).build().perform();
		WebElement RegistrationMenu1 = wait.until(ExpectedConditions.elementToBeClickable(RegistrationMenu));
		RegistrationMenu1.click();

		//driver.findElement(RegistrationMenu).click();
		WebElement QuickRegistrationClick1 = wait.until(ExpectedConditions.elementToBeClickable(QuickRegistrationClick));
		QuickRegistrationClick1.click();
		//driver.findElement(QuickRegistrationClick).click();

		Thread.sleep(5000);
		if(driver.getPageSource().contains("Personal Information")) 
		{
			System.out.println("Quick Registration page has been launched successfully"); 
		} else 
		{
			System.out.println("Quick Registration page failed"); 
		}
		WebElement advancedSearchClick1 = wait.until(ExpectedConditions.elementToBeClickable(advancedSearchClick));
		advancedSearchClick1.click();
		//driver.findElement(advancedSearchClick).click();

		//Adding MRN IN MRN field
		WebElement MRNFieldClick1 = wait.until(ExpectedConditions.elementToBeClickable(MRNFieldClick));
		//driver.findElement(MRNFieldClick).sendKeys(MRNPar);
		MRNFieldClick1.sendKeys(namePar);
		//Clicking on search button
		WebElement SearchButtonClick1 = wait.until(ExpectedConditions.elementToBeClickable(SearchButtonClick));
		SearchButtonClick1.click();
		//Clicking on Gender
		//	Thread.sleep(1000);
		//	driver.findElement(Genderclick).click();
		//	Thread.sleep(1000);
		//	driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		//Thread.sleep(1000);
		//	driver.findElement(Genderselectvalue).click();
/*
		//Adding payer clicking on plus button
		WebElement AddPayerButtonClick1 = wait.until(ExpectedConditions.elementToBeClickable(AddPayerButtonClick));
		AddPayerButtonClick1.click();

		//Payer Type
		WebElement PayerTypeClick1 = wait.until(ExpectedConditions.elementToBeClickable(PayerTypeClick));
		PayerTypeClick1.click();
		WebElement AllDropDownSearch1 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch1.sendKeys("I");
		//driver.findElement(AllDropDownSearch)
		WebElement PayerTypeSelOpt1 = wait.until(ExpectedConditions.elementToBeClickable(PayerTypeSelOpt));
		PayerTypeSelOpt1.click();
		//driver.findElement(PayerTypeSelOpt).click();

		//Payer
		WebElement PayerCLick1 = wait.until(ExpectedConditions.elementToBeClickable(PayerCLick));
		PayerCLick1.click();
		WebElement AllDropDownSearch2 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch2.sendKeys("A");
		//.findElement(AllDropDownSearch)
		WebElement PayerSelOpt1 = wait.until(ExpectedConditions.elementToBeClickable(PayerSelOpt));
		PayerSelOpt1.click();

		//Policy number
		WebElement PolicyNoClick1 = wait.until(ExpectedConditions.elementToBeClickable(PolicyNoClick));
		PolicyNoClick1.sendKeys("23698");
		//driver.findElement(PolicyNoClick)

		//Selecting Tariff second
		WebElement Tariff22Click1 = wait.until(ExpectedConditions.elementToBeClickable(Tariff22Click));
		Tariff22Click1.click();
		//driver.findElement(Tariff22Click).click();
		WebElement AllDropDownSearch3 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch3.sendKeys("Insurance Tariff");
		//driver.findElement(AllDropDownSearch)
		WebElement Tariff22Selopt1 = wait.until(ExpectedConditions.elementToBeClickable(Tariff22Selopt));
		Tariff22Selopt1.click();
		//driver.findElement(Tariff22Selopt).click();

		//Selecting Tariff
		WebElement Tariffclick121 = wait.until(ExpectedConditions.elementToBeClickable(Tariffclick12));
		Tariffclick121.click();
		//Thread.sleep(3000);
		//driver.findElement(Tariffclick12).click();
		WebElement AllDropDownSearch44 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch44.sendKeys("Self Tariff");

		//driver.findElement(AllDropDownSearch)
		//Thread.sleep(2000);
		WebElement Tariffselect123 = wait.until(ExpectedConditions.elementToBeClickable(Tariffselect12));
		Tariffselect123.click();
		//driver.findElement().click();


		//Clicking on save button
		WebElement Saveclick1 = wait.until(ExpectedConditions.elementToBeClickable(Saveclick));
		Saveclick1.click();
		//driver.findElement(Saveclick).click();

		//Clicking on OK Button
		WebElement Saveconfirm1 = wait.until(ExpectedConditions.elementToBeClickable(Saveconfirm));
		Saveconfirm1.click();
		//	driver.findElement(Saveconfirm).click();

		Thread.sleep(3000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShots//QuickRegistrationadvancedSearch_By_MRN.png"));


		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		WebElement EncounterListClick1 = wait.until(ExpectedConditions.elementToBeClickable(EncounterListClick));
		EncounterListClick1.click();
		//	driver.findElement(EncounterListClick).click();
		Thread.sleep(5000);
		WebElement ptname=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]"));
		String regptname=ptname.getText();

		System.out.println("Patient name"+ptname);

		if(driver.getPageSource().contains(regptname)) 
		{
			System.out.println(regptname+"Patient has been created"); 
		} else 
		{
			System.out.println("Encounter page not open"); 
		}
		Thread.sleep(2000);
		driver.quit();
	
	*/
	}
	}




