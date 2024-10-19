package BillingPages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Contract_Advance_Search_Page {
	
	
	WebDriver driver=null;
	
	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
	
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");
	
	//ContractIcon
	By ContractIcon=By.cssSelector("a[ng-reflect-router-link='contract']");

	

	//AdvanceSearch
	By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	
	//PayerFilterClick
	By PayerFilterClick=By.cssSelector("mat-select[ng-reflect-name='payerId']");
	
	//PayerFilterSel
	By payerFilterSel=By.xpath("//span[contains(text(),'AIA Berhad')]");
	
	//SearchButton
	By SearchButton=By.cssSelector("button[ng-reflect-message='Search']");
	
	//Collapse
	By Collapse=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	
	//DescriptionFilter
	By DescriptionFilter=By.cssSelector("input[ng-reflect-name='desc']");
	
	//StatusFilter
	By StatusFilter=By.cssSelector("mat-select[ng-reflect-name='status']");
	
	//StatusSel
	By StatusSel=By.xpath("//mat-option//span[contains(text(),'Active')]");
	
	

	
	
	public Contract_Advance_Search_Page (WebDriver driver)

	{
		this.driver=driver;

	}

	
  public void ContractAdvanceSearch (String DescriptionPar) throws InterruptedException 
  {
	  
	  //Menu
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		
		//Thread.sleep(2000);
		Thread.sleep(4000);
		driver.findElement(BillingMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBar);
		act.moveToElement(overforopdslide1).build().perform();

	  
		//BillDisappear
		Thread.sleep(2000);
		driver.findElement(BillDisappear).click();
		
		//ContractIcon
		Thread.sleep(2000);
		driver.findElement(ContractIcon).click();
		
		

		//AdvanceSearch
		Thread.sleep(5000);
		driver.findElement(AdvanceSearch).click();
		
		//PayerFilterClick
		Thread.sleep(5000);
		driver.findElement(PayerFilterClick).click();
		
		//PayerFilterSel
		Thread.sleep(3000);
		driver.findElement(payerFilterSel).click();
		
		//SearchButton
		Thread.sleep(5000);
		driver.findElement(SearchButton).click();
		
		//Collapse
		Thread.sleep(5000);
		driver.findElement(Collapse).click();
		
		//DescriptionFilter
		Thread.sleep(5000);
		driver.findElement(DescriptionFilter).sendKeys(DescriptionPar);
		
		//SearchButton
		Thread.sleep(5000);
		driver.findElement(SearchButton).click();
		
		//AdvanceSearch
		Thread.sleep(5000);
		driver.findElement(AdvanceSearch).click();
		
		//StatusFilter
		Thread.sleep(5000);
		driver.findElement(StatusFilter).click();
		
		//StatusSel
		Thread.sleep(5000);
		driver.findElement(StatusSel).click();
		
		//SearchButton
		Thread.sleep(5000);
		driver.findElement(SearchButton).click();

		
  }
  
}
