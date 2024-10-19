package BillingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Store_Indent_Dashboard_Advanced_search {


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//BillingIcon 
	By Inventory=By.xpath("//span[contains(text(),'Inventory')]");

	By Item_Code  = By.cssSelector("input[ng-reflect-name='itemCode']");

	By SerachArrow = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon");

	By Search = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]/button[1]");


	public Store_Indent_Dashboard_Advanced_search (WebDriver driver)

	{
		this.driver=driver;

	}


	public void AdvanceSearch(String ItemCode) throws InterruptedException 
	{
		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();


		//BillingIcon
		Thread.sleep(800);
		driver.findElement(Inventory).click();
		Thread.sleep(800);
		driver.findElement(SerachArrow).click();
		Thread.sleep(800);
		driver.findElement(Item_Code).sendKeys(ItemCode);	
		Thread.sleep(800);
		driver.findElement(Search).click();
		Thread.sleep(800);




	}
}
