package BillingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Top_Up_Deposit_50_To_75_Page {
	
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
	
	//FirstFilter
	By FirstFilter=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit-topup/div[1]/mat-button-toggle-group/mat-button-toggle[2]");
	
	
	public Top_Up_Deposit_50_To_75_Page (WebDriver driver)
	
	{
		this.driver=driver;
				
	}
  
  public void TopUpDeposit50To70() throws InterruptedException 
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
		Thread.sleep(50000);
		driver.findElement(TopUpDeposit).click();
		
	
		//FirstFilter
		Thread.sleep(10000);
		driver.findElement(FirstFilter).click();
		

		
  }
}
