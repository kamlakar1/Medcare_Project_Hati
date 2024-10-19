package LabTest;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelExample {
    
    public static void main(String[] args) throws IOException {
        // Path to your Excel file
        String excelFilePath = "C:\\Users\\Kamlakar\\Documents\\Writedata.xlsx";
        
        // Load the workbook
        Workbook workbook = new XSSFWorkbook();
        
        // Create a sheet
        Sheet sheet = workbook.createSheet("Sheet1");
        
        // Create a row (at index 0)
        Row row = sheet.createRow(0);
        
        // Write data to specific columns
        Cell cell1 = row.createCell(0); // Column A (index 0)
        cell1.setCellValue("Data for Column A");
        
        Cell cell2 = row.createCell(1); // Column B (index 1)
        cell2.setCellValue("Data for Column B");
        
        Cell cell3 = row.createCell(2); // Column C (index 2)
        cell3.setCellValue("Data for Column C");
        
        // Write the output to a file
        try (FileOutputStream outputStream = new FileOutputStream(new File(excelFilePath))) {
            workbook.write(outputStream);
        }
        
        // Close the workbook
        workbook.close();
        
        System.out.println("Excel file written successfully.");
    }
}
