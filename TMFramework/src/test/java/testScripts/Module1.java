package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import applicationPages.Pg101_Login;
import applicationPages.Pg102_Home;
import applicationPages.Pg103_ContactDetails;
import applicationPages.Pg104_EmergencyContactDetails;
import frameworkLibrary.BaseClass;

public class Module1 extends BaseClass {
	WebDriver driver;
	Pg101_Login loginpage;
	Pg102_Home homepage;
	Pg103_ContactDetails contactdetailspage;
	Pg104_EmergencyContactDetails emergencyContactDetailsPage;
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");

		loginpage = new Pg101_Login(driver);
		homepage = new Pg102_Home(driver);

		loginpage.setUserName(getdata("Name"));
		loginpage.setpassword(getdata("Password"));
		loginpage.ClickonLogin();
		homepage.clickOnMyInfo();
		homepage.clickOnContactDetails();
	}

	@Test
	public void TC101() {
		contactdetailspage = new Pg103_ContactDetails(driver);
		contactdetailspage.clickOnEdit();
		contactdetailspage.setAddressStreet1(getdata("Address1"));
		contactdetailspage.setAddressStreet2("Madhapur");
		contactdetailspage.setCity("Hyderabad");
		contactdetailspage.setZipCode("500081");
		contactdetailspage.setCounty("India");
		contactdetailspage.setHomeTelephone("9632598745");
		contactdetailspage.setWorkTelephone("9635125896");
		contactdetailspage.setWorkEmail("abcd@gmail.com");
		contactdetailspage.setOtherEmail("pqrs@gmail.com");
		contactdetailspage.clickOnSave();
	}
	
	@Test
	public void TC102(){
		emergencyContactDetailsPage = new Pg104_EmergencyContactDetails(driver);
		emergencyContactDetailsPage.clickOnEmergencyContacts();
		emergencyContactDetailsPage.clickOnAdd();
		emergencyContactDetailsPage.setName("ABC");
		emergencyContactDetailsPage.setRelationship("Mother");
		emergencyContactDetailsPage.setHomeTelephoneNum("0884-2342342");
		emergencyContactDetailsPage.setMobileNum("8394343434");
		emergencyContactDetailsPage.setworkTelephoneNum("03282-1212121");
		emergencyContactDetailsPage.clickOnSave();
	}

	@AfterMethod
	public void after() {
		homepage.Logout();
		quitdriver(driver);
	}
}
