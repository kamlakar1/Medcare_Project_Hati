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

public class Store_stock_Batch_Wise_Print_Report 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Opening balance menu
	By StoreStock=By.xpath("//*[@id='30052']/img");
	//Against
	By AgainstClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By AgainstSelOpt=By.xpath("//span[contains(text(),'Batch Wise')]");
	//Store Stock
	By StoreStockClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By StoreStockSelOpt=By.xpath("//span[contains(text(),' OP Store 1 ')]");
	//Search button
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");
	//Print button
	By PrintButtonClick=By.cssSelector("button[ng-reflect-message='Print']");
	public void Store_Stock_Batch_Wise_print_Report() throws InterruptedException, IOException 
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
		Thread.sleep(4000);
		driver.findElement(StoreStock).click();	

		//Against
		Thread.sleep(3000);
		driver.findElement(AgainstClick).click();	
		Thread.sleep(3000);
		driver.findElement(AgainstSelOpt).click();
		
		//Store Stock
		Thread.sleep(3000);
		driver.findElement(StoreStockClick).click();	
		Thread.sleep(3000);
		driver.findElement(StoreStockSelOpt).click();

		//Clicking outside space after clicking department
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		action2.moveByOffset(200, 0).click().build().perform();

		Thread.sleep(3000);
		driver.findElement(SearchClick).click();

		Thread.sleep(3000);
		driver.findElement(PrintButtonClick).click();


		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//Store_stock_Item_Wise_Print_Report.png")); 

	}
	public Store_stock_Batch_Wise_Print_Report(WebDriver driver)
	{
		this.driver=driver;
	}
}
