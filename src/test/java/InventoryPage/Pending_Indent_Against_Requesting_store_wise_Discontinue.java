package InventoryPage;

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



public class Pending_Indent_Against_Requesting_store_wise_Discontinue {


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//BillingIcon 
	By Inventory=By.xpath("//span[contains(text(),'Inventory')]");

	By Item_Code  = By.cssSelector("input[ng-reflect-name='itemCode']");

	By itemName  = By.cssSelector("input[ng-reflect-name='itemName']");


	By SerachArrow = By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	By Serach_Arrow = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");

	By Notification = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[1]/mat-grid-list/div/mat-grid-tile[8]/div/button[1]/span[1]/mat-icon");


	By Search = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]/button[1]");


	By KL_OP_Pharmacy = By.xpath("//span[contains(text(),' KL OP Pharmacy ')]");

	By Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");


	By Indent = By.id("30041");
	By Store_Indent =By.id("30047");

	By Add_New = By.cssSelector("button[ng-reflect-color='accent']");

	By Add_News = By.cssSelector("button[ng-reflect-message='Add Items']");

	By RequestingStore = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-storeindent/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By KLOPPHARMA = By.xpath("//span[contains(text(),' OP Store 1 ')]");

	By Issuing_Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-storeindent/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By KLop= By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[6]/span");


	By Priority = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-storeindent/div[2]/mat-grid-list/div/mat-grid-tile[5]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By High= By.xpath("//span[contains(text(),'High')]");

	By Checkbox =By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");

	By AddItems = By.cssSelector("mat-icon[ng-reflect-message='Add Items']");

	By Quantity = By.cssSelector("input[ng-reflect-placeholder='Quantity']");
	By Approve = By.cssSelector("button[ng-reflect-message='Approve']");

	By Yes = By.cssSelector("button[ng-reflect-message='Yes']");

	By Edit = By.cssSelector("a[ng-reflect-message='Edit']");


	By Saveandapprive= By.cssSelector("button[ng-reflect-message='Save and Submit']");

	By Cancel = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storeindent/div[3]/mat-table/mat-row[1]/mat-cell[15]/a[3]/mat-icon");
	By Cancel_Reason = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-cancel/div/div[2]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[1]");

	By Not_Required =By.xpath("//span[contains(text(),'Not Required')]");

	By Cancell = By.cssSelector("mat-icon[ng-reflect-message='Cancel']");

	By 	Print =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storeindent/div[3]/mat-table/mat-row[1]/mat-cell[15]/a[2]/mat-icon");


	By Checkbox_1 =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storeindent/div[3]/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");

	By Quantity_1 = By.cssSelector("input[ng-reflect-placeholder='Quantity']");
	By Save = By.cssSelector("button[ng-reflect-message='Save']");


	By Yess = By.cssSelector("button[ng-reflect-message='Yes']");

	By storeApproval =By.id("30048");

	By Checkbb =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storeindentapproval/div[2]/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By Details = By.cssSelector("a[ng-reflect-message='Details']");

	By Rejectcehcbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-storeindentapproval/div[2]/div/mat-table/mat-row/mat-cell[1]/mat-checkbox");


	By input_quantity =  By.cssSelector("input[ng-reflect-placeholder='Quantity']");

	By Select_Reason = By.cssSelector("mat-select[ng-reflect-placeholder='Select Reason']");

	By RejectReason = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");

	By RejectingButton = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-storeindentapproval/div[2]/div/mat-table/mat-row/mat-cell[15]/mat-slide-toggle/label/span[1]/span/span[1]");

	By Remarak = By.cssSelector("input[ng-reflect-placeholder='Remarks']");

	By Verifydetailpage =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storeindentapproval/div[2]/mat-table/mat-row[1]/mat-cell[16]/a");

	By Verify =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-storeindentapproval/div[2]/div/mat-table/mat-row/mat-cell[1]/mat-checkbox");

	By Getquantity = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-storeindentapproval/div[2]/div/mat-table/mat-row/mat-cell[13]");



	By IndentNo= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storeindentapproval/div[2]/mat-table/mat-row[1]/mat-cell[3]");


	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	By IndentInput =By.cssSelector("[ng-reflect-placeholder='Indent No']");

	By Button = By.cssSelector("button[ng-reflect-message='Search']");

	By PedingIndent = By.id("31092");

	By Against =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[1]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By IssueingStoreWise = By.xpath("//span[contains(text(),'Requesting Store Wise')]");
	
	By Store_1 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	
	By KL_O_Pharmacy = By.xpath("//span[contains(text(),'OP Store 1')]");
	
	By serachbutton = By.cssSelector("button[ng-reflect-message='Search']");
	
	By checkboxx = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[2]/table/tbody/tr[1]/td[1]/mat-checkbox");
	
	By Againstt = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[4]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Discontinue =By.xpath("//span[contains(text(),'Discontinue')]");
	By Discontinuebutton=By.xpath("button[ng-reflect-message='Discontinue']");
	By Unit = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	
	By HATI_Intl_KL =By.xpath("//span[contains(text(),'HATI Intl Specialist Hospital, KL')]");
	
	By CheckBoxxx= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[3]/table/tbody/tr[1]/mat-cell/mat-checkbox");
	
	By Checkbox3 =By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[2]/div/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By KLopp = By.xpath("//span[contains(text(),'KL OP Pharmacy')]");
	By Itemcode = By.cssSelector("input[ng-reflect-placeholder='Item Code']");
	public Pending_Indent_Against_Requesting_store_wise_Discontinue (WebDriver driver)

	{
		this.driver=driver;

	}


	public void Pending_Indent_Against_Requesting_store_wise_Discontinuefunc() throws InterruptedException, IOException 
	{

		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();


		//InventoryIcon  Itemcode
		Thread.sleep(800);
		driver.findElement(Inventory).click();
		Thread.sleep(8000);

		Thread.sleep(2000);
		WebElement HoverSideBar=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar).build().perform();

		driver.findElement(Indent).click();
		Thread.sleep(1000);
		driver.findElement(Store_Indent).click();
		Thread.sleep(800);
		//Clicking outside space after clicking ward
		Thread.sleep(2000);
		driver.findElement(Add_New).click();
		Thread.sleep(800);
		driver.findElement(RequestingStore).click();
		Thread.sleep(1000);
		driver.findElement(KLOPPHARMA).click();
		Thread.sleep(1000);
		driver.findElement(Issuing_Store).click();
		Thread.sleep(1000);
		driver.findElement(KLopp).click();
		Thread.sleep(1000);
		driver.findElement(Priority).click();
		Thread.sleep(1000);
		driver.findElement(High).click();
		Thread.sleep(1000);
		driver.findElement(Add_News).click();
		Thread.sleep(1000);
		driver.findElement(Itemcode).sendKeys("MED-12333");
		Thread.sleep(1000);
		driver.findElement(Checkbox3).click();
		Thread.sleep(1000);
		driver.findElement(AddItems).click();
		Thread.sleep(1000);
		driver.findElement(Quantity_1).clear();
		Thread.sleep(1000);
		driver.findElement(Quantity_1).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(Saveandapprive).click();
			Thread.sleep(1000);
			driver.findElement(Yess).click();
		//	Thread.sleep(3000);
		//	driver.findElement(Checkbox_1).click();
		//	Thread.sleep(1000);
		//	driver.findElement(Approve).click();
		//	Thread.sleep(1000);
		driver.findElement(Yes).click();
		//	Thread.sleep(3000);
		Thread.sleep(2000);
		WebElement HoverSideBar_1=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar_1).build().perform();
		Thread.sleep(2000);
		driver.findElement(storeApproval).click();
		Thread.sleep(2000);
		driver.findElement(Checkbb).click();	
		Thread.sleep(2000);
		driver.findElement(Details).click();
		Thread.sleep(2000);
		driver.findElement(Rejectcehcbox).click();
		Thread.sleep(2000);
		driver.findElement(input_quantity).clear();
		Thread.sleep(2000);
		driver.findElement(input_quantity).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(Select_Reason).click();
		Thread.sleep(2000);
		driver.findElement(RejectReason).click();
		Thread.sleep(2000);
		//	driver.findElement(RejectingButton).click();
		//Thread.sleep(2000);
		driver.findElement(Remarak).sendKeys("Rejecting");
		Thread.sleep(2000);
		driver.findElement(Approve).click();
		Thread.sleep(2000);
		driver.findElement(Yes).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement HoverSideBar_2=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar_2).build().perform();
		Thread.sleep(2000);

		driver.findElement(PedingIndent).click();
		Thread.sleep(1000);
		driver.findElement(Against).click();
		Thread.sleep(1000);
		driver.findElement(IssueingStoreWise).click();
		Thread.sleep(1000);
		driver.findElement(Unit).click();
		Thread.sleep(1000);
		driver.findElement(HATI_Intl_KL).click();
		Thread.sleep(1000);
		driver.findElement(Store_1).click();
		Thread.sleep(1000);
		driver.findElement(KL_O_Pharmacy).click();
		Thread.sleep(1000);
		driver.findElement(serachbutton).click();
		Thread.sleep(3000);
		driver.findElement(checkboxx).click();
		Thread.sleep(1000);
		driver.findElement(CheckBoxxx).click();
		Thread.sleep(1000);
		driver.findElement(Againstt).click();
		Thread.sleep(1000);
		//driver.findElement(Discontinue).click();
		Thread.sleep(1000);
		//driver.findElement(Discontinuebutton).click();
	    Thread.sleep(1000);
		//Thread.sleep(1000);
		//	driver.findElement(Verify).click();
	//	Thread.sleep(3000);
	//	driver.findElement(Getquantity).click();
	//	String Getquantityvalue = driver.findElement(Getquantity).getText();
//
		//String ActualQuantity = Getquantityvalue;
		//String ExpectedQuantity = "2";
	//	Assert.assertEquals(ActualQuantity, ExpectedQuantity, "Quantity has been verified sucessfully and Approval rejected");
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Pending_Indent_Against_Requesting_store_wise_Discontinue.png")); 
		Thread.sleep(1000);


	}
}
