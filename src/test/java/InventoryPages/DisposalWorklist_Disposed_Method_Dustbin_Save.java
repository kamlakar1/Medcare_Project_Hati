package InventoryPages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DisposalWorklist_Disposed_Method_Dustbin_Save 
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
	By AgainstSelOpt=By.xpath("//mat-option//span[contains(text(),'Item')]");

	By ItemAddButtonClick=By.cssSelector("button[ng-reflect-message='Add Items']");
	//Add item
	//By AddItemClick=By.cssSelector("button[ng-reflect-message='Add Items']");
	//Item Check box 
	By CheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	//add button click
	By AddItemBtn=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[3]/div/button/span[1]/mat-icon");
	By DisposedQty=By.cssSelector("input[ng-reflect-placeholder='Quantity']");
	By SelectReasonClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Reason']");
	By SelectReasonSelOpt=By.xpath("//span[contains(text(),'Damaged')]");
	//Save and submit
	By SaveAndSubmitClick=By.cssSelector("button[ng-reflect-message='Save and Submit']");
	//Yes button
	By YesbtnClick=By.cssSelector("button[ng-reflect-message='Yes']");
	By BatchSaveSucc=By.xpath("//span[contains(text(),'Disposed Saved successfully')]");

	By DisposalRequestApprovalClick=By.xpath("//*[@id='31094']/img");
	By DetailsClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-disposalrequestapproval/div[3]/div/mat-table/mat-row[1]/mat-cell[13]/a");

	By AssignWitnessClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-disposalrequestapproval/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By AssignWitnessSelOpt=By.xpath("//span[contains(text(),'Norshafiqqa Binti Shafie')]");

	By ScheduleDate=By.cssSelector("input[ng-reflect-placeholder='Choose Schedule Date']");
	By ApproveClick=By.cssSelector("button[ng-reflect-message='Approve']");

	By ApproveYesClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirmation/div/form/div[3]/div/button[1]");
	By PrintReportClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-disposalrequestapproval/div[3]/div/mat-table/mat-row[1]/mat-cell[12]/a/mat-icon");
	By BatchApprovedSaveSucc=By.xpath("//span[contains(text(),'Record Approved successfully')]");

	By DisposalWorklistClick=By.xpath("//*[@id='31095']/img");
	By WorklistDetailsClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-disposalworklist/div[3]/div/mat-table/mat-row[1]/mat-cell[15]/a/mat-icon");
	
	By DisposalMethodClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-disposalworklist/div/div[1]/mat-table/mat-row/mat-cell[8]/mat-form-field/div/div[1]/div[3]/mat-select");
	By DisposalMethodSelOpt=By.xpath("//span[contains(text(),'Dust Bin')]");
	
	By WorklistSaveClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-disposalworklist/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/div/button[2]");
	By WorkListYesClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirmation/div/form/div[3]/div/button[1]");
	
	By DisposalWorklistSaveSucc=By.xpath("//span[contains(text(),'Disposal Worklist Updated Successfully')]");
public void DisposalWorklist_DustBin_Save() throws InterruptedException, IOException 
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
		Thread.sleep(4000);
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
		driver.findElement(SaveAndSubmitClick).click();

		Thread.sleep(1000);
		driver.findElement(YesbtnClick).click();

		/*Thread.sleep(2000);
		WebElement selectR=driver.findElement(BatchSaveSucc);
		String SRActual=selectR.getText();
		System.out.println("message : "+SRActual);
		String expected="Disposed Saved successfully";
		Assert.assertEquals(SRActual,expected,"Validation message Should be Disposed Saved Successfully");*/

		//Over the slide bar in Inventory Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		//Click on Stock Adjustment
		Thread.sleep(4000);
		driver.findElement(DisposalRequestApprovalClick).click();

		Thread.sleep(2000);
		driver.findElement(DetailsClick).click();

		Thread.sleep(2000);
		driver.findElement(AssignWitnessClick).click();
		Thread.sleep(2000);
		driver.findElement(AssignWitnessSelOpt).click();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date date = new Date();
		Thread.sleep(2000);
		driver.findElement(ScheduleDate).sendKeys(dateFormat.format(date));

		Thread.sleep(2000);
		driver.findElement(ApproveClick).click();

		Thread.sleep(2000);
		driver.findElement(ApproveYesClick).click();

		/*Thread.sleep(2000);
		WebElement selectR=driver.findElement(BatchApprovedSaveSucc);
		String SRActual=selectR.getText();
		System.out.println("message : "+SRActual);
		String expected="Record Approved successfully";
		Assert.assertEquals(SRActual,expected,"Validation message Should be Record Approved successfully");*/

		//Over the slide bar in Inventory Screen
		Thread.sleep(3000);
		WebElement overforopdslide3=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide3).build().perform();
		
		//Click on Stock Adjustment
		Thread.sleep(3000);
		driver.findElement(DisposalWorklistClick).click();
		
		Thread.sleep(3000);
		driver.findElement(WorklistDetailsClick).click();
		
		Thread.sleep(2000);
		driver.findElement(DisposalMethodClick).click();
		Thread.sleep(2000);
		driver.findElement(DisposalMethodSelOpt).click();
		
		Thread.sleep(3000);
		driver.findElement(WorklistSaveClick).click();
		Thread.sleep(3000);
		driver.findElement(WorkListYesClick).click();
		
		Thread.sleep(2000);
		WebElement selectR2=driver.findElement(DisposalWorklistSaveSucc);
		String SRActual2=selectR2.getText();
		System.out.println("message : "+SRActual2);
		String expected2="Disposal Worklist Updated Successfully";
		Assert.assertEquals(SRActual2,expected2,"Validation message Should be Disposal Worklist Updated successfully");
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//DisposalRequestApproval_Approved_Full_PrintReport.png")); 
	}
	public DisposalWorklist_Disposed_Method_Dustbin_Save(WebDriver driver)
	{
		this.driver=driver;
	}
}
