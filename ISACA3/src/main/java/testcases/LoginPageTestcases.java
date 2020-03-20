package testcases;

import org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Hompage;
import Pages.LoginPage;

public class LoginPageTestcases extends Base.TestBase
{
	
	LoginPage login;
	Hompage home;
	
	public LoginPageTestcases() {
		super();
	}
	@BeforeMethod
	public void setup()
	{
		Initilization();
		login = new LoginPage();		
	}
	@Test(priority=1 ,retryAnalyzer = LoginPageTestcases.class)
	public void loginpagetitleTest()
	{
	String gettitle = login.validateLoginPageTitle();
		Assert.assertEquals(gettitle, "HomPage");
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
