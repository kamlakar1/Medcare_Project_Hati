package InventoryPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Batch_Change_Approval_Dashboard_Advanced_search 
{
	WebDriver driver;

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	//InventoryMenu
	By InventoryMenuClick=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	//Opening balance menu
	By BatchChangeClick=By.xpath("//*[@id='30097']/img");
	By BatchChangeApprovalSubMenu=By.xpath("//*[@id='32097']/img");

	//Store Stock
	By StoreStockClick=By.xpath("//*[@id='30043']/img");
	//Clicking on advanced search
	By AdvancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//Clicking On Iteam code
	By StatusClick=By.cssSelector("mat-select[ng-reflect-name='status']");
	By StatusSelOpt=By.xpath("//span[contains(text(),'Closed')]");
	
	//Store Select
	By ApprovalStatusClick=By.cssSelector("mat-select[ng-reflect-name='approvalStatus']");
	By ApprovalStatusSelOpt=By.xpath("//span[contains(text(),'Approved')]");
	//Click on search button
	By SearchCLick2=By.cssSelector("button[type='submit']");

	public void BatchchangeApproval_Advanced_Search() throws InterruptedException, IOException 
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

		Thread.sleep(5000);
		driver.findElement(StoreStockClick).click();	
		
		//Clicking on Adjustment
		Thread.sleep(4000);
		driver.findElement(BatchChangeClick).click();	
		
		/*Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(400, 0).click().build().perform();*/
		
		//Click on Stock Adjustment
		Thread.sleep(3000);
		driver.findElement(BatchChangeApprovalSubMenu).click();

		//Clicking on Advanced Search
		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick).click();
		
		Thread.sleep(2000);
		driver.findElement(StatusClick).click();
		//Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Pending");
		Thread.sleep(3000);
		driver.findElement(StatusSelOpt).click();
		
		Thread.sleep(2000);
		driver.findElement(ApprovalStatusClick).click();
		//Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Approved");
		Thread.sleep(2000);
		driver.findElement(ApprovalStatusSelOpt).click();
		
		//Clicking on Search button
		Thread.sleep(2000);
		driver.findElement(SearchCLick2).click();	

		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//Batch_change_dashboard_Advanced_Search.png")); 

	}
	public Batch_Change_Approval_Dashboard_Advanced_search(WebDriver driver)
	{
		this.driver=driver;
	}
}
