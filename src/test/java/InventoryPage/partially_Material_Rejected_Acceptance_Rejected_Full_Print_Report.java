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



public class partially_Material_Rejected_Acceptance_Rejected_Full_Print_Report {


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
	
	By Issue = By.id("30042");
	By Material_Issue = By.id("30051");
	
	By Pending_issue = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/mat-tab-header/div/div/div/div[1]");
	By IssueList = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/mat-tab-header/div/div/div/div[2]");
    
	By Direct_Issue = By.cssSelector("button[ng-reflect-message='Direct Issue']");
	
	By RequsetinG_Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-directissue/div/mat-grid-list[1]/div/mat-grid-tile[2]/div/mat-form-field");
	By KLOP = By.xpath("//span[contains(text(),'KL OP Pharmacy')]");
	
	
	By IssuingStore = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-directissue/div/mat-grid-list[1]/div/mat-grid-tile[4]/div/mat-form-field");
	
	By OP_Store_1 = By.xpath("//span[contains(text(),'OP Store 1')]");
	
	By Indent_No  = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/div/mat-tab-body[1]/div/div[1]/div/table/tbody/tr[1]/td[2]");
	
	By Indent__No = By.cssSelector("input[ng-reflect-placeholder='Indent No']");
	//By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	
	By detailsss = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/div/mat-tab-body[1]/div/div[1]/div/table/tbody/tr/td[13]/a");
	
	By Itemdetailscheckbox =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-pendinglist/div/div[1]/div/div/table/tbody/tr/td[1]/mat-checkbox");
	
	By ExpandPlus = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-pendinglist/div/div[1]/div/div/table/tbody/tr/td[2]/a/mat-icon");
	
	By Selectbatch = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-pendinglist/div/div[1]/div/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/mat-form-field/div/div[1]/div[3]/mat-select");
	
	By Selectbatchopt = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option/span");
	
	By Quantity_12 = By.cssSelector("input[placeholder='Quantity']");
	
	By add = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-pendinglist/div/div[1]/div/div/table/tbody/tr[2]/td/table/tbody/tr/td[7]/a/mat-icon");
	
	
	By Indnoverify = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-materialreturn/div/div[1]/mat-table/mat-row/mat-cell[1]");
	
	By PrintIssueList = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/div/mat-tab-body[2]/div/div[1]/div/table/tbody/tr/td[11]/a/mat-icon");
	
	By Return = By.id("30058");
	By Material_Return =By.id("30059");
	
	By Returnno = By.name("requestno");
	
	By Detail_s = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialreturn/div[3]/mat-table/mat-row/mat-cell[13]/a/mat-icon");
	
   public partially_Material_Rejected_Acceptance_Rejected_Full_Print_Report (WebDriver driver)

	{
		this.driver=driver;

	}  
 
	public void partially_Material_Refunc() throws InterruptedException, IOException 
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

		driver.findElement(Return).click();
		Thread.sleep(1000);
		driver.findElement(Material_Return).click();
		Thread.sleep(1000);
		//Clicking outside space after clicking ward
		driver.findElement(Expand).click();
		Thread.sleep(1000);
		driver.findElement(Returnno).sendKeys("HISCKLSTKLO001MRET10044");
		Thread.sleep(1000);
		driver.findElement(serachbutton).click();
		Thread.sleep(1000);
		driver.findElement(Detail_s).click();
		Thread.sleep(1000);
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//partially_Material_Rejected_Acceptance_Rejected_Full_Print_Report.png")); 
		Thread.sleep(1000);


	}
}
