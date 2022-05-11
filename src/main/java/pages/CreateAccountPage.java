package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.DriverContext;


public class CreateAccountPage {
	
	public CreateAccountPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	
	@FindBy(partialLinkText = "Sign in")
	protected WebElement clicarSignin;
	
	@FindBy(id = "email_create")
	protected WebElement txtEmail;
	
	@FindBy(id = "SubmitCreate")
	protected WebElement SubmitCreat;
	
	@FindBy(id = "customer_firstname")
	protected WebElement txtName;
	
	@FindBy(id = "customer_lastname")
	protected WebElement txtLastName;
	
	@FindBy(id = "id_gender2")
	protected WebElement gender;
	
	@FindBy(id = "passwd")
	protected WebElement txtpasswd;
	
	@FindBy(id = "days")
	protected WebElement comboBoxDays;
	
	@FindBy(id = "months")
	protected WebElement comboBoxMonths;
	
	@FindBy(id = "years")
	protected WebElement comboBoxYears;
	
	@FindBy(id = "newsletter")
	protected WebElement NewsLetter;
	
	@FindBy(id = "address1")
	protected WebElement txtaddress1;
	
	@FindBy(id = "address2")
	protected WebElement txtaddress2;
	
	@FindBy(id = "city")
	protected WebElement txtcity;
	
	@FindBy(id = "id_state")
	protected WebElement comboBoxId_state;
	
	@FindBy(id = "postcode")
	protected WebElement txtpostcode;
	
	@FindBy(id = "id_country")
	protected WebElement comboBoxId_country;
	
	@FindBy(id = "other")
	protected WebElement txtother;
	
	@FindBy(id = "phone")
	protected WebElement txtphone;
	
	@FindBy(id = "phone_mobile")
	protected WebElement txtPhone_mobile;

	@FindBy(id = "alias")
	protected WebElement txtalias;
	
	@FindBy(id = "submitAccount")
	protected WebElement submitAccount;
}
