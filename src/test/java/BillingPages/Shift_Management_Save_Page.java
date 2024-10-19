package BillingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Shift_Management_Save_Page {
	
	
	WebDriver driver=null;
	
	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
	
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");
	
	//CashDeskIcon
	By CashDeskIcon=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[14]");
	
	//ShiftManagement
	By ShiftManagement=By.cssSelector("a[ng-reflect-router-link='cashdesk,shiftmanagement']");
	
	//StartCounter
	By StartCounter=By.cssSelector("button[data-automation-attribute='btn-save']");
	
	//CounterClick
	By CounterClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Counter']");
	
	//CounterSel
	By CounterSel=By.xpath("//span[contains(text(),'Cash Counter 1')]");
	
	//OpeningBal
	By OpeningBal=By.xpath("input[ng-reflect-placeholder=\"Opening Balance Amt.\"]");
	
	//DenominationNo
	By DenominationNo=By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-start-counter/div[2]/div[2]/table/tbody/tr[1]/td[2]");
	
	//Remarks
	By Remarks=By.cssSelector("input[ng-reflect-name='remark']");
	
	//Save
	By Save=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	
	//PassCode
	By PassCode=By.cssSelector("input[ng-reflect-placeholder='Passcode']");
	
	//Confirm
	By Confirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	
	public Shift_Management_Save_Page (WebDriver driver)
	
	{
		this.driver=driver;
				
	}
	

  public void CashDeskStart(String OpeningPar,String DenominationPar,String RemarksPar,String PassCodePar) throws InterruptedException 
  {
	//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
	  
	  //BillingIcon
		Thread.sleep(2000);
		driver.findElement(BillingMenu).click();
		
		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBar);
		act.moveToElement(overforopdslide1).build().perform();
	  
		//BillingDisappear
		Thread.sleep(2000);
		driver.findElement(BillDisappear).click();
		
		//CashDeskIcon
		Thread.sleep(2000);
		driver.findElement(CashDeskIcon).click();
		
		//ShiftManagement
		Thread.sleep(2000);
		driver.findElement(ShiftManagement).click();
		
		//StartCounter
		Thread.sleep(2000);
		driver.findElement(StartCounter).click();
		
		//CounterClick
		Thread.sleep(2000);
		driver.findElement(CounterClick).click();
		
		//CounterSel
		Thread.sleep(2000);
		driver.findElement(CounterSel).click();
		
		//OpeningBal
		Thread.sleep(2000);
		driver.findElement(OpeningBal).sendKeys(OpeningPar);
		
		
		//DenominationNo
		Thread.sleep(2000);
		driver.findElement(DenominationNo).sendKeys(DenominationPar);
		
		//Remarks
		Thread.sleep(2000);
		driver.findElement(Remarks).sendKeys(RemarksPar);
		
		//Save
		Thread.sleep(2000);
		driver.findElement(Save).click();
		
		//PassCode
		Thread.sleep(2000);
		driver.findElement(PassCode).sendKeys(PassCodePar);
		
		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();
		

		
		
  }
}
