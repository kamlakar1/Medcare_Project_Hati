package InventoryPage;

import static org.testng.Assert.assertTrue;

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



public class Store_Indent_Approval_Approved_Partially_View_details {


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//BillingIcon 
	By Inventory=By.xpath("//span[contains(text(),'Inventory')]");

	By Indent_No  = By.cssSelector("input[ng-reflect-placeholder='Indent No']");
	
	By itemName  = By.cssSelector("input[ng-reflect-name='itemName']");
	

	By SerachArrow = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	
	By Serach_Arrow = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	
	By Notification = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-storestock2/div[1]/mat-grid-list/div/mat-grid-tile[8]/div/button[1]/span[1]/mat-icon");
	

	By Search = By.cssSelector("button[ng-reflect-message='Search']");
	
	
	By KL_OP_Pharmacy = By.xpath("//span[contains(text(),' KL OP Pharmacy ')]");
	By Indent = By.id("30041");
	By Store_Indent_Approval = By.id("30048");
	
	By Exapnd = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	
	By Detailsverfy = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-details-storeindentapproval/div[2]/div/mat-table/mat-row/mat-cell[2]");
	
	By Details = By.cssSelector("a[ng-reflect-message='Details']");
	
	
	public Store_Indent_Approval_Approved_Partially_View_details (WebDriver driver)

	{
		this.driver=driver;

	}


	@SuppressWarnings("deprecation")
	public void Store_Indent_Approval_Approved_Partially_View_detailsfunc(String IndentNo) throws InterruptedException, IOException 
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
		WebElement HoverSideBar=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar).build().perform();
		Thread.sleep(1000);
		driver.findElement(Indent).click();
		Thread.sleep(1000);
		driver.findElement(Store_Indent_Approval).click();
		Thread.sleep(1000);
		driver.findElement(Exapnd).click();
		Thread.sleep(800);
		driver.findElement(Indent_No).sendKeys(IndentNo);
		Thread.sleep(1000);
		driver.findElement(Search).click();
		Thread.sleep(3000);
		
		driver.findElement(Details).click();
		Thread.sleep(3000);
		String kk = driver.findElement(Detailsverfy).getText();
		
		
		String actualString =  kk;

		String expectedString =  kk;

	    Assert.assertEquals(actualString,expectedString, "Details has been searched sucessfully");
	
     	Thread.sleep(1000);
    	File screenshot_9 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_9, new File(".//ScreenShots//Store_Indent_Approval_Approved_Partially_View_details.png")); 
		Thread.sleep(2000);
	
	}
}
