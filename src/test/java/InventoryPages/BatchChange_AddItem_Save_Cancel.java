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
import org.testng.Assert;

public class BatchChange_AddItem_Save_Cancel 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Opening balance menu
	By BatchChangeClick=By.xpath("//*[@id='30097']/img");
	By BatchChangeSubMenu=By.xpath("//*[@id='31097']/img");

	//Store Stock
	By StoreStockClick=By.xpath("//*[@id='30043']/img");

	//Add button
	By AddButtonClick=By.cssSelector("button[ng-reflect-message='Add New']");

	//Add button
	By AddBtnClickSecond=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-batchchange/div/div[1]/button");
	//Item Check box 
	By CheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	//add button click
	By AddItem=By.cssSelector("mat-icon[ng-reflect-message='Add Items']");

	//New Batch Number
	By NewBatchClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-batchchange/div/div[2]/table/tbody/tr[1]/td[8]/mat-form-field/div/div[1]/div[3]/input");
	//Expiray Date
	By ExpirayDateClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-batchchange/div/div[2]/table/tbody/tr[1]/td[9]/mat-form-field/div/div[1]/div[3]/input");
	By NewCOPClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-batchchange/div/div[2]/table/tbody/tr[1]/td[10]/mat-form-field/div/div[1]/div[3]/input");
	//Save and submit
	By SaveClick=By.cssSelector("button[ng-reflect-message='Save']");
	//Yes button
	By YesbtnClick=By.cssSelector("button[ng-reflect-message='Yes']");
	By BatchSaveSucc=By.xpath("//span[contains(text(),'Batch Modification Saved Successfully')]");
	By CheckBXBtnClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-batchchange/div[2]/div/table/tbody/tr[1]/td[1]/mat-checkbox");

	//Cancel button
	By CancelButton=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-batchchange/div[2]/div/table/tbody/tr[1]/td[9]/a[3]");
	//Cancelreason drop down
	By CancelReasonClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Reason']");
	By CancelReasonSelOpt=By.xpath("//span[contains(text(),'Incorrect Quantity')]");
	By CancelSave=By.cssSelector("mat-icon[ng-reflect-message='Cancel']");
	//Status cancelled
	By CancelStatus=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-openingbalance/div[3]/mat-table/mat-row[1]/mat-cell[7]");
	By SaveSucc=By.xpath("//span[contains(text(),'Material Consumption Saved Successfully')]");
	By CancelSucc=By.xpath("//span[contains(text(),'Record Cancelled Successfully')]");

	public void Batchchange_AddItem_Save_Cancel() throws InterruptedException, IOException 
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
		driver.findElement(BatchChangeClick).click();	

		/*Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(400, 0).click().build().perform();*/

		//Click on Stock Adjustment
		Thread.sleep(3000);
		driver.findElement(BatchChangeSubMenu).click();

		Thread.sleep(2000);
		driver.findElement(AddButtonClick).click();

		Thread.sleep(2000);
		driver.findElement(AddBtnClickSecond).click();

		Thread.sleep(5000);
		driver.findElement(CheckBoxClick).click();

		Thread.sleep(2000);
		driver.findElement(AddItem).click();

		Thread.sleep(3000);
		driver.findElement(NewBatchClick).sendKeys("NEWBATCH22");

		Thread.sleep(3000);
		driver.findElement(NewCOPClick).sendKeys("5");


		Thread.sleep(3000);
		driver.findElement(ExpirayDateClick).sendKeys("16/02/2030");

		Thread.sleep(1000);
		driver.findElement(SaveClick).click();

		Thread.sleep(1000);
		driver.findElement(YesbtnClick).click();

		Thread.sleep(2000);
		WebElement selectR=driver.findElement(BatchSaveSucc);
		String SRActual=selectR.getText();
		System.out.println("message : "+SRActual);
		String expected="Batch Modification Saved Successfully";
		Assert.assertEquals(SRActual,expected,"Validation message Should be Please select reason");

		//Clicking on cancel button
		Thread.sleep(3000);
		driver.findElement(CancelButton).click();

		//Cancel reason drop down
		Thread.sleep(2000);
		driver.findElement(CancelReasonClick).click();
		Thread.sleep(2000);
		driver.findElement(CancelReasonSelOpt).click();

		//Save Cancel
		Thread.sleep(2000);
		driver.findElement(CancelSave).click();

		Thread.sleep(2000);
		WebElement selectR1=driver.findElement(CancelSucc);
		String SRActual1=selectR1.getText();
		System.out.println("message : "+SRActual1);
		String expected1="Record Cancelled Successfully";
		Assert.assertEquals(SRActual1,expected1,"Validation message Should be Please select reason");

		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//BatchChange_AddItem_Save_Details.png")); 

	}
	public BatchChange_AddItem_Save_Cancel(WebDriver driver)
	{
		this.driver=driver;
	}
}
