package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Hompage extends Base.TestBase {
	
	@FindBy(xpath = "(//a[contains(text(),'Membership Status')])[2]")
	@CacheLookup
	WebElement MembershipStatus;
	
	@FindBy(xpath = "(//a[contains(text(),'Certifications & CPE Management')])[2]")
	@CacheLookup
	WebElement CertificationsCPEManagement;

	@FindBy(xpath = "//a[contains(text(),'Certificate Programs')])[2]")
	@CacheLookup
	WebElement CertificatePrograms;
	
	@FindBy(xpath = "//a[contains(text(),'Downloaded Materials')])[2]")
	@CacheLookup
	WebElement DownloadMaterials;
	
	@FindBy(xpath = "//a[contains(text(),'ISACA CPE Records')])[2]")
	@CacheLookup
	WebElement ISACACPERecords;
	
	@FindBy(xpath = "//a[contains(text(),'Learning Access')])[2]")
	@CacheLookup
	WebElement LearningAccess;

	public Hompage() {
		PageFactory.initElements(driver, this);
		
	}
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	public String CertificationsCPEManagement() {
		return driver.getTitle();		
	}
	public String CertificatePrograms() {
		return driver.getTitle();		
	}
	public String ISACACPERecords() {
		return driver.getTitle();		
	}
	public String LearningAccess() {
		return driver.getTitle();		
	}
	
	
}
