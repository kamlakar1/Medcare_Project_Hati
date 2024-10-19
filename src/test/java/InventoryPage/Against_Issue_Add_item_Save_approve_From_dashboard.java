package InventoryPage;

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



public class Against_Issue_Add_item_Save_approve_From_dashboard {


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//BillingIcon 
	By Inventory=By.xpath("//span[contains(text(),'Inventory')]");

	By Item_Code  = By.cssSelector("input[ng-reflect-name='itemCode']");

	By itemName  = By.cssSelector("input[ng-reflect-name='itemName']");




	By Serach_Arrow = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");

	By Notification = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[1]/mat-grid-list/div/mat-grid-tile[8]/div/button[1]/span[1]/mat-icon");


	By Search = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]/button[1]");




	By Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");


	By Return = By.id("30058");
	By Material_Return_1 =By.id("30059");

	By Add_New = By.cssSelector("button[ng-reflect-message='Add New']");



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




	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	By IndentInput =By.cssSelector("[ng-reflect-placeholder='Indent No']");



	By PedingIndent = By.id("31092");

	By Against =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[1]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By IssueingStoreWise = By.xpath("//span[contains(text(),'Requesting Store Wise')]");

	By Store_1 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");

	By KL_O_Pharmacy = By.xpath("//span[contains(text(),'OP Store 1')]");

	By serachbutton = By.cssSelector("button[ng-reflect-message='Search']");

	By checkboxx = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-pendingindent/div[2]/table/tbody/tr[1]/td[1]/mat-checkbox");


	By Issue = By.id("30042");
	By Material_Return = By.id("30059");

	By Pending_issue = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/mat-tab-header/div/div/div/div[1]");
	By IssueList = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/mat-tab-header/div/div/div/div[2]");

	By Direct_Issue = By.cssSelector("button[ng-reflect-message='Direct Issue']");

	By RequsetinG_Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-directissue/div/mat-grid-list[1]/div/mat-grid-tile[2]/div/mat-form-field");
	By KLOP = By.xpath("//span[contains(text(),'KL OP Pharmacy')]");



	By Selectbatchopt = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option/span");

	By Quantity_12 = By.cssSelector("input[placeholder='Quantity']");

	By add = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-pendinglist/div/div[1]/div/div/table/tbody/tr[2]/td/table/tbody/tr/td[7]/a/mat-icon");


	By Indnoverify = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/div/mat-tab-body[2]/div/div[1]/div/table/tbody/tr[1]/td[3]");

	By PrintIssueList = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialissue/mat-tab-group/div/mat-tab-body[2]/div/div[1]/div/table/tbody/tr/td[11]/a/mat-icon");





	By ReturningStore = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-materialreturn/div/mat-grid-list[1]/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By ReturningStoreselctop = By.xpath("//span[contains(text(),'OP Store 1')]");
	By AcceptingStore = By.xpath("	/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-materialreturn/div/mat-grid-list[1]/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By KL_OP_Pharmacy = By.xpath("//span[contains(text(),' KL OP Pharmacy ')]");
	By Against_1 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-materialreturn/div/mat-grid-list[1]/div/mat-grid-tile[5]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Item = By.xpath("//mat-option//span[contains(text(),'Issue')]");
	By Add_News = By.cssSelector("button[ng-reflect-message='Add Items']");
	By AddItemlist = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By Add_Itms = By.cssSelector("mat-icon[ng-reflect-message='Add Items']");  
	By Quantity_11 = By.cssSelector("input[ng-reflect-placeholder='Quantity']");
	By ReturnReson=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-materialreturn/div/div[1]/mat-table/mat-row/mat-cell[13]/mat-form-field/div/div[1]/div[3]/mat-select");
	By Ordercancellopt =By.xpath("//span[contains(text(),'Not Required')]");
	By Save = By.cssSelector("button[ng-reflect-message='Save']");
	By Yess = By.cssSelector("button[ng-reflect-message='Yes']");
	By SerachArrow = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By ReturnNo = By.cssSelector("input[ng-reflect-placeholder='Return No']");
	By Button = By.cssSelector("button[ng-reflect-message='Search']");
	By Edit_1 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialreturn/div[3]/mat-table/mat-row/mat-cell[12]/a[1]");
	By GetReturnNo=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialreturn/div[3]/mat-table/mat-row[1]/mat-cell[3]");
	By GetItemcode= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-materialreturn/div/div[1]/mat-table/mat-row/mat-cell[1]");
	By checkbox_1234=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-materialreturn/div[3]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By startdate = By.cssSelector("input[ng-reflect-placeholder='From Date']");
	By enddate = By.cssSelector("input[ng-reflect-placeholder='To Date']");
	By searchrec =By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-get-return-issue/div/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/a");
	By issuenorecors =By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-get-return-issue/div/div[2]/div[1]/mat-table/mat-row[1]/mat-cell[1]");
	By checkbix =By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-get-return-issue/div/div[2]/div[2]/mat-table/mat-row/mat-cell[1]/mat-checkbox");

	By calander = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-get-return-issue/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button");

	By Clickonarrowbutton = By.cssSelector("button[aria-label='Previous month']");

	By dateselect = By.xpath("/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[4]/td[4]/button/div[1]");

	public Against_Issue_Add_item_Save_approve_From_dashboard (WebDriver driver)

	{
		this.driver=driver;

	}


	public void Against_Issue_Add_item_Save_approve_From_dashboardfunc() throws InterruptedException, IOException 
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
		driver.findElement(Material_Return_1).click();
		Thread.sleep(800);
		//Clicking outside space after clicking ward
		Thread.sleep(2000);
		driver.findElement(Add_New).click();
		Thread.sleep(800);
		driver.findElement(ReturningStore).click();
		Thread.sleep(1000);
		driver.findElement(ReturningStoreselctop).click();
		Thread.sleep(1000);
		driver.findElement(AcceptingStore).click();
		Thread.sleep(1000);
		driver.findElement(KL_OP_Pharmacy).click();
		Thread.sleep(1000);
		driver.findElement(Against_1).click();
		Thread.sleep(1000);
		driver.findElement(Item).click();
		Thread.sleep(1000);
		driver.findElement(Add_News).click();
		Thread.sleep(4000);
		driver.findElement(calander).click();
		Thread.sleep(5000);
		driver.findElement(Clickonarrowbutton).click();
		Thread.sleep(1000);
		driver.findElement(Clickonarrowbutton).click();
		Thread.sleep(1000);
		driver.findElement(Clickonarrowbutton).click();
		Thread.sleep(1000);
		driver.findElement(Clickonarrowbutton).click();
		Thread.sleep(1000);
		driver.findElement(dateselect).click();
		Thread.sleep(1000);
		driver.findElement(searchrec).click();
		Thread.sleep(1000);
		driver.findElement(issuenorecors).click();
		Thread.sleep(3000);
		driver.findElement(checkbix).click();
		Thread.sleep(1000);
		driver.findElement(Add_Itms).click();
		Thread.sleep(1000);
		driver.findElement(Quantity_11).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(ReturnReson).click();
		Thread.sleep(1000);
		driver.findElement(Ordercancellopt).click();
		Thread.sleep(1000);
		driver.findElement(Save).click();
		Thread.sleep(2000);
		driver.findElement(Yes).click();	
		Thread.sleep(2000);
		String takeindno = driver.findElement(GetReturnNo).getText();
		Thread.sleep(2000);
		driver.findElement(SerachArrow).click();
		Thread.sleep(2000);
		driver.findElement(ReturnNo).sendKeys(takeindno);
		Thread.sleep(2000);
		driver.findElement(Button).click();
		Thread.sleep(3000);
		driver.findElement(checkbox_1234).click();
		Thread.sleep(2000);
		driver.findElement(Approve).click();
		Thread.sleep(1000);
		driver.findElement(Yes).click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://medcare-productqa.hatiintl.com/#/inventory/return/materialreturn-dashboard");
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Against_Issue_Add_item_Save_approve_From_dashboard.png")); 
		Thread.sleep(1000);


	}
}
