package testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.autofailedTest;
import Pages.Hompage;
import Pages.LoginPage;
import UtilwsFiles.Testutils;

public class HompageTestcases extends Base.TestBase implements Base.autofailedTest {
	
	LoginPage login;
	Hompage home;
	Testutils utils;
	
	public HompageTestcases() {
		super();
	}
	@BeforeMethod
	 public void setup()
	 {
		 Initilization();
		 login  = new LoginPage();
		 utils = new Testutils();		 
	 }
	@Test
	public void verifytitle() 
	{
		String title = home.verifyHomePageTitle();
		Assert.assertEquals(title, "homepage");	
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	public boolean runfailedcases(ITestResult result) {
		
		return false;
	}	
}
    