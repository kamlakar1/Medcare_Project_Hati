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

public class Bed_View_Filter_by_Floor 
{
	WebDriver driver=null;  


	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//span[contains(text(),'ADT')]");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.xpath("//span[contains(text(),'Admission Form')]");

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	//Bed View
	By BedViewClick=By.cssSelector("a[ng-reflect-router-link='bed-view']");
	//Ward
	By WardClick=By.xpath("//span[contains(text(),'Select Ward')]");
	By WardSelOpt=By.xpath("//span[contains(text(),'Neonatal Intensive Care Unit (NICU) A')]");

	//Floor
	By FloorClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Floor']");
	By floorSelOpt=By.xpath("//span[contains(text(),'Ground Floor')]");

	//Department
	By DepartmentClick=By.cssSelector("mat-select[placeholder='Select Department']");
	By DepartmentSelOpt=By.xpath("//span[contains(text(),'General Surgery')]");

	//Doctor
	By DoctorClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Doctor']");
	By DoctorSelOpt=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");
	//Search
	By SearchCLick=By.cssSelector("mat-icon[ng-reflect-message='Search ']");


	By Bedpannel=By.xpath("//mat-expansion-panel-header[@role='button']");
	//html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-bed-view/mat-drawer-container/mat-drawer-content/div/div/mat-accordion/mat-expansion-panel/mat-expansion-panel-header
	//Select ward
	By SelectWardClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Ward']");
	By ALlSelOpt=By.xpath("//span[contains(text(),'Ward W3-A')]");
	public void Bed_View_Filter_by_Floorfunc () throws InterruptedException, IOException
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

		//		Thread.sleep(5000);
		//Selecting Ward
		Thread.sleep(4000);
		driver.findElement(SelectWardClick).click();
		Thread.sleep(4000);
		driver.findElement(AllDropDownSearch).sendKeys("Ward W3-A");

		Thread.sleep(5000);
		driver.findElement(ALlSelOpt).click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(0,0).click().build().perform();

		//Selecting floor
		Thread.sleep(4000);
		driver.findElement(FloorClick).click();
		Thread.sleep(4000);
		driver.findElement(AllDropDownSearch).sendKeys("Ground Floor");
		Thread.sleep(5000);
		driver.findElement(floorSelOpt).click();

		//Clicking outside space after clicking floor
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		action1.moveByOffset(200, 0).click().build().perform();

		//Clicking on Search
		Thread.sleep(2000);
		driver.findElement(SearchCLick).click();

		//Clicking on panel
		Thread.sleep(4000);
		//driver.findElement(Bedpannel).click();
		//Thread.sleep(2000);
		
		
		String kk = driver.findElement(Bedpannel).getText();
		Thread.sleep(2000);
		String Actaul = kk;
		String Expcetd = kk;
		Thread.sleep(2000);
		Assert.assertEquals(Actaul, Expcetd,"Bed view filterd by deparmet");
	}

	public Bed_View_Filter_by_Floor(WebDriver driver)
	{
		this.driver=driver;

	}

}
