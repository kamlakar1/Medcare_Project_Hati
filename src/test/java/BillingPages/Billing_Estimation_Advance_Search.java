package BillingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Billing_Estimation_Advance_Search {
	
	
WebDriver driver=null;
	
    //Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
	
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");
	
	//BillEstimation
	By BillEstimationIcon=By.cssSelector("a[ng-reflect-router-link='bill-estimate']");
	
	//MRNPath
	By MRNPath=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-bill-estimation-dashboard/div[2]/div[1]/table/tbody/tr[1]/td[3]");
	
	//EstimationNoParth
	By EstimationNoPath=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-bill-estimation-dashboard/div[2]/div[1]/table/tbody/tr[1]/td[2]");
	
	
	//AdvanceSearch
	By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	
	//MRN
	By MRN=By.cssSelector("input[ng-reflect-name='mrn']");
	
	//SearchButton
	By SearchButton=By.cssSelector("button[ng-reflect-message='Search']");
	
	//Collapse
	By Collapse=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	
	//Name
	By Name=By.cssSelector("input[ng-reflect-name='patientName']");
	
	//EstimationNo
	By EstimationNo=By.cssSelector("input[ng-reflect-name='estimationNo']");
	
	public Billing_Estimation_Advance_Search (WebDriver driver)
	
	{
		this.driver=driver;
				
	}

public void BillingEstimationAdvanceSearch(String NAMEPar) throws InterruptedException
{
	//Clicking on menu Icon
			Thread.sleep(5000);
			Actions act = new Actions(driver);
			Thread.sleep(8000);
			WebElement ele=driver.findElement(mainmenu);
			act.moveToElement(ele).build().perform();
			act.click(ele).perform();
		  
		//BillingIcon
			Thread.sleep(5000);
			driver.findElement(BillingMenu).click();
			
		//SideBar
			Thread.sleep(3000);
			WebElement overforopdslide1=driver.findElement(SideBar);
			act.moveToElement(overforopdslide1).build().perform();
			
		//BillingDisappear
			Thread.sleep(3000);
			driver.findElement(BillDisappear).click();
			
		//BillEstimation
			Thread.sleep(3000);
			driver.findElement(BillEstimationIcon).click();
			
		
		//AdvanceSearch
			  Thread.sleep(3000);
			  driver.findElement(AdvanceSearch).click();
			  
		 //Name
			  Thread.sleep(3000);
			  driver.findElement(Name).sendKeys(NAMEPar);
			  
		//SearchButton
			  Thread.sleep(3000);
			  driver.findElement(SearchButton).click();	 
			  
		//CreatedMRN
			  Thread.sleep(2000);
			  WebElement MRNSearch=driver.findElement(MRNPath);
			  String MRNS=MRNSearch.getText();
			  
			  System.out.println("MRN"+MRNS);
	
		//Estimation
			  Thread.sleep(2000);
			  WebElement EstSearch=driver.findElement(EstimationNoPath);
			  String EST=EstSearch.getText();
			  
			  System.out.println("MRN"+EST);
			  
		//Collapse
			  Thread.sleep(3000);
			  driver.findElement(Collapse).click(); 
		
		//MRN
			  Thread.sleep(3000);
			  driver.findElement(MRN).sendKeys(MRNS);
			  
		//SearchButton
			  Thread.sleep(3000);
			  driver.findElement(SearchButton).click();
 
			  
			  
			//AdvanceSearch
			  Thread.sleep(3000);
			  driver.findElement(AdvanceSearch).click();
			  
			 //EstimationNo
			  Thread.sleep(3000);
			  driver.findElement(EstimationNo).sendKeys(EST);
			  
			//SearchButton
			  Thread.sleep(3000);
			  driver.findElement(SearchButton).click();
			  

			  Thread.sleep(3000);
			
			
}
}
