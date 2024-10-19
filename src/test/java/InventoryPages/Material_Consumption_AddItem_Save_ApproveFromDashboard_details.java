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

public class Material_Consumption_AddItem_Save_ApproveFromDashboard_details 
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
	By SaveClick=By.cssSelector("button[ng-reflect-message='Save']");
	//Yes button
	By YesbtnClick=By.cssSelector("button[ng-reflect-message='Yes']");
	//CheckBox
	By CheckBoxCL=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialconsumption/div[3]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	//Approve
	By ApproveCLick=By.cssSelector("button[ng-reflect-message='Approve']");
	By ApproveYesClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirmation/div/form/div[3]/div/button[1]");
	By ApproveSucc=By.xpath("//span[contains(text(),'Material Consumption Approved Successfully')]");
	public void MaterialConsumption_AddItem_Save_Approve() throws InterruptedException, IOException 
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

		Thread.sleep(1000);
		driver.findElement(ConsumedQTYClick).sendKeys("5");

		Thread.sleep(1000);
		driver.findElement(SaveClick).click();

		Thread.sleep(1000);
		driver.findElement(YesbtnClick).click();
		
		Thread.sleep(4000);
		driver.findElement(CheckBoxCL).click();
		
		Thread.sleep(2000);
		driver.findElement(ApproveCLick).click();
		
		Thread.sleep(2000);
		driver.findElement(	ApproveYesClick).click();
	
		
		Thread.sleep(1000);
		WebElement selectR=driver.findElement(ApproveSucc);
		String SRActual=selectR.getText();
		System.out.println("message : "+SRActual);
		String expected="Material Consumption Approved Successfully";
		Assert.assertEquals(SRActual,expected,"Validation message Should be Please select reason");

		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//Material_Consumption_Add_AddItem_Save_details.png")); 

	}
	public Material_Consumption_AddItem_Save_ApproveFromDashboard_details(WebDriver driver)
	{
		this.driver=driver;
	}
}
