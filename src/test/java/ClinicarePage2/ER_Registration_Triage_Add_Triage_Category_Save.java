package ClinicarePage2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ER_Registration_Triage_Add_Triage_Category_Save  {

	WebDriver driver=null;

	//----Main Menu---//

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By Menulk = By.cssSelector("img[src='assets/demo/images/icons/grid.png']");
	By ER=By.cssSelector("img[src='../../../assets/images/master-icons/ER.png']");
	By SecondarySurvey=By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/ERASSEQ.png']");
	By ES = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/ERES.png']");
	//By Anesthesia = By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[4]/p-scrollpanel/div/div[1]/div/div[2]/div[8]/div");

	//----Serach Name_MPI and add the primary and secodary survey---//
	By Name_MPI=By.cssSelector("input[id='Name/MPI']");
	By mpi = By.cssSelector("input[formcontrolname='mpi']");
	By Search=By.id("Search");
	By Continue = By.xpath("//span[contains(text(),'Continue')]");
	By PrimarySurvey = By.cssSelector("a[aria-label='Primary Survey']");
	By Triage=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-table/div/div/table/tbody/tr/td[3]/div/button");
	By isAlert=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-dialog[1]/div/div/div[3]/app-er-triage/app-patient-triage/p-scrollpanel/div/div[1]/div/div/div/div[1]/div[2]/p-checkbox/div");
	By AlertDescription=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-dialog[1]/div/div/div[3]/app-er-triage/app-patient-triage/p-scrollpanel/div/div[1]/div/div/div/div[1]/div[3]/input");
    By AlertSave=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-dialog[1]/div/div/div[3]/app-er-triage/app-patient-triage/p-scrollpanel/div/div[1]/div/div/div/div[1]/div[4]/div/div[2]/app-lt-post-button/button");
	By Vulnerability=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-dialog[1]/div/div/div[3]/app-er-triage/app-patient-triage/p-scrollpanel/div/div[1]/div/div/div/div[5]/div[2]/p-radiobutton[1]");
	By VulnerabilityOption=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-dialog[1]/div/div/div[3]/app-er-triage/app-patient-triage/p-scrollpanel/div/div[1]/div/div/div/div[5]/div[3]/div[1]/div/p-multiselect");
	By VulnerabilitySelOpt=By.xpath("/html/body/div[4]/div/div/div[2]/ul/p-multiselectitem[2]/li");
	By VulnerabilitySave=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-dialog[1]/div/div/div[3]/app-er-triage/app-patient-triage/p-scrollpanel/div/div[1]/div/div/div/div[5]/div[4]/div/div[2]/app-lt-post-button/button");
	By Close=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-er-q/div/div/div/p-dialog[1]/div/div/div[2]/div/button[2]");
	
	public ER_Registration_Triage_Add_Triage_Category_Save (WebDriver driver)

	{
		this.driver=driver;

	}
	public void Add_Triage_Category(String PatientMRN) throws InterruptedException, IOException, AWTException 

	{

		Thread.sleep(14000);

		//----Main Menu---//

		driver.findElement(mainmenu).click();
		Thread.sleep(12000);
		driver.findElement(ER).click();
		Thread.sleep(10000);


		// Handling a new window/tab if opened
		String mainWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // Switch back to the original tab
		Thread.sleep(14000);

		driver.findElement(SecondarySurvey).click();
		Thread.sleep(3000);
		driver.findElement(ES).click();
		Thread.sleep(5000);

		//----Serach Name_MPI and add the primary and secodary survey---//
		Thread.sleep(3000);
		driver.findElement(Name_MPI).sendKeys(PatientMRN);
		Thread.sleep(3000);
		driver.findElement(Search).click();
		Thread.sleep(3000);
		//driver.findElement(Continue).click();
		//Thread.sleep(3000);
		//driver.findElement(PrimarySurvey).click();

		/*Thread.sleep(8000);
	
		Robot robot = new Robot(); for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); */
			
			Thread.sleep(3000);
			driver.findElement(Triage).click();
			
			Thread.sleep(5000);
			driver.findElement(isAlert).click();
			
			Thread.sleep(5000);
			driver.findElement(AlertDescription).sendKeys("danger or opportunity. watchful is the least explicit term");
			
			Thread.sleep(3000);
			driver.findElement(AlertSave).click();
			
			/*Thread.sleep(4000);
			driver.findElement(Vulnerability).click();
			
			Thread.sleep(3000);
			driver.findElement(VulnerabilityOption).click();			
			Thread.sleep(3000);
			driver.findElement(VulnerabilitySelOpt).click();
			
			Thread.sleep(3000);
			driver.findElement(VulnerabilitySave).click();		*/	
			
			Thread.sleep(3000);
			driver.findElement(Close).click();
			
	}
}
