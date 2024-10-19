package BillingPages_2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ADT_Req_Insurance_IP_Charges_Charge_Conversion_Insurance_To_Self 
{
	WebDriver driver;
	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div[3]/div/img");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.xpath("//span[contains(text(),'Admission Form')]");
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	//IP Charges

	By ADT=By.xpath("//app-sidebar//span[contains(text(),'ADT')]");
	By AdmissionDashboard=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]");

	//MRN From dash board
	By DashMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");

	By IPChargesClick=By.xpath("//*[@id='69999']/img");
	//advanced search
	By AdvancedSearchClick2=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By MRNCLick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick2=By.cssSelector("button[ng-reflect-message='Search']");

	//Taking MRN From dashboard
	//By MRNClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");
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


	//Add Service Button
	By ServiceButtonClick=By.cssSelector("button[ng-reflect-message='Add Service']");

	//Payer
	By PayerClick=By.cssSelector("mat-select[ng-reflect-name='payer']");
	By PayerSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");

	//Save Button
	By SaveButtonClick=By.cssSelector("button[type='submit']");
	//Yes Button 
	By YesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//Bill menu 
	By BillMenuclick=By.xpath("//*[@id='31']/img");

	//----ChargeConversion---//

	//ChargeConversionIcon
	By ChargeConversionIcon=By.cssSelector("a[ng-reflect-router-link='chargeConversion']");

	//AdvanceSearch
	By PatientSearch=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");


	//PatientMRN
	By PatientMRN=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	//Radio
	//By Radio=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-charge-conversion/app-patient-search/div/div/div/table/tbody/tr[2]/td[1]/div/mat-radio-button/label/span[1]/span[1]");

	//SearchButton
	By SearchButton=By.cssSelector("button[ng-reflect-message='Search']");

	//FromPayerClick
	By FromPayerClick=By.cssSelector("mat-select[placeholder='Select From Payer']");

	//FromPayerSelect
	By FromPayerSelect=By.xpath("//mat-option//span[contains(text(),'AIA Berhad')]");

	//ToPayerClick
	By ToPayerClick=By.cssSelector("mat-select[placeholder='Select To Payer']");

	//ToPayerSelect
	By ToPayerSelect=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");

	//CheckBox
	By CheckBox=By.cssSelector("mat-checkbox[name='checkAll']");

	//Save
	By Save=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Confirm
	By Confirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	public void IPChargesForSelandInsurance_With_Charge_Conversion() throws InterruptedException, IOException
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
		Thread.sleep(6000);
		driver.findElement(ADTMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(3000);
		driver.findElement(AdmissionDashboard).click();

		Thread.sleep(10000);
		WebElement MRN1=driver.findElement(DashMRN);
		String MRNS=MRN1.getText();
		System.out.println("MRN Number:"+MRNS);

		Thread.sleep(4000);
		Actions act1 = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(mainmenuADTScreen);
		act1.moveToElement(ele2).build().perform();
		act1.click(ele2).perform();

		//......IP CHARGES......//

		Thread.sleep(3000);
		driver.findElement(BillingMenuClik).click();

		//Over the slide bar in Billing menu Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(5000);
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

		//Selecting Service Name
		Thread.sleep(3000);
		driver.findElement(ServiceNameClick).sendKeys("Laparotomy");
		Thread.sleep(2000);
		driver.findElement(ServiceNameSelOpt).click();

		//Selecting self service
		Thread.sleep(2000);
		driver.findElement(PayerClick).click();
		Thread.sleep(3000);
		driver.findElement(PayerSelOpt).click();

		//Service button click
		Thread.sleep(2000);
		driver.findElement(ServiceButtonClick).click();

		//Save button click
		Thread.sleep(2000);
		driver.findElement(SaveButtonClick).click();

		//Yes Button Click
		Thread.sleep(2000);
		driver.findElement(YesButtonClick).click();



		//---ChargeConversion---//

		//Over the slide bar in Billing menu Screen
		Thread.sleep(3000);
		WebElement overforopdslide3=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide3).build().perform();

		//Bill menu click
		Thread.sleep(2000);
		driver.findElement(BillMenuclick).click();

		//ChargeConversionIcon
		Thread.sleep(3000);
		driver.findElement(ChargeConversionIcon).click();

		//AdvanceSearch
		Thread.sleep(2000);
		driver.findElement(PatientSearch).click();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(PatientMRN).sendKeys(MRNS);


		//SearchButton
		Thread.sleep(2000);
		driver.findElement(SearchButton).click();

		//Radio
		//Thread.sleep(2000);
		//driver.findElement(Radio).click();

		//FromPayerClick
		Thread.sleep(2000);
		driver.findElement(FromPayerClick).click();
		//FromPayerSelect
		Thread.sleep(2000);
		driver.findElement(FromPayerSelect).click();

		//ToPayerClick
		Thread.sleep(2000);
		driver.findElement(ToPayerClick).click();
		//ToPayerSelect
		Thread.sleep(2000);
		driver.findElement(ToPayerSelect).click();

		//CheckBox
		Thread.sleep(2000);
		driver.findElement(CheckBox).click();

		//Save
		Thread.sleep(2000);
		driver.findElement(Save).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();

		//Over the slide bar in Billing menu Screen
		Thread.sleep(3000);
		WebElement overforopdslide5=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide5).build().perform();

		Thread.sleep(4000);
		driver.findElement(IPChargesClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick2).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick).sendKeys(MRNS);

		Thread.sleep(3000);
		driver.findElement(SearchButtonClick2).click();


	}
	public ADT_Req_Insurance_IP_Charges_Charge_Conversion_Insurance_To_Self(WebDriver driver)
	{
		this.driver=driver;
	}
}
