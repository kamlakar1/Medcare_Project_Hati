package InventoryPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Material_Consumption_Approvall_PrintReport 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Opening balance menu
	By ConsumptionClick=By.xpath("//*[@id='30045']/img");
	By MaterialConsumptionClick=By.xpath("//*[@id='30053']/img");

	//Add button
	By AddButtonClick=By.cssSelector("button[ng-reflect-message='Add New']");
	//Store
	By StoreClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-materialconsumption/div/mat-grid-list[1]/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By StoreSelOpt=By.xpath("//span[contains(text(),'KL OP Pharmacy')]");

	By AddItemBtn=By.cssSelector("[ng-reflect-message='Add Items']");
	//Item Check box 
	By CheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	//add button click
	By AddItem=By.cssSelector("mat-icon[ng-reflect-message='Add Items']");
	//Adjustment Qty
	By ConsumedQTYClick=By.cssSelector("input[ng-reflect-placeholder='Quantity']");


	//Save and submit
	By SaveAndSubmitClick=By.cssSelector("button[ng-reflect-message='Save and Submit']");
	//Yes button
	By YesbtnClick1=By.cssSelector("button[ng-reflect-message='Yes']");
	By SaveAndSubmitSucc=By.xpath("//span[contains(text(),'Material Consumption Saved Successfully')]");

	By MaterialConsumptionAppClick=By.xpath("//*[@id='30054']/img");

	By CheckbxClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialconsumptionapproval/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By ApproveClick=By.cssSelector("button[ng-reflect-message='Approve']");
	By YesClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirmation/div/form/div[3]/div/button[1]");
	By ApproveSuc=By.xpath("//span[contains(text(),'Material Consumption Approved Successfully')]");

	//Print
	By PrintClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialconsumptionapproval/div[2]/div/mat-table/mat-row[1]/mat-cell[10]/a");
	public void MaterialConsumptionApproval_PrintReport() throws InterruptedException, IOException 
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
		driver.findElement(ConsumptionClick).click();	

		//Click on Stock Adjustment
		Thread.sleep(3000);
		driver.findElement(MaterialConsumptionClick).click();

		Thread.sleep(2000);
		driver.findElement(AddButtonClick).click();

		Thread.sleep(2000);
		driver.findElement(StoreClick).click();
		Thread.sleep(2000);
		driver.findElement(StoreSelOpt).click();

		Thread.sleep(1000);
		driver.findElement(AddItemBtn).click();

		Thread.sleep(5000);
		driver.findElement(CheckBoxClick).click();

		Thread.sleep(2000);
		driver.findElement(AddItem).click();

		Thread.sleep(2000);
		driver.findElement(ConsumedQTYClick).sendKeys("5");

		Thread.sleep(1000);
		driver.findElement(SaveAndSubmitClick).click();

		Thread.sleep(1000);
		driver.findElement(YesbtnClick1).click();

		Thread.sleep(2000);
		WebElement selectR=driver.findElement(SaveAndSubmitSucc);
		String SRActual=selectR.getText();
		System.out.println("message : "+SRActual);
		String expected="Material Consumption Saved Successfully";
		Assert.assertEquals(SRActual,expected,"Validation message Should be Please select reason");

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(3000);
		driver.findElement(MaterialConsumptionAppClick).click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(300, 0).click().build().perform();

		Thread.sleep(2000);
		driver.findElement(CheckbxClick).click();

		Thread.sleep(2000);
		driver.findElement(ApproveClick).click();

		Thread.sleep(2000);
		driver.findElement(YesClick).click();

		Thread.sleep(2000);
		WebElement selectR1=driver.findElement(ApproveSuc);
		String SRActual1=selectR1.getText();
		System.out.println("message : "+SRActual1);
		String expected1="Material Consumption Approved Successfully";
		Assert.assertEquals(SRActual1,expected1,"Validation message Should be Please select reason");

		Thread.sleep(2000);
		driver.findElement(PrintClick).click();
	
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//Material_Consumption_Approvall_PrintReport.png")); 

	}
	public Material_Consumption_Approvall_PrintReport(WebDriver driver)
	{
		this.driver=driver;
	}
}
