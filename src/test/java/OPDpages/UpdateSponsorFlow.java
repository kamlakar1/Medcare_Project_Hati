package OPDpages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UpdateSponsorFlow {
	
	WebDriver driver=null;
	//By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]/a");
	
	
	By EncounterList=By.xpath("//span[contains(text(),'Encounter List')]");
	//MenuIcon 
	
	
		//UpdateSponsor
		
		By UpdateSponsor=By.cssSelector("a[ng-reflect-router-link='updateSponsor']");
		
		//AdvanceSearch
		By Advancesearchclick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
		By NameSearch=By.cssSelector("input[ng-reflect-name='PatienName']");
		By Searchclick=By.cssSelector("button[ng-reflect-message='Search']");
		
		//SelectPatient
		By SelectPatient=By.cssSelector("mat-radio-group[ng-reflect-message='Payer Tariff']");
		
		//AddButton
		By AddButton=By.cssSelector("mat-icon[ng-reflect-message='Add Sponsor']");
		
		//PayerType
		By PayerType=By.cssSelector("mat-select[ng-reflect-name='payerType']");
		By PayertypeSelect=By.xpath("//div[@role='listbox']/mat-option[3]");
		
		//Payer
		By payerclick=By.cssSelector("mat-select[ng-reflect-name='payer']");
		By payerselect=By.xpath("//div[@role='listbox']/mat-option[3]");
		
		//Tariff
		By Tariff=By.cssSelector("mat-select[ng-reflect-name='tariff']");
		By Tariffselect=By.xpath("//div[@role='listbox']/mat-option[5]");
		
		//Contract
		By Contract=By.cssSelector("mat-select[ng-reflect-name='contract']");
		By Contractselect=By.xpath("//div[@role='listbox']/mat-option[3]");
		
		//AssociateCompany 
		By AssociateCompany=By.cssSelector("mat-select[ng-reflect-name='AssociateCompany']");
		By AssocaiteCompanySelect=By.xpath("//div[@role='listbox']/mat-option[3]");
		
		//PolicyNumber
		By PolicyNumber=By.cssSelector("input[formcontrolname='policyNo']");
		
		//EffectiveDate
		By EffectiveDate=By.cssSelector("input[ng-reflect-name='GLEffectiveDate']");
		
		//PayerAdd
		By PayerAdd=By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/add-sponsor-dialog/div[2]/form/div/button/span[1]/mat-icon");
		
		//Confirmation
		By Confirmation=By.cssSelector("mat-icon[ng-reflect-message=\"Yes\"]");
		
		//Save2
		By Savebutton2=By.cssSelector("button[ng-reflect-message='Save Sponsor']");
		
		//Confirmation2 
		By Confirmation2=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		//MRNPath
		By MRNPath=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[3]");
		
		//EcounterList
		By EncounterListClick=By.cssSelector("a[ng-reflect-router-link='patient,patient-encounter-list']");
		
		public UpdateSponsorFlow (WebDriver driver)
		{
			this.driver=driver;
		}
			

  public void UpdateSponsor1(String NamePar,String PolicyNumberPar, String EffectivedatePar) throws InterruptedException, IOException 

  {
	  
	//MenuIcon
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	
	//Refresh
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	Thread.sleep(4000);
	WebElement overforopdslide4=driver.findElement(SideBarMenu);
	act.moveToElement(overforopdslide4).build().perform();
	
	//EcounterS
	Thread.sleep(3000);
	driver.findElement(EncounterListClick).click();

	Thread.sleep(5000);
	String windowHandle = driver.getWindowHandle();

	//Get the list of window handles

	ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
	Thread.sleep(2000);
	driver.switchTo().window((String) tabs.get(2));


	
	Thread.sleep(1000);

	//CreatedMRN
	  Thread.sleep(2000);
	  WebElement MRNGet=driver.findElement(MRNPath);
	  String MRNS=MRNGet.getText();
	  
	  System.out.println("MRN"+MRNS);
	  
		Thread.sleep(2000);
		WebElement overforopdslide3=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide3).build().perform();
	

		Thread.sleep(2000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();
		
	  
	//UpdateSponsor
	  Thread.sleep(2000);
	  driver.findElement(UpdateSponsor).click();
	  
      
	  Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs2.get(3));
  
	  
	  
	 //AdvanceSearch 
	  Thread.sleep(3000);
	  driver.findElement(Advancesearchclick).click();
	  
	  //MRNSearch
	  Thread.sleep(3000);
	  driver.findElement(NameSearch).sendKeys(NamePar);
	  
	  //SearchClick
	  Thread.sleep(3000);
	  driver.findElement(Searchclick).click();
	
      
	  //SelectPatient 
	  Thread.sleep(2000);
	  driver.findElement(SelectPatient).click();
	  
	  //AddButton
	  Thread.sleep(2000);
	  driver.findElement(AddButton).click();
	  
	
	  
	  //PayerType
	  Thread.sleep(2000);
	  driver.findElement(PayerType).click();
	  Thread.sleep(2000);
	  driver.findElement(PayertypeSelect).click();
	  
	  //Payer
	  Thread.sleep(2000);
	  driver.findElement(payerclick).click();
	  Thread.sleep(2000);
	  driver.findElement(payerselect).click();
	  
	  //Tariff
	  Thread.sleep(2000);
	  driver.findElement(Tariff).click();
	  Thread.sleep(2000);
	  driver.findElement(Tariffselect).click();
	  
	  //Contract
	  Thread.sleep(2000);
	  driver.findElement(Contract).click();
	  Thread.sleep(2000);
	  driver.findElement(Contractselect).click();
	  
	  //AssociateCompany 
	  Thread.sleep(2000);
	  driver.findElement(AssociateCompany).click();
	  Thread.sleep(2000);
	  driver.findElement(AssocaiteCompanySelect).click();
	  
	  //PolicyNumber
	  Thread.sleep(2000);
	  driver.findElement(PolicyNumber).sendKeys(PolicyNumberPar);
	  
	  //EffectiveDate 
	  Thread.sleep(2000);
	  driver.findElement(EffectiveDate).sendKeys(EffectivedatePar);
	  
	  //PayerAdd
	  Thread.sleep(2000);
	  driver.findElement(PayerAdd).click();
	  
	  //Confirmation1
	  Thread.sleep(2000);
	  driver.findElement(Confirmation).click();
	
	
	  //Save2
	  Thread.sleep(2000);
	  driver.findElement(Savebutton2).click();
	  
	  //Confirmation2
	  Thread.sleep(2000);
	  driver.findElement(Confirmation2).click();
	  
	

      
  }
}
