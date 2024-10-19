package InventoryPages;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Store_Indent_Approval_Approved_Full_View_details {


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By Inventory=By.xpath("//span[contains(text(),'Inventory')]");
	By Indent=By.xpath("//*[@id='30041']/img");
	By StoreIndent = By.xpath("//*[@id='30047']/img");
	By Indent_No  = By.cssSelector("input[ng-reflect-placeholder='Indent No']");
	
	//Add Button
		By AddButtonClick=By.cssSelector("button[ng-reflect-message='Add New']");
		
		By RequestingStore=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-storeindent/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
		By RequestingStoreSelOpt=By.xpath("//span[contains(text(),'OP Store 1')]");
		
		By IssuingStore=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-storeindent/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field/div/div[1]/div[3]/mat-select");
		By IssuingStoreSelOpt=By.xpath("//span[contains(text(),'KL OP Pharmacy')]");
		
		By Priority=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-storeindent/div[2]/mat-grid-list/div/mat-grid-tile[5]/div/mat-form-field/div/div[1]/div[3]/mat-select");
		By PrioritySelOpt=By.xpath("//span[contains(text(),'High')]");
		
		By AddItesm=By.cssSelector("button[ng-reflect-message='Add Items']");
		By CheckBox=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
		
		By AddItems2=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem/div/div[3]/div/button/span[1]/mat-icon");
		By IndentQty=By.cssSelector("input[ng-reflect-placeholder='Quantity']");
		By SaveAndSubmit=By.cssSelector("button[ng-reflect-message='Save and Submit']");
		By IndentSaveSucc=By.xpath("//span[contains(text(),'Store Indent Saved Successfully')]");	
		By StoreINdentApproval=By.xpath("//*[@id='30048']/img");
		By CheckBoxApprova=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storeindentapproval/div[2]/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
		By ApproveButton=By.cssSelector("button[ng-reflect-message='Approve']");
		By YesButton=By.cssSelector("button[ng-reflect-message='Yes']");
		By IndentApproveSaveSucc=By.xpath("//span[contains(text(),'Store Indent Approved Successfully')]");	
		public void Store_Indent_Approval_Approved_Full_View_detailsfunc() throws InterruptedException, IOException 
		{
			
		//Clicking on menu Icon
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));	
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();

		//InventoryIcon  Itemcode
		
		Thread.sleep(3000);
		driver.findElement(Inventory).click();
		//WebElement ProcurementMenu = wait.until(ExpectedConditions.elementToBeClickable(Inventory));
		//ProcurementMenu.click();
		
		Thread.sleep(3000);
		WebElement HoverSideBar=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar).build().perform();
		
		
		Thread.sleep(3000);
		driver.findElement(Indent).click();
		
		Thread.sleep(3000);
		driver.findElement(StoreIndent).click();
		//WebElement Indentmenu = wait.until(ExpectedConditions.elementToBeClickable(Indent));
		//Indentmenu.click();
		
		Thread.sleep(3000);
		driver.findElement(AddButtonClick).click();
		//WebElement AddButtonClickweb = wait.until(ExpectedConditions.elementToBeClickable(AddButtonClick));
		//AddButtonClickweb.click();
		
		
		Thread.sleep(2000);
		driver.findElement(RequestingStore).click();
		Thread.sleep(2000);
		driver.findElement(RequestingStoreSelOpt).click();
		/*WebElement RequestingStoreweb = wait.until(ExpectedConditions.elementToBeClickable(RequestingStore));
		RequestingStoreweb.click();
		WebElement RequestingStoreSelOptweb = wait.until(ExpectedConditions.elementToBeClickable(RequestingStoreSelOpt));
		RequestingStoreSelOptweb.click();*/
		
		WebElement IssuingStoreweb = wait.until(ExpectedConditions.elementToBeClickable(IssuingStore));
		IssuingStoreweb.click();
		WebElement IssuingStoreSelOptweb = wait.until(ExpectedConditions.elementToBeClickable(IssuingStoreSelOpt));
		IssuingStoreSelOptweb.click();
		
		WebElement Priorityweb = wait.until(ExpectedConditions.elementToBeClickable(Priority));
		Priorityweb.click();
		WebElement PrioritySelOptweb = wait.until(ExpectedConditions.elementToBeClickable(PrioritySelOpt));
		PrioritySelOptweb.click();
	
		WebElement AddItesmweb = wait.until(ExpectedConditions.elementToBeClickable(AddItesm));
		AddItesmweb.click();
		
		WebElement CheckBoxweb = wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		CheckBoxweb.click();
		
		WebElement AddItems2web = wait.until(ExpectedConditions.elementToBeClickable(AddItems2));
		AddItems2web.click();
		
		WebElement IndentQtyweb = wait.until(ExpectedConditions.elementToBeClickable(IndentQty));
		IndentQtyweb.sendKeys("100");
		
		WebElement SaveAndSubmitweb = wait.until(ExpectedConditions.elementToBeClickable(SaveAndSubmit));
		SaveAndSubmitweb.click();
		
		WebElement YesButtonweb = wait.until(ExpectedConditions.elementToBeClickable(YesButton));
		YesButtonweb.click();
		
		/*Thread.sleep(2000);
		WebElement selectR2=driver.findElement(IndentSaveSucc);
		String SRActual2=selectR2.getText();
		System.out.println("message : "+SRActual2);
		String expected2="Store Indent Saved Successfully";
		Assert.assertEquals(SRActual2,expected2,"Store Indent Saved Successfully");*/
		
		Thread.sleep(3000);
		WebElement HoverSideBar1=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar1).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(StoreINdentApproval).click();
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(300, 0).click().build().perform();
		
		Thread.sleep(4000);
		driver.findElement(CheckBoxApprova).click();
		/*Thread.sleep(2000);
		WebElement CheckBoxApprovaweb = wait.until(ExpectedConditions.elementToBeClickable(CheckBoxApprova));
		CheckBoxApprovaweb.click();*/
		
		Thread.sleep(4000);
		driver.findElement(ApproveButton).click();
		/*WebElement ApproveButtonweb = wait.until(ExpectedConditions.elementToBeClickable(ApproveButton));
		ApproveButtonweb.click();*/
		
		WebElement YesButtonweb1 = wait.until(ExpectedConditions.elementToBeClickable(YesButton));
		YesButtonweb1.click();
		
		Thread.sleep(2000);
		WebElement selectR3=driver.findElement(IndentApproveSaveSucc);
		String SRActual3=selectR3.getText();
		System.out.println("message : "+SRActual3);
		String expected3="Store Indent Approved Successfully";
		Assert.assertEquals(SRActual3,expected3,"Message Should be 'Store Indent Approved Successfully'");
	
	}
	public Store_Indent_Approval_Approved_Full_View_details (WebDriver driver)
	{
		this.driver=driver;
	}

}
