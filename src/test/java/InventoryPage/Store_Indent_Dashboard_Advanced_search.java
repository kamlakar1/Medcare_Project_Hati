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



public class Store_Indent_Dashboard_Advanced_search {


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
	public Store_Indent_Dashboard_Advanced_search (WebDriver driver)

	{
		this.driver=driver;

	}


	@SuppressWarnings("deprecation")
	public void AdvanceSearch_1(String ItemCode) throws InterruptedException, IOException 
	{
		
		
		
		
		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();

		//InventoryIcon  Itemcode
		Thread.sleep(2000);
		driver.findElement(Inventory).click();
		Thread.sleep(8000);
		driver.findElement(Store).click();
		Thread.sleep(1000);
		driver.findElement(KL_OP_Pharmacy).click();
		Thread.sleep(800);
		//Clicking outside space after clicking ward
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveByOffset(200, 0).click().build().perform();
		Thread.sleep(800);
		driver.findElement(SerachArrow).click();
		Thread.sleep(800);
		driver.findElement(Item_Code).sendKeys(ItemCode);
		Thread.sleep(1000);
		driver.findElement(Search).click();
		Thread.sleep(1000);
		String ActualItemCode = "CON00004";
		String ExpectedItemCode = "CON00004";
     	Assert.assertEquals(ActualItemCode, ExpectedItemCode,  "Item Code has been searched sucessfully");
     	Thread.sleep(1000);
    	File screenshot_9 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_9, new File(".//ScreenShots//Store_Indent_Dashboard_Advanced_search_by_itemcode.png")); 
		Thread.sleep(2000);
		
	}
		
		
		//Serach by ItemName
		
	
		public void AdvanceSearch_bynme(String ItemName) throws InterruptedException, IOException 
		{
		
		driver.findElement(Serach_Arrow).click();
		Thread.sleep(800);
		driver.findElement(itemName).sendKeys(ItemName);
		Thread.sleep(1000);
		driver.findElement(Search).click();
		Thread.sleep(1000);
		String ActualItem_Code = ItemName;
		String ExpectedItem_Code = ItemName;
     	Assert.assertEquals(ActualItem_Code, ExpectedItem_Code,  "Item name has been searched sucessfully");
     	Thread.sleep(1000);
    	File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Store_Indent_Dashboard_Advanced_search_by_name.png")); 
		Thread.sleep(2000);
		
		

	}
}
