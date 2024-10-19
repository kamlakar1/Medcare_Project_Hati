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

public class Item_Barcode_Against_GRN_Print_barcode 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Opening balance menu
	By OpeningBalanceClick=By.xpath("//*[@id='30046']/img");
	//Add Button
	By AddButtonClick=By.xpath("//mat-icon[contains(text(),'add')]");
	//Store
	By StoreClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-openingbalance/div/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By StoreSelOpt=By.xpath("// span[contains(text(),'OP Store 1')]");
	//Add Items Button
	By AdditemsClick=By.cssSelector("button[ng-reflect-message='Add Items']");

	//Item Group
	By ItemGroupClick=By.cssSelector("input[ng-reflect-placeholder='Item Group']");
	//Iteam Category
	By IteamCategoryCLick=By.cssSelector("input[ng-reflect-placeholder='Item Category']");
	//Iteam Code
	By IteamCodeClick=By.cssSelector("input[ng-reflect-placeholder='Item Code']");
	//Iteam name
	By IteamNameClick=By.cssSelector("input[ng-reflect-placeholder='Item Name']");
	//CheckBoxClick
	By CheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[2]/div/mat-table/mat-row/mat-cell[1]/mat-checkbox/label/span[1]");
	//Taking Item Code From Item list
	By ItemCodeData=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[2]/div/mat-table/mat-row[1]/mat-cell[4]");
	//Add iteams button1
	By AddIteamsButton2=By.cssSelector("mat-icon[ng-reflect-message='Add Items']");
	//UOM
	By UOMClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select UOM']");
	By UOMSelOpt=By.xpath("//span[contains(text(),'Dispense')]");

	//Batch No
	By BatchNoClick=By.cssSelector("input[ng-reflect-placeholder='Batch No']");

	//Expiray Date 
	By ExpirayDateClick=By.cssSelector("input[data-placeholder='Expiry Date']");

	//Quantity
	By QuantityClick=By.cssSelector("input[ng-reflect-placeholder='Quantity']");

	//Tax
	By TaxClick=By.cssSelector("mat-select[placeholder='Select Tax']");
	By TaxSelopt=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-openingbalance/div/div[1]/mat-table/mat-row/mat-cell[11]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span");

	//Save and submit button
	By SaveSubmitButton=By.cssSelector("button[ng-reflect-message='Save and Submit']");

	//Yes Button
	By YesClick=By.cssSelector("button[ng-reflect-message='Yes']");

	//CLick on ItemCode Menu
	By ItemCodeMenuClick=By.cssSelector("a[id='34053']");

//Selecting store
	By StoreCLick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-item-barcode-dashboard/div/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	//Selecting against
	By againstClick=By.cssSelector("mat-select[ng-reflect-placeholder='Against']");
	By againstSelOpt=By.xpath("//mat-option//span[contains(text(),'GRN')]");
	
	By PrintButton=By.cssSelector("button[ng-reflect-message='Print']");
	
	//Add item
	By AddItemClick=By.cssSelector("button[ng-reflect-message='Add Items']");
	//From Date
	By FromDateClick=By.cssSelector("input[ng-reflect-placeholder='From Date']");
	//Search Button
	By SearchButtonClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-against-grn/div/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/a/mat-icon");
	
	//Row Click
	By RowClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-against-grn/div/div[2]/div[1]/mat-table/mat-row[1]");
	//Check box click
	By CheckBoxCLick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-against-grn/div/div[2]/div[2]/mat-table/mat-row/mat-cell[1]/mat-checkbox/label/span[1]");
	
	//Click on Add button
	By AddClick1=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-against-grn/div/div[3]/div/button");
	//Clicking on barcode
	By barcodeClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-item-barcode-dashboard/div/div[1]/mat-table/mat-row[1]/mat-cell[9]/a[2]");

	public void User_Can_Create_Opening_Balance_Print_BarcodeBY_GRN(String IteamGroupPar,String IteamCategoryPar,String IteamCodePar,String IteamNamePar,String BatchNoPar,String ExpirayDatePar,String QuantityPar) throws InterruptedException, IOException 
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

		//Clicking on opening balance menu
		Thread.sleep(3000);
		driver.findElement(OpeningBalanceClick).click();	

		//Clicking on Add Button "+"
		Thread.sleep(2000);
		driver.findElement(AddButtonClick).click();

		//Clicking on Store Drop down

		Thread.sleep(2000);
		driver.findElement(StoreClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("OP Store 1");
		Thread.sleep(2000);
		driver.findElement(StoreSelOpt).click();

		//Clicking on Add Items Button "+"
		Thread.sleep(2000);
		driver.findElement(AdditemsClick).click();

		/*//Clicking on Iteam Group
		Thread.sleep(2000);
		driver.findElement(ItemGroupClick).sendKeys(IteamGroupPar);

		//Clicking on Iteam Category
		Thread.sleep(2000);
		driver.findElement(IteamCategoryCLick).sendKeys(IteamCategoryPar);

		//Clicking on Iteam Code
		Thread.sleep(2000);
		driver.findElement(IteamCodeClick).sendKeys(IteamCodePar);

		//Clicking on Iteam Name
		Thread.sleep(2000);
		driver.findElement(IteamNameClick).sendKeys(IteamNamePar);*/

		//Clicking on Checkbox
		Thread.sleep(2000);
		driver.findElement(CheckBoxClick).click();

		Thread.sleep(8000);
		WebElement ITEMCODE=driver.findElement(ItemCodeData);
		String IC=ITEMCODE.getText();
		System.out.println("ITEM CODE : "+IC);

		//Clicking on AddIteams
		Thread.sleep(2000);
		driver.findElement(AddIteamsButton2).click();

		/*//Selecting UOM
		Thread.sleep(2000);
		driver.findElement(UOMClick).click();
		Thread.sleep(2000);
		driver.findElement(UOMSelOpt).click();*/

		//Adding batch no
		Thread.sleep(2000);
		driver.findElement(BatchNoClick).sendKeys(BatchNoPar);	

		//Clicking on expiray date
		Thread.sleep(2000);
		driver.findElement(ExpirayDateClick).sendKeys(ExpirayDatePar);

		//Adding batch no
		Thread.sleep(2000);
		driver.findElement(QuantityClick).sendKeys(QuantityPar);

		/*//Selecting Tax
		Thread.sleep(2000);
		driver.findElement(TaxClick).click();
		Thread.sleep(2000);
		driver.findElement(TaxSelopt).click();*/

		//Clicking on save and submit button
		Thread.sleep(2000);
		driver.findElement(SaveSubmitButton).click();
		
		//Clicking on yes
		Thread.sleep(2000);
		driver.findElement(YesClick).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		//Clicking on item code menu
		Thread.sleep(3000);
		driver.findElement(ItemCodeMenuClick).click();
	
		Thread.sleep(3000);
		driver.findElement(StoreCLick1).click();
		Thread.sleep(2000);
		driver.findElement(StoreSelOpt).click();
		
		Thread.sleep(2000);
		driver.findElement(againstClick).click();
		Thread.sleep(2000);
		driver.findElement(againstSelOpt).click();
		
		//Click on Add item
		Thread.sleep(2000);
		driver.findElement(AddItemClick).click();
		
		//From Date
		Thread.sleep(2000);
        WebElement toClear = driver.findElement(FromDateClick);
        toClear.sendKeys(Keys.CONTROL + "a");
        toClear.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		driver.findElement(FromDateClick).sendKeys("01/01/2024");;
			
		Thread.sleep(4000);
		driver.findElement(SearchButtonClick).click();
		
		Thread.sleep(4000);
		driver.findElement(RowClick).click();
		
		Thread.sleep(4000);
		driver.findElement(CheckBoxCLick).click();
		
		Thread.sleep(4000);
		driver.findElement(AddClick1).click();
		
		Thread.sleep(2000);
		driver.findElement(barcodeClick).click();
		
		Thread.sleep(2000);
		driver.findElement(PrintButton).click();
		
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//Item_Barcode_Against_GRN_Print_barcode.png")); 

	}
	public Item_Barcode_Against_GRN_Print_barcode(WebDriver driver)
	{
		this.driver=driver;
	}
}
