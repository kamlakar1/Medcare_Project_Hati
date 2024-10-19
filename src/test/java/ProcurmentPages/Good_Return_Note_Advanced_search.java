package ProcurmentPages;

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



public class Good_Return_Note_Advanced_search {


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//BillingIcon 
	By Inventory=By.xpath("//span[contains(text(),'Procurement')]");
	By GoodReturnNote =By.id("10006");
	By GoodReturnNotesub = By.id("10601");
	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By Enter_GRNP_No = By.cssSelector("input[ng-reflect-placeholder='Enter GRN No.']");
	By Search = By.cssSelector("button[ng-reflect-message='Search']");
	By Returnno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr/td[3]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");		
   public Good_Return_Note_Advanced_search (WebDriver driver)

	{
		this.driver=driver;

	}


	public void Good_Return_Note_Advanced_searchfunc() throws InterruptedException, IOException 
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
		driver.findElement(Expand).click();
		Thread.sleep(800);
		driver.findElement(Enter_GRNP_No).click();
		Thread.sleep(1000);
		driver.findElement(Search).click();
	    Thread.sleep(3000);
	    String IssueListindvrify = driver.findElement(Returnno).getText();
		String ActualReturnno = IssueListindvrify;
		String ExpectedReturnno = IssueListindvrify;
		Assert.assertEquals(ActualReturnno, ExpectedReturnno, "Returno has been verified sucessfully");
		Thread.sleep(1000);
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Good_Return_Note_Advanced_search.png")); 
		Thread.sleep(1000);


	}
}
