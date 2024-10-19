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

public class Opening_Balance_Dashboard_Advanced_Search 
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
	

	//Clicking on advanced search
	By AdvancedSearchClick=By.xpath("//mat-icon[ contains(text(),'arrow_drop_down')]");

	//Clicking On Iteam code
	By StatusClick=By.cssSelector("mat-select[ng-reflect-name='status']");
	By StatusSelOpt=By.xpath("//span[contains(text(),'Closed')]");
	
	//Store Select
	By StoreClick=By.cssSelector("mat-select[ng-reflect-name='store']");
	By StoreSelOpt=By.xpath("//span[contains(text(),'OP Store 1')]");
	//Click on search button
	By SearchCLick2=By.cssSelector("button[type='submit']");


	public void Opening_Balance_Dashboard_AdvancedSearch() throws InterruptedException, IOException 
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

		//Clicking outside space after clicking department
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		action2.moveByOffset(200, 0).click().build().perform();

		//Clicking on Advanced Search
		Thread.sleep(2000);
		driver.findElement(AdvancedSearchClick).click();
		
		Thread.sleep(2000);
		driver.findElement(StatusClick).click();
		Thread.sleep(2000);
		driver.findElement(StatusSelOpt).click();
		
		Thread.sleep(2000);
		driver.findElement(StoreClick).click();
		Thread.sleep(2000);
		driver.findElement(StoreSelOpt).click();
		
		//Clicking on Search button
		Thread.sleep(2000);
		driver.findElement(SearchCLick2).click();	

		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//OpeningBalanceVerified.png")); 

	}
	public Opening_Balance_Dashboard_Advanced_Search(WebDriver driver)
	{
		this.driver=driver;
	}
}
