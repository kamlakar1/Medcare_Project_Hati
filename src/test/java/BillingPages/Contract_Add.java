package BillingPages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Contract_Add {
	
	
	WebDriver driver=null;
	
	//Menu
	

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
//	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
	
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");
	
	//ContractIcon
	By ContractIcon=By.cssSelector("a[ng-reflect-router-link='contract']");
	
	//AddButton
	By AddButton=By.cssSelector("mat-icon[ng-reflect-message='Add Contract']");
	
	//PayerTypeClick
	By PayerTypeClick=By.cssSelector("mat-select[ng-reflect-name='payerType']");
	
	//PayerTypeSel
	By PayerTypeSel=By.xpath("//span[contains(text(),'Insurance')]");
	
	//PayerClick
	By PayerClick=By.cssSelector("mat-select[ng-reflect-name='payer']");
	
	//PayerSel
	By PayerSel=By.xpath("//span[contains(text(),'AIA Berhad')]");
	
	//ContractDate
	By ContractDate=By.cssSelector("input[ng-reflect-name='contractDate']");
	
	//ContractCode
	By ContractCode=By.cssSelector("input[ng-reflect-name='contractCode']");
	
	//Description
	By Description=By.cssSelector("input[ng-reflect-name='contractName']");
	
	//RefNumber
	By RefNumber=By.cssSelector("input[ng-reflect-name='referenceNumber']");
	
	//ValidFrom
	By validFrom=By.cssSelector("input[ng-reflect-name='validFrom']");
	
	//ValidTo
	By ValidTo=By.cssSelector("input[ng-reflect-name='validTo']");
	
	//Applicable Tariff
	By ApplicbaleTariff=By.cssSelector("mat-select[formcontrolname='applicableTariff']");
	
	//ApplicableTariffSel
	By ApplicableTariffSel=By.xpath("//span[contains(text(),'Insurance Tariff')]");
	
	//FullBackTariff
	By FullBackTariff=By.cssSelector("mat-select[formcontrolname='fullbackTariff']");
	
	//FullBackTariffSel
	By FullBackTariffSel=By.xpath("//mat-option//span[contains(text(),'Insurance Tariff')]");
	
	//GroupClick
	By GroupClick=By.cssSelector("mat-select[formcontrolname='group']");
	
	//GroupSel
	By GroupSel=By.xpath("//span[contains(text(),'Consultation')]");
	
	//SubGroup
	By SubGroup=By.cssSelector("mat-select[ng-reflect-name='subGroup']");
	
	//SubGrpSel
	By SubGrpSel=By.xpath("//span[contains(text(),'Testing')]");
	
	//CopayAdd
	By CopayAdd=By.cssSelector("mat-icon[ng-reflect-message='Add']");
	
	//CoPayNumber
	By CoPayNumber=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-contract/div[1]/mat-tab-group/div/mat-tab-body[1]/div/div/div/table/tbody/tr/td[3]");
	
	//ExclusionTab
	By ExclusionTab=By.cssSelector("div[aria-posinset='2']");
	
	//ExGroupClick
	By ExGroupClick=By.cssSelector("mat-select[ng-reflect-placeholder='Group']");
	
	//ExGroupSel
	By ExGroupSel=By.xpath("//span[contains(text(),'Laboratory')]");
	
	//ExSubGrpClick
	By ExSubGrpClick=By.cssSelector("mat-select[ng-reflect-name='subGroupExc']");
	
	//ExSubGrpSel
	By ExSubGrpSel=By.xpath("//span[contains(text(),'Blood Bank')]");
	
	//ExclusionAdd
	By ExclusionAdd=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-contract/div[1]/mat-tab-group/div/mat-tab-body[2]/div/div[1]/form/mat-grid-list/div/mat-grid-tile[3]/div/div/button/span[1]/mat-icon");
	
	//Service
	By Service=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-contract/div[1]/mat-tab-group/div/mat-tab-body[2]/div/div[2]/div[2]/button");
	
	//ServiceDes
	By ServiceDes=By.cssSelector("input[ng-reflect-placeholder='Description']");
	
	//ServiceCheckBox
	By ServiceCheckBox=By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-service-list-detail/div/div[2]/div[2]/table/tbody/tr/td[1]");
	
	//ServiceSave
	By ServiceSave=By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-service-list-detail/div/div[3]/div/button");
	
	//UnitMappingTab
	By unitMappingTab=By.cssSelector("div[aria-posinset='3']");
	
	//SelectUnit
	By SelectUnit=By.cssSelector("mat-checkbox[id='mat-checkbox-24']");
	
	//ContractSave
	By ContractSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	
	public Contract_Add (WebDriver driver)

	{
		this.driver=driver;

	}

	
	
  public void Contractcreate_1 (String ContractCodePar,String DescriptionPar,String ReferenceNoPar,String ValidToPar,String CoPayNumberPar,String ServiceDesPar) throws InterruptedException 
  {
	  
	  //Menu
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		
		//Thread.sleep(2000);
		Thread.sleep(4000);
		driver.findElement(BillingMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBar);
		act.moveToElement(overforopdslide1).build().perform();

	  
		//BillDisappear
		Thread.sleep(2000);
		driver.findElement(BillDisappear).click();
		
		//ContractIcon
		Thread.sleep(2000);
		driver.findElement(ContractIcon).click();
		
		//AddButton
		Thread.sleep(2000);
		driver.findElement(AddButton).click();
		
		//PayerTypeClick
		Thread.sleep(2000);
		driver.findElement(PayerTypeClick).click();
		
		//PayerTypeSel
		Thread.sleep(2000);
		driver.findElement(PayerTypeSel).click();
		
		//PayerClick
		Thread.sleep(2000);
		driver.findElement(PayerClick).click();
		
		//PayerSel
		Thread.sleep(2000);
		driver.findElement(PayerSel).click();
		
		//CurrentDate 
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
	      String currentDate1 = dateFormat.format(new Date());

	      // Find the input field where you want to enter the current date and send keys
	      WebElement dateInput1 = driver.findElement(ContractDate); // Replace with the actual ID or locator of the input field
	      dateInput1.sendKeys(currentDate1);
		
		
		//ContractDate
		Thread.sleep(2000);
		driver.findElement(ContractDate).sendKeys(currentDate1);
		
		//ContractCode
		Thread.sleep(2000);
		driver.findElement(ContractCode).sendKeys("839998");
		
		//Description
		Thread.sleep(2000);
		driver.findElement(Description).sendKeys("ABDC");

		//RefNumber
		Thread.sleep(2000);
		driver.findElement(RefNumber).sendKeys("9838990");
		
		//ValidFrom
		Thread.sleep(2000);
		driver.findElement(validFrom).sendKeys(currentDate1);
		
		//ValidTo
		Thread.sleep(2000);
		driver.findElement(ValidTo).sendKeys("01/03/2024");
		
		//Applicable Tariff
		Thread.sleep(2000);
		driver.findElement(ApplicbaleTariff).click();
		
		//ApplicableTariffSel
		Thread.sleep(2000);
		driver.findElement(ApplicableTariffSel).click();
		
		//FullBackTariff
		Thread.sleep(2000);
		driver.findElement(FullBackTariff).click();
		
		//FullBackTariffSel
		Thread.sleep(2000);
		driver.findElement(FullBackTariffSel).click();
		
		//GroupClick
		Thread.sleep(2000);
		driver.findElement(GroupClick).click();
		
		//GroupSel
		Thread.sleep(2000);
		driver.findElement(GroupSel).click();
		
		//SubGroup
		Thread.sleep(2000);
		driver.findElement(SubGroup).click();
		
		//SubGrpSel
		Thread.sleep(2000);
		driver.findElement(SubGrpSel).click();
		
		//CopayAdd
		Thread.sleep(2000);
		driver.findElement(CopayAdd).click();
		
		//CoPayNumber
		Thread.sleep(2000);
		driver.findElement(CopayAdd).clear();
		Thread.sleep(2000);
		driver.findElement(CopayAdd).sendKeys("5");
		
		//ExclusionTab
		Thread.sleep(2000);
		driver.findElement(ExclusionTab).click();
		
		
		//ExGroupClick
		Thread.sleep(2000);
		driver.findElement(ExGroupClick).click();
		
		//ExGroupSel
		Thread.sleep(2000);
		driver.findElement(ExGroupSel).click();
		
		//ExSubGrpClick
		Thread.sleep(2000);
		driver.findElement(ExSubGrpClick).click();
		
		//ExSubGrpSel
		Thread.sleep(2000);
		driver.findElement(ExSubGrpSel).click();
		
		//ExclusionAdd
		Thread.sleep(2000);
		driver.findElement(ExclusionAdd).click();
		
		//Service
		Thread.sleep(2000);
		driver.findElement(Service).click();
		
		//ServiceDes
		Thread.sleep(2000);
		driver.findElement(ServiceDes).sendKeys("CT Brain");
		
		//ServiceCheckBox
		Thread.sleep(2000);
		driver.findElement(ServiceCheckBox).click();
		
		//ServiceSave
		Thread.sleep(2000);
		driver.findElement(ServiceSave).click();
		
		//UnitMappingTab
		Thread.sleep(2000);
		driver.findElement(unitMappingTab).click();
		
		//SelectUnit
		Thread.sleep(2000);
		driver.findElement(SelectUnit).click();
		
		//ContractSave
		Thread.sleep(2000);
		driver.findElement(ContractSave).click();

		
		
  }
  
}
