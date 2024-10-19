package ProcurmentPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class Good_Return_Note_Against_GRN_Save_Modify_Submit_view_details {


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//BillingIcon 
	By Inventory=By.xpath("//span[contains(text(),'Procurement')]");
	By GoodReturnNote =By.id("10006");
	By GoodReturnNotesub = By.id("10601");
	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By Collapse = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	By Enter_GRNP_No = By.cssSelector("input[ng-reflect-placeholder='Enter GRN No.']");
	By Search = By.cssSelector("button[ng-reflect-message='Search']");
	By Returnno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr[1]/td[10]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");	
	By Add_new = By.cssSelector("button[ng-reflect-message='Add New']");
	
	By Add_New =By.cssSelector("button[ng-reflect-message='Add New']");
	By Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field");
	By OPStoreoption = By.xpath("//span[contains(text(),'OP Store 1')]");
	By Supplier = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field");
	By supplieropt=By.xpath("//span[contains(text(),' Antah Pharma Sdn Bhd ')]");
	By Against = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field");
    By Direct = By.xpath("//span[contains(text(),'Direct')]");
    By ReferenceNo = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[6]/div/mat-form-field/div/div[1]/div[3]/input");	
	By Due_Date = By.cssSelector("input[ng-reflect-placeholder='Choose a date']");
	By AddItems= By.cssSelector("button[ng-reflect-message='Add Items']");
	
	By Stationarybox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By adds = By.cssSelector("mat-icon[ng-reflect-message='Add Items']");
	By SelectReason= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[2]/table/tbody/tr/td[15]/mat-form-field");
	By ReturnRequired = By.xpath("//span[contains(text(),' Return Required ')]");
	By reason = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[3]/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field");
	By Save_submit = By.cssSelector("button[ng-reflect-message='Save & Submit']");
	By 	Yes = By.cssSelector("button[ng-reflect-message='Yes']");
	By Checkkkk = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr/td[1]/mat-checkbox");
	By save = By.cssSelector("button[ng-reflect-message='Save']");
	By recordccheckbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr[1]/td[1]/mat-checkbox");
	
	By getreurnno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr[1]/td[3]");
	By retun_no =By.cssSelector("input[ng-reflect-placeholder='Return No']");
	By Details = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr/td[16]/a/mat-icon");
	By ApproveButton = By.cssSelector("button[ng-reflect-message='Approve']");
	
	
	
	By Good_Receipt_Note = By.id("10005");
	By SubGood_Receipt_Note = By.id("10501");
	By Add_Items = By.cssSelector("button[ng-reflect-message='Add Items']");
	By GRN_Against = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-goodreceivenote/div[1]/mat-grid-list[1]/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By GRNAgainstopt = By.xpath("//span[contains(text(),'Direct')]");	
	By St_ore = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-goodreceivenote/div[1]/mat-grid-list[1]/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By OP_Store_1 = By.xpath("//span[contains(text(),' OP Store 1 ')]");
	By Supplierr = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-goodreceivenote/div[1]/mat-grid-list[1]/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By supopt = By.xpath("//span[contains(text(),' Antah Pharma Sdn Bhd ')]");
	By GRN_Type = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-goodreceivenote/div[1]/mat-grid-list[1]/div/mat-grid-tile[6]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By Grnopt = By.xpath("//mat-option//span[contains(text(),'Consumable')]");
	By DoDate = By.cssSelector("input[ng-reflect-placeholder='Enter DO Date']");
	By InvoiceDate = By.cssSelector("input[ng-reflect-placeholder='Enter Invoice Date']");
	By Additemlistcheckbox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[2]/div/mat-table/mat-row[2]/mat-cell[1]/mat-checkbox");
	By additemsbox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[3]/div/button/span[1]/mat-icon");
	By Enterqnty = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-goodreceivenote/div[2]/table/tbody/tr/td[9]/mat-form-field/div/div[1]/div[3]/input");
	By Expirydate = By.cssSelector("input[ng-reflect-placeholder='Expiry Date']");
	By EnterBatchNO = By.cssSelector("input[ng-reflect-placeholder='Enter Batch No']");
	public Good_Return_Note_Against_GRN_Save_Modify_Submit_view_details (WebDriver driver)

	{
		this.driver=driver;

	}


	public void Good_Return_Note_Against_Gfunc() throws InterruptedException, IOException, AWTException 
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

		driver.findElement(GoodReturnNote).click();
		Thread.sleep(1000);
		driver.findElement(GoodReturnNotesub).click();
		Thread.sleep(800);
		//Clicking outside space after clicking ward
		Thread.sleep(2000);
		driver.findElement(Add_New).click();
		Thread.sleep(800);
		driver.findElement(Store).click();
		Thread.sleep(1000);
		driver.findElement(OPStoreoption).click();
		Thread.sleep(1000);
		driver.findElement(Supplier).click();
		Thread.sleep(1000);
		driver.findElement(supplieropt).click();
		Thread.sleep(1000);
		driver.findElement(Against).click();
		Thread.sleep(1000);
		driver.findElement(Direct).click();
		Thread.sleep(1000);
		driver.findElement(ReferenceNo).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(Due_Date).sendKeys("02/02/2025");
		Thread.sleep(1000);
		driver.findElement(AddItems).click();
		Thread.sleep(3000);
		driver.findElement(Stationarybox).click();
		Thread.sleep(1000);
		driver.findElement(adds).click();
		Thread.sleep(5000); 
	
		Robot robot = new Robot();
		for (int i = 0; i < 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(900);
	//	driver.findElement(SelectReason).click();
		//Thread.sleep(1000);
	   // driver.findElement(ReturnRequired).click();
	    Thread.sleep(1000);
		driver.findElement(reason).click();
		Thread.sleep(1000);
		driver.findElement(ReturnRequired).click();
		Thread.sleep(1000);
		driver.findElement(save).click();
		Thread.sleep(1000);
		driver.findElement(Yes).click();
		Thread.sleep(3000);
		
		String getreturnnon = driver.findElement(getreurnno).getText();
	
	//	driver.findElement(recordccheckbox).click();
		Thread.sleep(1000);
		driver.findElement(Expand).click();
		Thread.sleep(1000);
		driver.findElement(retun_no).sendKeys(getreturnnon);
		Thread.sleep(1000);
		driver.findElement(Search).click();
		Thread.sleep(1000);
		driver.findElement(Checkkkk).click();
		Thread.sleep(1000);
		driver.findElement(ApproveButton).click();
		Thread.sleep(1000);
		driver.findElement(Yes).click();
		Thread.sleep(1000);
		driver.findElement(Details).click();
	    Thread.sleep(3000);
	    String IssueListindvrify = driver.findElement(Returnno).getText();
		String ActualReturnno = IssueListindvrify;
		String ExpectedReturnno = IssueListindvrify;
		Assert.assertEquals(ActualReturnno, ExpectedReturnno, "Returno has been verified sucessfully");
		Thread.sleep(1000);
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Good_Return_Note_Against_GRN_Save_view_details.png")); 
		Thread.sleep(1000);


	}
}
