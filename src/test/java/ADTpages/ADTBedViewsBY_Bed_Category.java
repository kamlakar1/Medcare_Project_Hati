package ADTpages;

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
import org.testng.annotations.Test;

public class ADTBedViewsBY_Bed_Category 
{
	WebDriver driver=null;  

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//img[contains(@src,'../../../assets/images/master-icons/adt.png')]");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	//Bed View
	By BedViewClick=By.cssSelector("a[ng-reflect-router-link='bed-view']");
	//Ward
		By WardClick=By.xpath("//span[contains(text(),'Select Ward')]");
		By WardSelOpt=By.xpath("//span[contains(text(),'Intensive Care Unit (ICU)')]");
		//bed category
		By BedCategoryClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Bed Category']");
		By BedCategorySelopt=By.xpath("//span[contains(text(),'6-Bedded')]");
	//Search
	By SearchCLick=By.cssSelector("mat-icon[ng-reflect-message='Search ']");

	
	

	public void ADT_Bed_View_By_Bed_Catogry() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();
		//Thread.sleep(2000);
		Thread.sleep(3000);
		driver.findElement(ADTMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(10000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(2000);
		driver.findElement(BedViewClick).click();

		Thread.sleep(5000);
		if(driver.getPageSource().contains("Overall Statistics")) 
		{
			System.out.println("Bed View screen has been launched successfully"); 
		} else 
		{
			System.out.println("Bed View Screen failed to open"); 
		}
		//Selecting Ward
		Thread.sleep(2000);
		driver.findElement(WardClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Intensive Care Unit (ICU)");
		Thread.sleep(3000);
		driver.findElement(WardSelOpt).click();

		//Clicking outside space after clicking ward
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(200, 0).click().build().perform();
		
		//Selecting Status
		Thread.sleep(2000);
		driver.findElement(BedCategoryClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("6-Bedded");
		Thread.sleep(3000);
		driver.findElement(BedCategorySelopt).click();

		//Clicking outside space after clicking department
		Thread.sleep(2000);
		Actions action3 = new Actions(driver);
		action3.moveByOffset(200, 0).click().build().perform(); 

		//Clicking on Search
		Thread.sleep(2000);
		driver.findElement(SearchCLick).click();

	
	}
	public ADTBedViewsBY_Bed_Category(WebDriver driver)
	{
		this.driver=driver;

	}

}
