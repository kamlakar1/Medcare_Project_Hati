package BillingPages_2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IP_Charges_For_Self_Payer 
{
	WebDriver driver=null;
	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//span[contains(text(),'ADT')]");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.xpath("//span[contains(text(),'Admission Form')]");
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	//IP Charges
	By IPChargesClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/ul/li[5]/a/span[1]");
	By ADT=By.xpath("//span[contains(text(),'ADT')]");
	By AdmissionDashboard=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]");

	//advanced search
	By AdvancedSearchClick2=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By MRNCLick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick2=By.cssSelector("button[ng-reflect-message='Search']");

	//Taking MRN From dashboard
	By MRNClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");
	//service Type
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	By ServiceTypeClick=By.cssSelector("mat-select[ng-reflect-name='serviceType']");
	By ServiceSelOpt=By.xpath("//span[contains(text(),'Service')]");

	//Service Name
	By ServiceNameClick=By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceNameSelOpt=By.xpath("//span[contains(text(),'Laparotomy - exploratory')]");

	//Specialty
	By SpecialityClick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By SpecialitySelOpt=By.xpath("//span[contains(text(),'Rehabilitation')]");

	//Payer
	By PayerClick=By.cssSelector("mat-select[ng-reflect-name='payer']");
	By PayerSelOpt=By.xpath("//span[contains(text(),'Self')]");
	//Add Service Button
	By ServiceButtonClick=By.cssSelector("button[ng-reflect-message='Add Service']");
	//Save Button
	By SaveButtonClick=By.cssSelector("button[type='submit']");
	//Yes Button 
	By YesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	public void IPChargesForSelPayer() throws InterruptedException, IOException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		//ADT
		Thread.sleep(3000);
		driver.findElement(ADT).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(3000);
		driver.findElement(AdmissionDashboard).click();

		Thread.sleep(10000);
		WebElement MRN1=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]"));
		String MRNS=MRN1.getText();
		System.out.println("MRN Number:"+MRNS);

		Thread.sleep(4000);
		Actions act1 = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(mainmenuADTScreen);
		act1.moveToElement(ele2).build().perform();
		act1.click(ele2).perform();

		Thread.sleep(3000);
		driver.findElement(BillingMenuClik).click();

		//Over the slide bar in Billing menu Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(3000);
		driver.findElement(IPChargesClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick2).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick).sendKeys(MRNS);

		Thread.sleep(3000);
		driver.findElement(SearchButtonClick2).click();

		/*//Selecting type of Service
		Thread.sleep(2000);
		driver.findElement(ServiceTypeClick).click();
		//Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Service");
		Thread.sleep(1000);
		driver.findElement(ServiceSelOpt).click();*/

		//Selecting Service Name
		Thread.sleep(2000);
		driver.findElement(ServiceNameClick).sendKeys("Laparotomy");
		Thread.sleep(2000);
		driver.findElement(ServiceNameSelOpt).click();

		//Selecting type of Specialty
		Thread.sleep(2000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Rehabilitation");
		Thread.sleep(1000);
		driver.findElement(SpecialitySelOpt).click();

		/*//Selecting type of Service
		Thread.sleep(2000);
		driver.findElement(PayerClick).click();
		//Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(PayerSelOpt).click();*/

		//Service button click
		Thread.sleep(2000);
		driver.findElement(ServiceButtonClick).click();

		//Save button click
		Thread.sleep(2000);
		driver.findElement(SaveButtonClick).click();

		//Yes Button Click
		Thread.sleep(2000);
		driver.findElement(YesButtonClick).click();
	
		
		/*if (driver.getPageSource().contains("Order update Successfully.")) 
		{
			System.out.println("Order update Successfully");
		}
		else
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File("C:\\Selenium Eclipse WorkSpace\\Medcare_Hati\\ScreenShot\\FailedIP_Charges_For_Self_Payer.png"+ dateFormat.format(date)));
			Assert.assertTrue(false,"Charegs not saved");
		}*/
	}
	public IP_Charges_For_Self_Payer(WebDriver driver)
	{
		this.driver=driver;
	}
}
