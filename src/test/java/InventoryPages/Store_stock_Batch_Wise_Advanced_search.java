package InventoryPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import dev.failsafe.internal.util.Assert;

public class Store_stock_Batch_Wise_Advanced_search 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Opening balance menu
	By StorageAllocation=By.xpath("//*[@id='34054']/img");

	//Against
	By PendingForAllocation=By.xpath("//*[@id='mat-tab-label-2-1']");
	By AgainstSelOpt=By.xpath("//span[contains(text(),'Batch Wise')]");
	//Store Stock
	By StoreClick=By.xpath("//*[@id='mat-select-234']");
	By StoreSelOpt=By.xpath("//mat-select//span[contains(text(),'OP Store 1')]");	
	//Search button
	By CheckBoxClick=By.xpath("//mat-cell//*[@id='mat-checkbox-192']");
	//Taking itemcode
	By BatchCodeTake=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[2]/div/table/tbody/tr[1]/td[11]");
	By AdvancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//Clicking On Iteam code
	By SaveButtonClick=By.xpath("//mat-grid-tile//mat-icon[contains(text(),'sim_card')]");
	//Click on search button
	By SearchCLick2=By.cssSelector("button[type='submit']");

	//Clicking on advanced search
	
	public void Store_Stock_Batch_Wise_Advanced_Search() throws InterruptedException, IOException 
	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		//Clicking on Inventory menu
		Thread.sleep(3000);
		driver.findElement(InventoryMenuClick).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		//Store Stock menu
		Thread.sleep(3000);
		driver.findElement(StorageAllocation).click();	

		//Pending for allocation
		Thread.sleep(2000);
		driver.findElement(PendingForAllocation).click();	
		
		//Store Stock
		Thread.sleep(3000);
		driver.findElement(StoreClick).click();	
		Thread.sleep(3000);
		driver.findElement(StoreSelOpt).click();
	
		Thread.sleep(3000);
		driver.findElement(CheckBoxClick).click();

		//Clicking on Advanced Search
		Thread.sleep(2000);
		driver.findElement(AdvancedSearchClick).click();

		/*//Clicking on Advanced Search
		Thread.sleep(2000);
		driver.findElement(BatchCodeClick2).click();

		//Clicking on Search button
		Thread.sleep(2000);
		driver.findElement(SearchCLick2).click();	

		if(driver.getPageSource().contains(BatchCD))
		{
			System.out.println("Item code Available");
		}
		else
		{
			System.out.println("Item code not available");
			Assert.isTrue(false,BatchCD," : This Batch code not availble");
		}*/


	}
	public Store_stock_Batch_Wise_Advanced_search(WebDriver driver)
	{
		this.driver=driver;
	}
}
