package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg101_Login extends BasePage
{
	BasePage basepage = new BasePage();
	
	//Initilization
	WebDriver driver;
	boolean stepstatus;
	public Pg101_Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//define webelementss
	//addeing commnet  to application login page
	@FindBy(how=How.XPATH,using="//input[@name='txtUsername']")
	WebElement Username;
	public void setUserName(String Strusername)
	{
		stepstatus = basepage.setText(Username, Strusername);
		reportEvent(stepstatus, "Able to enter username", "Unable to enter username",driver);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@name='txtPassword']")
	WebElement Password;
	public void setpassword(String Strpassword)
	{
		stepstatus = basepage.setText(Password, Strpassword);
		reportEvent(stepstatus, "Able to enter password", "Unable to enter password",driver);
	}
	
	
	public  WebElement Singin(String loginname)
	{
		return driver.findElement(By.xpath(String.format("//input[@name='%s']",loginname)));
	}
	public void ClickonLogin()
	{
		stepstatus = basepage.clickElement(Singin("Submit"));
		reportEvent(stepstatus, "Able to click on Sign-In BUtton", "Unable to click on Sign-In Button",driver,true);
	}
}
