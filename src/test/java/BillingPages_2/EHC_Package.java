package BillingPages_2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EHC_Package 
{
	WebDriver driver;
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By BillMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/a/img");
	//Package Config
	By PackageConfigMenu=By.xpath("//span[contains(text(),'PackageConfig')]");
	//ECH Package
	By ECHPackageClick=By.xpath("//span[contains(text(),'EHC Package')]");
	//Add new
	By AddnewClick=By.cssSelector("button[ng-reflect-message='Add New']");
	//Package service name
	By PackageServiceNameClick=By.cssSelector("mat-select[ng-reflect-name='packageService']");
	By PackageServiceNameSelOpt=By.xpath("//span[contains(text(),'Angiography - Arch Aortogram')]");

	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	
	//Applicable unit
	By ApplicableUnitCLick=By.cssSelector("mat-select[ng-reflect-name='applicableUnit']");
	By ApplicableUnitSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[4]/span");

	//Min Age
	By MinAge=By.cssSelector("input[ng-reflect-name='minAge']");

	//Max Age
	By MaxAge=By.cssSelector("input[ng-reflect-name='maxAge']");

	//Dates
	//Effective Start Date
	By StartDateClick=By.cssSelector("input[ng-reflect-name='effectiveFrom']");
	By EndDateClick=By.cssSelector("input[ng-reflect-name='effectiveTo']");

	//Selecting tariff
	By TariffClick=By.cssSelector("mat-select[ng-reflect-name='tariff']");
	By TariffSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/mat-pseudo-checkbox");

	//Service Name
	By ServiceNameClcik=By.cssSelector("input[ng-reflect-placeholder='Service Name']");
	By ServiceNameSelOpt=By.xpath("/html/body/div[2]/div/div/div/mat-option[2]/span");

	//Add services
	By AddServicesClick=By.cssSelector("button[ng-reflect-message='Add Service']");
	//Save tab changes
	By SaveTabChangesClick=By.cssSelector("mat-icon[ng-reflect-message='Save Tab Changes']");
	//Save button
	By SaveButtonClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-ehc-package/div[2]/mat-grid-list/div/mat-grid-tile[7]/div/button[2]/span[1]/mat-icon");

	//Save dialog
	By SaveDialogClick=By.cssSelector("button[data-automation-attribute='button-save-dialog']");
	public void EHCPackage(String MinAgePar,String MaxAgePar, String StartDatePar, String EndDatePar) throws InterruptedException 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenu);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		Thread.sleep(3000);
		driver.findElement(BillingMenuClik).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(3000);
		driver.findElement(BillMenu).click();

		//Package Config Menu
		Thread.sleep(4000);
		driver.findElement(PackageConfigMenu).click();

		//ECH Package
		Thread.sleep(4000);
		driver.findElement(ECHPackageClick).click();

		//CLicking on add button
		Thread.sleep(2000);
		driver.findElement(AddnewClick).click();

		//Package service name
		Thread.sleep(2000);
		driver.findElement(PackageServiceNameClick).click();
		Thread.sleep(2000);
		driver.findElement(PackageServiceNameSelOpt).click();

		//Package service name
		Thread.sleep(3000);
		driver.findElement(ApplicableUnitCLick).click();
		//Thread.sleep(4000);
		//driver.findElement(AllDropDownSearch).sendKeys("HATI Intl Specialist Hospital,KL");
		Thread.sleep(4000);
		driver.findElement(ApplicableUnitSelOpt).click();

		//Clicking outside space after clicking ward
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveByOffset(200, 0).click().build().perform();

		//Min Age
		Thread.sleep(2000);
		driver.findElement(MinAge).sendKeys(MinAgePar);

		//Max Age
		Thread.sleep(2000);
		driver.findElement(MaxAge).sendKeys(MaxAgePar);

		//Start date 

		Thread.sleep(2000);
		driver.findElement(StartDateClick).sendKeys(StartDatePar);

		//End date
		Thread.sleep(2000);
		driver.findElement(EndDateClick).sendKeys(EndDatePar);

		//Selecting tariff
		Thread.sleep(2000);
		driver.findElement(TariffClick).click();
		Thread.sleep(2000);
		driver.findElement(TariffSelOpt).click();

		//Clicking outside space after clicking ward
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		action1.moveByOffset(400, 0).click().build().perform();

		Thread.sleep(2000);
		driver.findElement(ServiceNameClcik).sendKeys("Lap");
		Thread.sleep(2000);
		driver.findElement(ServiceNameSelOpt).click();

		//Add services
		Thread.sleep(2000);
		driver.findElement(AddServicesClick).click();
		
		//Save Tab Changes
		Thread.sleep(2000);
		driver.findElement(SaveTabChangesClick).click();
		

		//Clicking on save button
		Thread.sleep(3000);
		driver.findElement(SaveButtonClick).click();

		//Selecting dialog button
		Thread.sleep(2000);
		driver.findElement(SaveDialogClick).click();


	}

	public EHC_Package(WebDriver driver)
	{
		this.driver=driver;
	}
}
