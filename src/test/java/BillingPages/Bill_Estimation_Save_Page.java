package BillingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Bill_Estimation_Save_Page {
	
	
	WebDriver driver=null;
	
	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
	
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");
	
	//BillEstimation
	By BillEstimationIcon=By.cssSelector("a[ng-reflect-router-link='bill-estimate']");
	
	//AddButton
	By AddButton=By.cssSelector("mat-icon[ng-reflect-message='Add Service']");
	
	//Name
	By Name=By.cssSelector("input[ng-reflect-name='name']");
	
	//Age
	By Age=By.cssSelector("input[ng-reflect-name='age']");
	
	//GenderClick
	By Gender=By.cssSelector("mat-select[ng-reflect-name='gender']");
	
	//GenderSel
	By GenderSel=By.xpath("//span[contains(text(),'Male')]");
	
	//ContactNo
	By ContactNo=By.cssSelector("input[ng-reflect-name='contact']");
	
	//VisitTypeClick
	By VisitTypeClick=By.cssSelector("mat-select[ng-reflect-name='visitType']");
	
	//VisitTypeSel
	By VisitTypeSel=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");
	
	//PayerTypeClick
	By PayerTypeClick=By.cssSelector("mat-select[ng-reflect-name='payerType']");
	
	//PayerTypeSel
	By PayerTypeSel=By.xpath("//span[contains(text(),'Self Pay')]");
	
	//PayerClick
	By PayerClick=By.cssSelector("mat-select[ng-reflect-name='payer']");
	
	//PayerSel
	By PayerSel=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]");
	
	//Tariff
	By TariffClick=By.cssSelector("mat-select[ng-reflect-name='tariff']");
	
	//TariffSel
	By TariffSel=By.xpath("//span[contains(text(),'Self Tariff')]");
	
	//ClassClick
	By ClassClick=By.cssSelector("mat-select[ng-reflect-name='financialClass']");
	
	//ClassSel
	By ClassSel=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span");
	
	//Description
	By Description=By.cssSelector("input[ng-reflect-name='description']");
	
	//ServiceName
	By ServiceName=By.cssSelector("input[ng-reflect-placeholder='Service Name']");
	
	//ServiceSel
	By ServiceSel=By.xpath("//span[contains(text(),'CT Brain')]");
	
	//ServiceAdd
	By ServiceAdd=By.cssSelector("button[ng-reflect-message=Add Service']");
	
	//CategoryTab
	By CategoryTab=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-bill-estimation/div/div/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[2]");
	
	//GroupClick
	By GroupClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-bill-estimation/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	
	//GroupSel
	By GroupSel=By.xpath("//span[contains(text(),'Consultation')]");
	
	//SubGroupClick
	By SubGroupClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-bill-estimation/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]");
	
	//SubGroupSel
	By SubGroupSel=By.xpath("//span[contains(text(),'Testing')]");
	
	//GroupAdd
	By GroupAdd=By.cssSelector("mat-icon[ng-reflect-message='Add']");
	
	//Save
	By Save=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	

  public Bill_Estimation_Save_Page (WebDriver driver)
	
	{
		this.driver=driver;
				
	}
	
  
  public void BillEstimationSave(String NamePar,String AgePar,String ContactNoPar, String DescriptionPar,String ServiceNamePar) throws InterruptedException 
  {
	//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
	  
	//BillingIcon
		Thread.sleep(2000);
		driver.findElement(BillingMenu).click();
	
		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBar);
		act.moveToElement(overforopdslide1).build().perform();
	  
		//BillingDisappear
		Thread.sleep(2000);
		driver.findElement(BillDisappear).click();
		
		//BillEstimation
		Thread.sleep(2000);
		driver.findElement(BillEstimationIcon).click();
		
		//AddButton
		Thread.sleep(2000);
		driver.findElement(AddButton).click();
		
		//Name
		Thread.sleep(2000);
		driver.findElement(Name).sendKeys(NamePar);
		
		//Age
		Thread.sleep(2000);
		driver.findElement(Age).sendKeys(AgePar);
		
		//GenderClick
		Thread.sleep(2000);
		driver.findElement(Gender).click();
		
		//GenderSel
		Thread.sleep(2000);
		driver.findElement(GenderSel).click();
		
		//ContactNo
		Thread.sleep(2000);
		driver.findElement(ContactNo).sendKeys(ContactNoPar);
		
		//VisitTypeClick
		Thread.sleep(2000);
		driver.findElement(VisitTypeClick).click();
		
		//VisitTypeSel
		Thread.sleep(2000);
		driver.findElement(VisitTypeSel).click();
		
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
		
		//Tariff
		Thread.sleep(2000);
		driver.findElement(TariffClick).click();
		
		//TariffSel
		Thread.sleep(2000);
		driver.findElement(TariffSel).click();
		
		//ClassClick
		Thread.sleep(2000);
		driver.findElement(ClassClick).click();
		
		//ClassSel
		Thread.sleep(2000);
		driver.findElement(ClassSel).click();
		
		//Description
		Thread.sleep(2000);
		driver.findElement(Description).sendKeys(DescriptionPar);
		
		//ServiceName
		Thread.sleep(2000);
		driver.findElement(ServiceName).sendKeys(ServiceNamePar);
		
		//ServiceSel
		Thread.sleep(2000);
		driver.findElement(ServiceSel).click();
		
		//ServiceAdd
		Thread.sleep(2000);
		driver.findElement(ServiceAdd).click();
		
		//CategoryTab
		Thread.sleep(2000);
		driver.findElement(CategoryTab).click();
		
		//GroupClick
		Thread.sleep(2000);
		driver.findElement(GroupClick).click();
		
		//GroupSel
		Thread.sleep(2000);
		driver.findElement(GroupSel).click();
		
		//SubGroupClick
		Thread.sleep(2000);
		driver.findElement(SubGroupClick).click();
		
		//SubGroupSel
		Thread.sleep(2000);
		driver.findElement(SubGroupSel).click();
		
		//GroupAdd
		Thread.sleep(2000);
		driver.findElement(GroupAdd).click();
		
		//Save
		Thread.sleep(2000);
		driver.findElement(Save).click();

		
		
  }
}
