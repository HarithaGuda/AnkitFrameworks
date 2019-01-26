package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg104_EmergencyContactDetails extends BasePage{

	BasePage basepage=new BasePage();
	WebDriver driver;
	boolean stepstatus;
	public Pg104_EmergencyContactDetails(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="//a[text()='Emergency Contacts']")
	WebElement emergencyContacts;
	public void clickOnEmergencyContacts(){
		stepstatus=basepage.clickElement(emergencyContacts);
		reportEvent(stepstatus,"Able to click on emergenct contacts","Unable to click on emergency contacts",driver,true);
	}
	@FindBy(how=How.XPATH,using="//input[@id='btnAddContact']")
	WebElement clickOnAdd;
	public void clickOnAdd(){
		stepstatus=basepage.clickElement(clickOnAdd);
		reportEvent(stepstatus, "Able to click on Add Button", "Unable to click on Add Button",driver,true);

	}
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_name']")
	WebElement name;
	public void setName(String strname){
		stepstatus=basepage.setText(name, strname);
		reportEvent(stepstatus,"Able to enter name", "Unable to enter name", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_relationship']")
	WebElement relationship;
	public void setRelationship(String strRelationship){
		stepstatus=basepage.setText(relationship, strRelationship);
		reportEvent(stepstatus,"Able to enter relationship", "Unable to enter relationship", driver);
	}

	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_homePhone']")
	WebElement homeTelephoneNum;
	public void setHomeTelephoneNum(String strHomeTelephone){
		stepstatus=basepage.setText(homeTelephoneNum, strHomeTelephone);
		reportEvent(stepstatus,"Able to enter home Telephone number", "Unable to enter home Telephone number", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_mobilePhone']")
	WebElement mobileNumber;
	public void setMobileNum(String strMobileNum){
		stepstatus=basepage.setText(mobileNumber, strMobileNum);
		reportEvent(stepstatus,"Able to enter mobile number", "Unable to enter mobile number", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='emgcontacts_workPhone']")
	WebElement workTelephoneNum;
	public void setworkTelephoneNum(String strWorkTelephoneNum){
		stepstatus=basepage.setText(workTelephoneNum, strWorkTelephoneNum);
		reportEvent(stepstatus,"Able to enter work telephone number", "Unable to enter work telephone number", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='btnSaveEContact']")
	WebElement saveButton;
	public void clickOnSave(){
		stepstatus=basepage.clickElement(saveButton);
		reportEvent(stepstatus,"Able to click on save button", "Unable to click save button", driver,true);
	}
}
