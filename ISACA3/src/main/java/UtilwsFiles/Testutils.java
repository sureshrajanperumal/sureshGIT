package UtilwsFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Testutils extends Base.TestBase {
	
	public static String TESTDATA_SHEET_PATH = "E:\\suresh\\GitJavaWorkbench\\Jmeter\\ISACA3\\src\\main\\java\\TestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	
public Object[][] gettestdata(String sheetname) throws InvalidFormatException, IOException
{
	FileInputStream file = null;
	
	try
	{
		file = new FileInputStream(TESTDATA_SHEET_PATH);
		
	}
	catch(FileNotFoundException ex)
	{
		ex.printStackTrace();
	}
	try
	{
		book = WorkbookFactory.create(file);
	}
	catch(IllegalFormatException exp)
	{
		exp.printStackTrace();
	}
	catch(IOException ioex)
	{
		ioex.printStackTrace();
	}
	
	sheet = book.getSheet(sheetname);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()] ;
	for(int i=0 ; i<sheet.getLastRowNum();i++)
	{
		for(int j=0 ; j<sheet.getRow(0).getLastCellNum();j++)
		{
			data[i][j] = sheet.getRow(i+1).getCell(j).toString();
		}		
	}
	return data;	
}
public static void takescreenshot() throws IOException
{
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String Curentdir = System.getProperty("user.dir");
	FileUtils.copyFile(src, new File(Curentdir + "/screenshots" + System.currentTimeMillis()+".png"));	
}
	
}
	
