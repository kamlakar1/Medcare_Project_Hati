package LabPages;
import java.awt.AWTException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.google.common.io.Files;
import com.jayway.jsonpath.internal.Path;

import OPDTest.DeleteExcelRowWithSelenium;
import io.github.bonigarcia.wdm.WebDriverManager;

public class humspage
{
	//private static final By UploadImhe = null;
	WebDriver driver;
	//By Search=By.xpath("mat-icon[mattooltip='Search']");

	By Username = By.cssSelector("input[name='accessCode']");
	By Password = By.cssSelector("input[name='password']");
	By Login = By.id("lnb6");
	By Unit = By.xpath("/html/body/div/div[1]/div[13]/div[1]/div/div[3]/nav/div[2]/ul/li[5]/a/span");
	By ExpandUnitdropdown = By.cssSelector("select[ng-change='changeUnit(selectedUnit)']");
	By Poliklink = By.cssSelector("option[label='Pusat rawatan Warga']");
	By MrnName = By.cssSelector("input[ng-model='mrn']");
	By SelectMRN = By.xpath("/html/body/div/div[1]/div[13]/div[2]/div[1]/div/ul/li/a");
	By ClickOnSerachPatent = By.xpath("/html/body/div/div[1]/div[14]/div/div[1]/div/div/div/table[6]/thead/tr/th[1]/span[1]");
	By ClickonPatient = By.xpath("/html/body/div/div[1]/div[14]/div/div[1]/div/div/div/table[6]/tbody/tr[1]/td[1]/div[2]/span/span[1]");
	By Primary_Health_Care = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[5]/div/div/div[2]/div/table/tbody/tr[2]/td");
	By NotePrimaryhelatcare = By.xpath("/html/body/div/div[1]/div[13]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td[1]/span/span");

	By getext = By.xpath("/html/body/div/div[2]/section/div[2]/fieldset/div[1]/table/tbody/tr[1]/td[4]/p/span");
	By ClinicalNoteName = By.xpath("/html/body/div/div[2]/section/div[1]/div[2]/div");


	By Date_Time = By.xpath("/html/body/div/div[2]/section/div[2]/div[2]/fieldset[1]/form/div[2]/div/div/div[2]/div/div[2]");
	By tableRecords = By.xpath("/html/body/div/div[1]/div[13]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]");
	By Goback = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/span[1]/a/i");
	public humspage(WebDriver driver)
	{
		this.driver=driver;
	}


	public void HumsFunc() throws InterruptedException, IOException, AWTException, ParseException 
	{



		// Create ChromeOptions to enable headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Run in headless mode
		options.addArguments("--disable-gpu"); // Disable GPU acceleration (optional)
		options.addArguments("--window-size=1920,1080"); // Optional for setting screen size
		// Initialize WebDriver with ChromeOptions
		WebDriver driver = new ChromeDriver(options);

		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();

		//UAT https://clinicare-uat.ums.edu.my/Clinicare/#/
		// prod :- https://clinicare.ums.edu.my/Clinicare/#/

		driver.get("https://clinicare-humsqa.hatiintl.com/Clinicare/");
		Thread.sleep(8000);
		driver.manage().window().maximize();

		//DeleteExcelRowWithSelenium data = new DeleteExcelRowWithSelenium();
		//String EnterPatientName = data.TkaePatientName;



		//String EnterPatientName2 = Double.toString(EnterPatientName);

		Thread.sleep(5000);
		// Login Page
		driver.findElement(Username).sendKeys("yokesimt@ums.edu.my");
		Thread.sleep(1000);
		driver.findElement(Password).sendKeys("abcd@1234");
		Thread.sleep(1000);
		driver.findElement(Login).click();
		Thread.sleep(20000);

		// Select unit patient and MRN search page
		driver.findElement(Unit).click();
		Thread.sleep(4000);
		driver.findElement(ExpandUnitdropdown).click();
		Thread.sleep(4000);
		driver.findElement(Poliklink).click();		
		Thread.sleep(5000);


		for (int t = 0;  t<=2; t++){
			Thread.sleep(5000);
			DeleteExcelRowWithSelenium data = new DeleteExcelRowWithSelenium();
			double EnterPatientName = data.TkaePatientName;	
			
			String k = Double.toString(EnterPatientName);
			
			driver.findElement(MrnName).sendKeys(k);        
			Thread.sleep(14000);
			driver.findElement(SelectMRN).click();
			Thread.sleep(4000);
			driver.findElement(ClickOnSerachPatent).click();
			Thread.sleep(4000);
			driver.findElement(ClickonPatient).click();
			Thread.sleep(14000);
			driver.findElement(Primary_Health_Care).click();
			Thread.sleep(30000);

			Actions actions = new Actions(driver);
			String originalWindow = driver.getWindowHandle();

			// Define the base XPath for rows
			String baseXPath = "/html/body/div/div[1]/div[13]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/table/tbody/tr";
			java.util.List<WebElement> rows = driver.findElements(By.xpath(baseXPath));
			int numberOfRows = rows.size();

			// Create or load an existing Excel workbook
			String excelFilePath = "C:\\Users\\Kamlakar\\PatientData.xlsx";
			Workbook workbook;
			Sheet sheet;

			File excelFile = new File(excelFilePath);
			if (excelFile.exists()) {
				FileInputStream fileInputStream = new FileInputStream(excelFile);
				workbook = new XSSFWorkbook(fileInputStream);
				sheet = workbook.getSheetAt(0); // Load the first sheet
			} else {
				workbook = new XSSFWorkbook();
				sheet = workbook.createSheet("PatientData");

				// Add headers to the Excel sheet (optional, do this only once)
				Row headerRow = sheet.createRow(0);
				headerRow.createCell(0).setCellValue("MRN Name");
				headerRow.createCell(1).setCellValue("Clinical Note Name");
				headerRow.createCell(2).setCellValue("Date");
				headerRow.createCell(3).setCellValue("PDF File Name");
			}

			// Initialize the row index for writing data to Excel
			int excelRowIndex = sheet.getLastRowNum() + 1; // Start from the next row

			// Loop through the rows in the web page table
			for (int i = 1; i <= numberOfRows; i++) {
				// Generate XPath for the current row
				String rowXPath = baseXPath + "[" + i + "]/td[1]/span/span";
				WebElement row = driver.findElement(By.xpath(rowXPath));
				System.out.println("Processing row " + i + ": " + row.getText());

				actions.moveToElement(row).perform();
				Thread.sleep(1000);

				// Click on the row to open details in a new tab
				row.click();
				Thread.sleep(5000);

				ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
				if (tabs.size() > 1) {
					driver.switchTo().window(tabs.get(1));
					Thread.sleep(18000);

					// Retrieve required information
					String getmrnmae = driver.findElement(getext).getText();
					String Date_Time_1 = driver.findElement(Date_Time).getText();
					String ClinicalNoteName_1 = driver.findElement(ClinicalNoteName).getText();
					String[] dateTimeParts = Date_Time_1.split(" ");  // Split by space
					String dateOnly = dateTimeParts[0] + " " + dateTimeParts[1] + " " + dateTimeParts[2];

					// Generate file name
					String fileName = ClinicalNoteName_1.replace(" ", "_")
							.replace(",", "")
							.replace(":", "")
							.concat("_")
							.concat(Date_Time_1.replace(" ", "_")
									.replace(",", "")
									.replace(":", ""))
							.concat(".pdf");

					String folderPath = System.getProperty("user.home") + "/Desktop/" + getmrnmae;
					File directory = new File(folderPath);

					if (!directory.exists()) {
						directory.mkdir();
					}

					String filePath = folderPath + "/" + fileName;

					// Capture the page as a PDF and save it to the specified folder
					DevTools devTools = ((ChromeDriver) driver).getDevTools();
					devTools.createSession();
					devTools.send(Page.enable());

					Page.PrintToPDFResponse pdf = devTools.send(Page.printToPDF(Optional.empty(), Optional.empty(), Optional.empty(),
							Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
							Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
							Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));

					byte[] pdfData = Base64.getDecoder().decode(pdf.getData());
					try (FileOutputStream fos = new FileOutputStream(filePath)) {
						fos.write(pdfData);
					}


					// Save the PDF logic (omitted for brevity)

					// Write data to Excel sheet
					Row excelRow = sheet.createRow(excelRowIndex++); // Create a new row in the Excel sheet
					excelRow.createCell(0).setCellValue(getmrnmae); // First column: MRN name
					excelRow.createCell(1).setCellValue(ClinicalNoteName_1); // Second column: Clinical Note Name
					excelRow.createCell(2).setCellValue(dateOnly);  // Date only 
					excelRow.createCell(3).setCellValue(fileName); // Third column: PDF file name

					// Close the current tab and switch back to the original tab
					driver.close();
					driver.switchTo().window(originalWindow);
					Thread.sleep(2000);
				} else {
					System.out.println("No new tab opened for row " + i);
				}
			}

			// Save the Excel file
			try (FileOutputStream fileOut = new FileOutputStream(excelFilePath)) {
				workbook.write(fileOut);
			}

			// Close the workbook
			//workbook.close();

			System.out.println("All pages have been saved as PDFs in the respective folders.");
			//driver.close();
			Thread.sleep(5000);

			// Handling a new window/tab if opened
			String mainWindow = driver.getWindowHandle();
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0)); // Switch back to the original tab
			Thread.sleep(4000);

			driver.findElement(Goback).click();
			Thread.sleep(8000);


		}

	}
}