package ADTpages;

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
import org.testng.annotations.Test;

public class BedBlocking 
{
	WebDriver driver=null;

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//span[contains(text(),'ADT')]");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//Bed Block Menu
	By BedBlockMenu=By.cssSelector("a[ng-reflect-router-link='bed-blocking']");

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//Block Bed Button Plus Button
	By BlockBedButton=By.cssSelector("mat-icon[ng-reflect-message='Block Bed']");
	//Ward
	By WardClick=By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-bed-selection/div/div[2]/div/div/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	                      // /html/body/div[2]/div[2]/div/mat-dialog-container/app-bed-selection/div/div[2]/div/div/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select
	By WardSelOpt=By.xpath("//span[contains(text(),'Neonatal Intensive Care Unit (NICU) A')]");

	//Bed Category
	By BedCategoryClick=By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-bed-selection/div/div[2]/div/div/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By BedCategorySelOpt=By.xpath("//span[contains(text(),'Cot and Bed')][1]");

	//Check Box
	By CheckBoxClick= By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-bed-selection/div/div[2]/div/div/div/table/tbody/tr/td[1]/mat-checkbox");

	//Save Button
	By SaveClick1=By.xpath("//div[@class='modal-footer modalFooterAppointmentForm']/div/button/span/mat-icon");

	//Release Time
	By ReleaseTimeCklick=By.cssSelector("input[ng-reflect-name='releaseTime']");

	//
	By ReasonClick=By.cssSelector("mat-select[ng-reflect-name='reason']");
	By ReasonSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Remarks
	By RemarksClick=By.cssSelector("input[formcontrolname='remarks']");

	//Main Save button
	By MainSaveClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-bed-blocking/div[2]/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div/mat-grid-list/div/mat-grid-tile[4]/div/div/button/span[1]/mat-icon");

	//Clicking on Next Tab Blocked Bed List
	By BlockedBedList=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-bed-blocking/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[2]");
	By TabBedBlockClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-bed-blocking/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[1]");

	//unblock bed
	By UnblockBedClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-bed-blocking/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/table/tbody/tr[1]/td[13]/mat-icon[1]");
	//Confirm Yes Button
	By ConfirmYesButtonClick=By.cssSelector("button[data-automation-attribute='button-save-dialog']");
	//bed check 
	By BedCheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-bed-selection/div/div[2]/div/div/div/table/tbody/tr/td[1]/mat-checkbox");
	public void Bed_Blocking_Screen(String ReleaseTimePar,String RemarksPar) throws InterruptedException, IOException 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();
		//Thread.sleep(2000);
		Thread.sleep(3000);
		driver.findElement(ADTMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(10000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		//Clicking on Bed Block Menu
		Thread.sleep(3000);
		driver.findElement(BedBlockMenu).click();
		Thread.sleep(5000);
		
		//Clicking on Block Bed Button
		Thread.sleep(3000);
		driver.findElement(BlockBedButton).click();

		//Selecting ward
		Thread.sleep(5000);
		driver.findElement(WardClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Neonatal Intensive Care Unit (NICU) A");
		Thread.sleep(2000);
		driver.findElement(WardSelOpt).click();

		//Selecting Bed Category
		Thread.sleep(2000);
		driver.findElement(BedCategoryClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Cot and Bed");
		Thread.sleep(2000);
		driver.findElement(BedCategorySelOpt).click();

		Thread.sleep(3000);
		WebElement BedCheck=driver.findElement(BedCheckBoxClick);
		String Bed=BedCheck.getText();
		System.out.println("Bed"+Bed);
		
	
		//Clicking on check box
		Thread.sleep(2000);
		driver.findElement(CheckBoxClick).click();

		//Clicking on save button
		Thread.sleep(2000);
		driver.findElement(SaveClick1).click();

		//Selecting Release time
		Thread.sleep(2000);
		driver.findElement(ReleaseTimeCklick).sendKeys(ReleaseTimePar);

		
		
		//Selecting reason
		Thread.sleep(2000);
		driver.findElement(ReasonClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Bed blocking");
		Thread.sleep(2000);
		driver.findElement(ReasonSelOpt).click();

		//Adding Remarks
		
		Thread.sleep(2000);
		driver.findElement(RemarksClick).sendKeys(RemarksPar);

		//Clicking on Main  save button
		Thread.sleep(2000);
		driver.findElement(MainSaveClick).click();
		
	

		//Clicking on Next Tab 
		Thread.sleep(2000);
		driver.findElement(BlockedBedList).click();

		 
	
		//Unblocked Bed
		Thread.sleep(2000);
		driver.findElement(UnblockBedClick).click();
		
		//COnfirm Yes
		Thread.sleep(2000);
		driver.findElement(ConfirmYesButtonClick).click();
		Thread.sleep(2000);
		//Failure Assertions
		
	
	}
	

	
	public BedBlocking(WebDriver driver)
	{
		this.driver=driver;
	}
}
