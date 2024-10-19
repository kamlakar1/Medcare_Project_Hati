package BillingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Shift_Management_Save {
	
	
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
	By VisitTypeSel=By.xpath("//span[contains(text(),'Daycare')]");
	
	//PayerTypeClick
	By PayerTypeClick=By.cssSelector("mat-select[ng-reflect-name='payerType']");
	
	//PayerTypeSel
	By PayerTypeSel=By.xpath("//span[contains(text(),'Insurance')]");
	
	//PayerClick
	By PayerClick=By.cssSelector("mat-select[ng-reflect-name='payer']");
	
	//PayerSel
	By PayerSel=By.xpath("//span[contains(text(),'AIA Berhad')]");
	
	//Tariff
	By TariffClick=By.cssSelector("mat-select[ng-reflect-name='tariff']");
	
	//TariffSel
	By TariffSel=By.xpath("//span[contains(text(),'Insurance Tariff')]");
	
	//ClassClick
	By ClassClick=By.cssSelector("mat-select[ng-reflect-name='financialClass']");
	
	//ClassSel
	By ClassSel=By.xpath("//span[contains(text(),'First Class')]");
	
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
	

	
  
  public void f() throws InterruptedException 
  {
	//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
	  
	  
	  
  }
}
