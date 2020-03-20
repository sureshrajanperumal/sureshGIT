package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class LoginPage extends TestBase
{
	
	
	
		@FindBy(xpath="//input[@name='UserName']")
		WebElement username;
		
		@FindBy(xpath="//input[@name='Password']")
		WebElement password;
		
		@FindBy(xpath="//button[@id='btnLogin']")
		WebElement loginBtn;
		
		@FindBy(xpath="//img[contains(@class,'img-responsive')]")
		WebElement crmLogo;
		
		@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
		WebElement signinbtn;
		
		@FindBy(xpath="//a[contains(text(),'MyISACA')]")
		WebElement MyiSACABtn;
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public void HomePagelogin(String un, String pwd)
		{
			username.sendKeys(un);
			password.sendKeys(pwd);	
		}
		public void ButtonMyisacaClick()
		{
			if(MyiSACABtn.isDisplayed()==true)
				MyiSACABtn.click();
		}
}
