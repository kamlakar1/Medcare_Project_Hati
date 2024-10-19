package InventoryPage;

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



public class Stock_take_request_Add_new_save_View_details {


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


	By Print_1 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-stockregister/div[2]/mat-grid-list/div/mat-grid-tile[7]/div/button/span[2]");

	By IndentInput =By.cssSelector("[ng-reflect-placeholder='Indent No']");

	By Button = By.cssSelector("button[ng-reflect-message='Search']");

	By PedingIndent = By.id("31092");

	By Against =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[1]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By IssueingStoreWise = By.xpath("//span[contains(text(),'Requesting Store Wise')]");

	By Store_1 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By OP_Store_11 = By.xpath("//span[contains(text(),'OP Store 1')]");

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

	By Return = By.id("30090");
	By Material_Return =By.id("30190");
	By Expand = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon");
	By Returnno = By.name("requestno");
	By StockTakeNo =By.cssSelector("input[ng-reflect-placeholder='Stock Take No.']");
	By Detail_s = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialreturn/div[3]/mat-table/mat-row/mat-cell[12]/a[2]");
	By Ssearch = By.cssSelector("button[ng-reflect-message='Search']");
	By print_it = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-stocktakerequest/div[2]/div[1]/table/tbody/tr/td[10]/a[2]/mat-icon");
	By Reprint = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-print-stock-take-request/div/div[3]/button/span[1]/mat-icon");   



	// *********//*****************************
	By ADD_NEWsTOCKREQ = By.cssSelector("button[ng-reflect-message='Add New']");
	By store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-stocktakerequest/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By optstore = By.xpath("//mat-option//span[contains(text(),'OP Store 1')]");
	By Item_Group = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-stocktakerequest/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field");
	By Instrument = By.xpath("//span[contains(text(),'Instrument')]");
	By FromeDate = By.cssSelector("input[ng-reflect-placeholder='From Date']");
	By ToDate = By.cssSelector("input[ng-reflect-placeholder='To Date']");
	By Searchhh = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-stocktakerequest/mat-grid-list/div/mat-grid-tile[8]/div/button/span[1]/mat-icon");
	By save_22 = By.cssSelector("button[ng-reflect-message='Save']");
	By yessbutton = By.cssSelector("button[ng-reflect-message='Yes']");
	By VerifyStock = By.id("30192");

	By storeopt_2 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-verifystock/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By stocktakeno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-verifystock/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By count = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-verifystock/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By countopt = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option");
	By All = By.cssSelector("mat-radio-button[ng-reflect-value='A']");    


	By UploadStock = By.id("30191");
	By storeupload = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-uploadstock/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By UPstocktakeno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-uploadstock/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By stockno = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]");
	By countup = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-uploadstock/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field");
	By countoptup = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option");
	By addnewup =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-uploadstock/div[3]/mat-grid-list/div/mat-grid-tile[8]/div/button/span[1]/mat-icon");
	By cehckboxItemGroup = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batch-up-stock/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By upadditems = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batch-up-stock/div/div[3]/div/button/span[1]/mat-icon");
	By Quantityup = By.cssSelector("input[ng-reflect-placeholder='Quantity']");
    By stocknoget = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-stocktakerequest/div[2]/div[1]/table/tbody/tr[1]/td[2]");
	By srocktakenoo = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]");
    By checkboxxx = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-verifystock/div[3]/table/tbody/tr/td[1]/mat-checkbox");
    By Downlaod = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-uploadstock/div[1]/mat-grid-list/div/mat-grid-tile[5]/div/button[1]");  
    By Upload = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-uploadstock/div[1]/mat-grid-list/div/mat-grid-tile[5]/div/button[2]");
    By choosecsv = By.cssSelector("input[name='csv']");
    By Uplaodd  = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[3]/div/button/span[1]/mat-icon");
    By printreport = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-stocktakerequest/div[2]/div[1]/table/tbody/tr[1]/td[10]/a[2]/mat-icon");
    By repribt = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-print-stock-take-request/div/div[3]/button/span[1]/mat-icon");		
    By detaills = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-stocktakerequest/div[2]/div[1]/table/tbody/tr[1]/td[11]/a[1]/mat-icon");	
    By CancelReason= By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-cancel/div/div[2]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[1]/span");
    By Not_Requiredd = By.xpath("//span[contains(text(),'Not Required')]");
    By ReasonSave = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-cancel/div/div[3]/div/button/span[1]/mat-icon");
    
    public Stock_take_request_Add_new_save_View_details (WebDriver driver)

	{
		this.driver=driver;

	}  

	public void Stock_take_requestfuc() throws InterruptedException, IOException 
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
		Thread.sleep(5000);
		//Clicking outside space after clicking ward
		driver.findElement(ADD_NEWsTOCKREQ).click();
		Thread.sleep(1000);
		driver.findElement(store).click();
		Thread.sleep(1000);
		driver.findElement(optstore).click();
		Thread.sleep(1000);
		driver.findElement(Item_Group).click();
		Thread.sleep(1000);
		//Clicking outside space after clicking ward
		Thread.sleep(2000);
		driver.findElement(Instrument).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveByOffset(200, 0).click().build().perform();
		Thread.sleep(2000);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		String currentDate1 = dateFormat.format(new Date());
		// Find the input field where you want to enter the current date and send keys
		WebElement dateInput1 = driver.findElement(FromeDate); // Replace with the actual ID or locator of the input field
		dateInput1.sendKeys(currentDate1);
		//driver.findElement(fromDateRange).sendKeys(fromDateRangeA);
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yy");
		String currentDate = dateFormat1.format(new Date());
		// Find the input field where you want to enter the current date and send keys
		WebElement dateInput = driver.findElement(ToDate); // Replace with the actual ID or locator of the input field
		dateInput.sendKeys(currentDate);
		Thread.sleep(1000);
		driver.findElement(Searchhh).click();
		Thread.sleep(3000);
		
	//	String getstokno = driver.findElement(stocknoget).getText();
     //   System.out.println(getstokno);
        
		driver.findElement(save_22).click();
		Thread.sleep(1000);
		driver.findElement(yessbutton).click();
		Thread.sleep(3000);
		
		driver.findElement(detaills).click();
		Thread.sleep(3000);
	
		//driver.findElement(Return).click();
		//Thread.sleep(1000);
		
		//	String Curenturl = driver.getCurrentUrl();
		//	Assert.assertEquals(Curenturl, "https://medcare-productqa.hatiintl.com/#/Dashboard/kkkkk");

		Thread.sleep(3000);
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Stock_take_request_Add_new_save_View_details.png")); 
		Thread.sleep(1000);


	}
}
