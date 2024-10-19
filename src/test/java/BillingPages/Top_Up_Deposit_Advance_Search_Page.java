package BillingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Top_Up_Deposit_Advance_Search_Page {
	
	WebDriver driver=null;
	
	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
	
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");
	
	
	//TopUpDeposit
	By TopUpDeposit=By.cssSelector("a[ng-reflect-router-link='topUpDeposit']");
	
	//AdvanceSearchClick
	By AdvanceSearchClcik=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	
	
	//PatientMRNFilter
	By PatientMRNFilter=By.cssSelector("input[ng-reflect-name='mrn']");
	
	//SearchButton
	By SearchButton=By.cssSelector("button[ng-reflect-message='Search']");
	
	//Expand
	By Expand=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	
	//PatientNameFilter
	By PatientNameFilter=By.cssSelector("input[ng-reflect-name='PatienName']");
	
	//VisitFilter
	By VisitFilter=By.cssSelector("mat-select[ng-reflect-name='visitType']");
	
	//VisitSel
	By VisitSel=By.xpath("//span[contains(text(),'Daycare')]");
	
	//WardFilter
	By WardFilter=By.cssSelector("mat-select[ng-reflect-name='ward']");
	
	//WardSel
	By WardSel=By.xpath("//span[contains(text(),'Ward N3-A')]");
	
	//MRN
	By MRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit-topup/div[2]/table/tbody/tr[1]/td[5]");

	//Name
	By Name=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit-topup/div[2]/table/tbody/tr[1]/td[6]");
	
	
	public Top_Up_Deposit_Advance_Search_Page (WebDriver driver)
	
	{
		this.driver=driver;
				
	}
  
  public void TopUpDepositAdvanceSearch() throws InterruptedException 
  {
	  
	  //Menu
	    Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		
		//BillIcon
		Thread.sleep(2000);
		driver.findElement(BillingMenu).click();
		
		
		//SideBar
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBar);
		act.moveToElement(overforopdslide1).build().perform();
		
		
		
		
		
		//BillDisappear
		Thread.sleep(2000);
		driver.findElement(BillDisappear).click();
		
		//TopUpDeposit
		Thread.sleep(2000);
		driver.findElement(TopUpDeposit).click();
		
		//MRN
		  Thread.sleep(20000);
		  WebElement MRNSearch=driver.findElement(MRN);
		  String MRNS=MRNSearch.getText();
		
		  
		//Patient
		  Thread.sleep(2000);
		  WebElement NameSearch=driver.findElement(Name);
		  String Names=NameSearch.getText();
		
		//AdvanceSearchClick
		Thread.sleep(2000);
		driver.findElement(AdvanceSearchClcik).click();
		
		//PatientMRNFilter
		Thread.sleep(2000);
		driver.findElement(PatientMRNFilter).sendKeys(MRNS);
		
		//SearchButton
		Thread.sleep(2000);
		driver.findElement(SearchButton).click();

		
		//Expand
		Thread.sleep(2000);
		driver.findElement(Expand).click();
		
		//PatientNameFilter
		Thread.sleep(2000);
		driver.findElement(PatientNameFilter).sendKeys(Names);
		
		//SearchButton
		Thread.sleep(2000);
		driver.findElement(SearchButton).click();
		
		//AdvanceSearchClick
		Thread.sleep(2000);
		driver.findElement(AdvanceSearchClcik).click();
		
		//VisitFilter
		Thread.sleep(2000);
		driver.findElement(VisitFilter).click();
		
		//VisitSel
		Thread.sleep(2000);
		driver.findElement(VisitSel).click();
		
		//SearchButton
		Thread.sleep(2000);
		driver.findElement(SearchButton).click();
		
		//Expand
		Thread.sleep(2000);
		driver.findElement(Expand).click();
				
		//WardFilter
		Thread.sleep(2000);
		driver.findElement(WardFilter).click();
		
		//WardSel
		Thread.sleep(2000);
		driver.findElement(WardSel).click();
		
		
		//SearchButton
		Thread.sleep(2000);
		driver.findElement(SearchButton).click();
		

		
  }
}
