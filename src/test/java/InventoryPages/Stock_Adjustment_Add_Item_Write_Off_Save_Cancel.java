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

public class Stock_Adjustment_Add_Item_Write_Off_Save_Cancel 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Opening balance menu
	By AdjustmentClick=By.xpath("//*[@id='30044']/img");
	By StockAdjustmentClick=By.xpath("//*[@id='30055']/img");
	
	//Add button
	By AddButtonClick=By.cssSelector("button[ng-reflect-message='Add New']");

	//Store
	By StoreClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-stockadjustment/div[2]/mat-grid-list[1]/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By StoreSelOpt=By.xpath("//span[contains(text(),'OP Store 1')]");
	
	//Stock Type
	By StockTypeClick=By.cssSelector("mat-select[ng-reflect-placeholder='Stock Type']");
	By StockSelOpt=By.xpath("//span[contains(text(),'Write Off')]");
	
	//Add item
	By AddItemClick=By.cssSelector("button[ng-reflect-message='Add Items']");
	//Item Check box 
	By CheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	//add button click
	By AddItemBtn=By.cssSelector("mat-icon[ng-reflect-message='Add Items']");
	//Adjustment Qty
	By AdjustmentQTYClick=By.cssSelector("input[ng-reflect-type='number']");
	By Remarks=By.cssSelector("input[data-placeholder='Remarks']");
	//Save and submit
	By SaveClick=By.cssSelector("button[ng-reflect-message='Save']");
	//Yes button
	By YesbtnClick=By.cssSelector("button[ng-reflect-message='Yes']");
	//View deatails
	By CancelBtnClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-stockadjustment/div[3]/div/mat-table/mat-row[1]/mat-cell[10]/a[3]");
	//Reason
	By ReasonClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Reason']");
	By ReasonSelOpt=By.xpath("//span[contains(text(),'Not Required')]");
	
	//Cancel Button
	By CancelClick=By.cssSelector("mat-icon[ng-reflect-message='Cancel']");
	
	public void Stock_Adjustment_AddItem_For_Write_Off_SAve_Cancel() throws InterruptedException, IOException 
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

		//Clicking on Adjustment
		Thread.sleep(3000);
		driver.findElement(AdjustmentClick).click();	
		
		//Click on Stock Adjustment
		Thread.sleep(3000);
		driver.findElement(StockAdjustmentClick).click();

		Thread.sleep(2000);
		driver.findElement(AddButtonClick).click();
		
		Thread.sleep(2000);
		driver.findElement(StoreClick).click();
		Thread.sleep(2000);
		driver.findElement(StoreSelOpt).click();
		
		Thread.sleep(2000);
		driver.findElement(StockTypeClick).click();
		Thread.sleep(2000);
		driver.findElement(StockSelOpt).click();
		
		Thread.sleep(1000);
		driver.findElement(AddItemClick).click();
		
		Thread.sleep(1000);
		driver.findElement(CheckBoxClick).click();
		
		Thread.sleep(1000);
		driver.findElement(AddItemBtn).click();
		
		Thread.sleep(1000);
		driver.findElement(AdjustmentQTYClick).sendKeys("5");
		
		Thread.sleep(2000);
		driver.findElement(Remarks).sendKeys("Testing Remarks");
		
		Thread.sleep(1000);
		driver.findElement(SaveClick).click();
		
		Thread.sleep(1000);
		driver.findElement(YesbtnClick).click();
		
		Thread.sleep(2000);
		driver.findElement(CancelBtnClick).click();
		
		Thread.sleep(3000);
		driver.findElement(ReasonClick).click();
		Thread.sleep(3000);
		driver.findElement(ReasonSelOpt).click();
		
		Thread.sleep(2000);
		driver.findElement(CancelClick).click();
		
		
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//Stock_Adjustment_Add_Item_Write_Off_Save_Cancel.png")); 

	}
	public Stock_Adjustment_Add_Item_Write_Off_Save_Cancel(WebDriver driver)
	{
		this.driver=driver;
	}
}
