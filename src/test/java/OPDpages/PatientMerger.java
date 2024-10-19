package OPDpages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PatientMerger {

WebDriver driver=null;

//Menu icon
By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
By MainMenuTooltip=By.xpath("/html/body/div[2]");

//OPD Menu
By OPDMenu=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[1]/div/img");
By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
By RegistrationMenu=By.xpath("//*[@id=\"2004\"]/span[1]");

//PatientMerger
By Patientmerge=By.xpath("//*[@id='2008']/span[1]");

//AdvanceSearch
By AdvanceSearchclick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]");

//PatientMRN
By PrimaryPatientMRN=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input");

//SearchClick
By SearchClick1=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[9]/div[2]/button[1]/span[1]/mat-icon");


//AddButton
By AddButtonclick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-merge/div[1]/div/div[2]/button/span[1]/mat-icon");
By SecondPatientsearch=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-patient-block-add/div/div[1]/mat-grid-list/div/mat-grid-tile[1]/div/div/input");
     
//SecondSearchMRN
By PatientMRN=By.xpath("/html/body/div[2]/div[4]/div/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input");

//Searchclcik2
By SearchClick2=By.xpath("/html/body/div[2]/div[4]/div/div/div/div/form/div[9]/div/button[1]/span[1]/mat-icon");


//PatientDetailsPopup
By Popupclick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-patient-block-add/div/div[6]/div/mat-table/mat-row/mat-cell[1]/img");


//Reason
By Reasonclick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-merge/div[3]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[1]/span");

By Reasonselect=By.xpath("//span[contains(text(),'Patient merge')]");

//Remarks
By Remarksclick=By.xpath("//*[@id=\"mat-input-7\"]");


//Save
By Saveclick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-merge/div[3]/button/span[1]/mat-icon");


public PatientMerger (WebDriver driver)

{
this.driver=driver;

}

  @Test
  public void PatientMerge (String PatientMRNPar,String PatientMRNPar2,String RemarksPar) throws InterruptedException, IOException
  {
	  
	  
	  Thread.sleep(5000);
	   if(driver.getPageSource().contains("OPD > Registration > Patient Merge")) 
	   {
	   System.out.println("PPatient Merge page has been launched successfully"); 
	   } else 
	   {
	   System.out.println("Patient Merge page failed"); 
	   }
	
	  
	  
	  
 Thread.sleep(5000);
 Actions act = new Actions(driver);
 
 WebElement mainMenu=driver.findElement(mainmenu);
 act.moveToElement(mainMenu).build().perform();
 act.click(mainMenu).perform();
 
//OPDMenu
 Thread.sleep(5000);
 driver.findElement(OPDMenu).click();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 //SideMenuBar
	//Thread.sleep(20000);
 WebElement SidebarMenu=driver.findElement(SideBarMenu);
 act.moveToElement(SidebarMenu).build().perform();
 
 //Registration
 Thread.sleep(5000);
 driver.findElement(RegistrationMenu).click();
 /*
 //PatientMerger
 Thread.sleep(5000);
 driver.findElement(Patientmerge).click();
 
 //AdvanceSearch
 Thread.sleep(5000);
 driver.findElement(AdvanceSearchclick).click();
 
 //MRN
 Thread.sleep(5000);
 driver.findElement(PrimaryPatientMRN).sendKeys(PatientMRNPar);
 
 //SearchClick
 Thread.sleep(5000);
 driver.findElement(SearchClick1).click();
 
 //AddButton
 Thread.sleep(2000);
 driver.findElement(AddButtonclick).click();
 
 //SecondPatient
 Thread.sleep(2000);
 driver.findElement(SecondPatientsearch).click();
 
 //PatientMRN
 Thread.sleep(2000);
 driver.findElement(PatientMRN).sendKeys(PatientMRNPar2);
 
 //SearchClick
 Thread.sleep(2000);
 driver.findElement(SearchClick2).click();
 
 //PatientDetailsPopup
 Thread.sleep(2000);
 driver.findElement(Popupclick).click();
 
 //Reason
 Thread.sleep(2000);
 driver.findElement(Reasonclick).click();
 Thread.sleep(2000);
 driver.findElement(Reasonselect).click();
 
 //Remarks
 Thread.sleep(500);
 //driver.findElement(Remarksclick).sendKeys(RemarksPar);
 
 //Save
 Thread.sleep(500);
 driver.findElement(Saveclick).click();
 Thread.sleep(1000);
 
 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(screenshot, new File(".\\ScreenShots\\PatientMerge.png"));  

 
 */
  }
}
