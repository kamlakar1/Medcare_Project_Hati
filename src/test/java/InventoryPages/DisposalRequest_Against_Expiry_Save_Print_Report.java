package InventoryPages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DisposalRequest_Against_Expiry_Save_Print_Report 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Store Stock
	By StoreStockClick=By.xpath("//*[@id='30043']/img");	
	By DisposalRequestClick=By.xpath("//*[@id='30093']/img");
	By DisposalRequestSubMenu=By.xpath("//*[@id='31093']/img");

	//Add button
	By AddButtonClick=By.cssSelector("button[ng-reflect-message='Add New']");
	//Store
	By RequestingStoreClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-disposalrequest/div/mat-grid-list[1]/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By RequestingStoreSelOpt=By.xpath("//span[contains(text(),'OP Store 1')]");
	//Stock Type
	By AgainstClick=By.cssSelector("mat-select[ng-reflect-placeholder='Against']");
	By AgainstSelOpt=By.xpath("//mat-option//span[contains(text(),'Expiry')]");

	By ItemAddButtonClick=By.cssSelector("button[ng-reflect-message='Add Items']");
	//Add item
	//By AddItemClick=By.cssSelector("button[ng-reflect-message='Add Items']");
	//Item Check box 
	By CheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-nearbyexpiry/div/div[2]/div/mat-table/mat-row[15]/mat-cell[1]/mat-checkbox");
	//add button click
	By AddItemBtn=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-nearbyexpiry/div/div[3]/div/button/span[1]/mat-icon");
	By DisposedQty=By.cssSelector("input[ng-reflect-placeholder='Quantity']");
	By SelectReasonClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Reason']");
	By SelectReasonSelOpt=By.xpath("//span[contains(text(),'Damaged')]");
	//Save and submit
	By SaveClick=By.cssSelector("button[ng-reflect-message='Save']");
	//Yes button
	By YesbtnClick=By.cssSelector("button[ng-reflect-message='Yes']");
	By BatchSaveSucc=By.xpath("//span[contains(text(),'Disposed Saved successfully')]");

	//Cancel button
	By PrintBtnClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-disposalrequest/div[3]/div/mat-table/mat-row[1]/mat-cell[12]/a[2]/mat-icon");
	

	public void Disposal_Request_Against_Expiry_Save_PrintReport() throws InterruptedException, IOException 
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

		Thread.sleep(4000);
		driver.findElement(StoreStockClick).click();	

		//Clicking on Adjustment
		Thread.sleep(4000);
		driver.findElement(DisposalRequestClick).click();	

		/*Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(400, 0).click().build().perform();*/

		//Click on Stock Adjustment
		Thread.sleep(3000);
		driver.findElement(DisposalRequestSubMenu).click();

		Thread.sleep(2000);
		driver.findElement(AddButtonClick).click();

		Thread.sleep(2000);
		driver.findElement(RequestingStoreClick).click();
		Thread.sleep(2000);
		driver.findElement(RequestingStoreSelOpt).click();

		Thread.sleep(2000);
		driver.findElement(AgainstClick).click();
		Thread.sleep(2000);
		driver.findElement(AgainstSelOpt).click();

		Thread.sleep(2000);
		driver.findElement(ItemAddButtonClick).click();

		Thread.sleep(2000);
		driver.findElement(CheckBoxClick).click();

		Thread.sleep(1000);
		driver.findElement(AddItemBtn).click();

		Thread.sleep(1000);
		driver.findElement(DisposedQty).sendKeys("10");

		Thread.sleep(1000);
		driver.findElement(SelectReasonClick).click();
		Thread.sleep(1000);
		driver.findElement(SelectReasonSelOpt).click();

		Thread.sleep(1000);
		driver.findElement(SaveClick).click();

		Thread.sleep(1000);
		driver.findElement(YesbtnClick).click();

		/*Thread.sleep(3000);
		WebElement selectR=driver.findElement(BatchSaveSucc);
		String SRActual=selectR.getText();
		System.out.println("message:"+SRActual);
		String expected="Disposed Saved successfully";
		Assert.assertEquals(SRActual,expected,"Validation message Should be Please select reason");*/

		//Clicking on cancel button
		Thread.sleep(3000);
		driver.findElement(PrintBtnClick).click();

		Thread.sleep(4000);
		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.get(1));
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		if(driver.getPageSource().contains("Disposal Request"))
		{
			System.out.println("Print Report opened");
		}	
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//DisposalRequest_Against_Item_Save_Print_Report.png")); 

	}
	public DisposalRequest_Against_Expiry_Save_Print_Report(WebDriver driver)
	{
		this.driver=driver;
	}
}
