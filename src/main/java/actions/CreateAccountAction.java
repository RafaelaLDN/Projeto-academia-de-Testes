package actions;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.DriverContext;
import pages.CreateAccountPage;

public class CreateAccountAction extends CreateAccountPage {
	protected WebDriverWait wait;
	
	public CreateAccountAction() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		wait = new WebDriverWait(DriverContext.getDriver(), 40);
		
	}
	
	public void clicarSingnin() {
		clicarSignin.click();	
	}
	
		
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(txtEmail)).sendKeys(email);
		
		
	}
	public void clicarSubmitCreate() {
		wait.until(ExpectedConditions.elementToBeClickable(SubmitCreat)).click();
		
	}
	public void preenchercustomer_firstname(String customer_firstname) {
		wait.until(ExpectedConditions.elementToBeClickable(txtName)).sendKeys(customer_firstname);
	}
	public void preenchercustomer_lastname(String customer_lastname) {
		wait.until(ExpectedConditions.elementToBeClickable(txtLastName)).sendKeys(customer_lastname);

	}
	public void clicarGender() {
		wait.until(ExpectedConditions.elementToBeClickable(gender)).click();
	}
	public void preencherpasswd(String passwd) {
		wait.until(ExpectedConditions.elementToBeClickable(txtpasswd)).sendKeys(passwd);
	}
	public void selecionarDays(String days) {
		Select boxDay = new Select(comboBoxDays);
		boxDay.selectByValue(days);
	}
	public void selecionarMonths(String months) {
		Select boxMonths = new Select(comboBoxMonths);
		boxMonths.selectByValue(months);
	}
	public void selecionarYears(String years) {
		Select boxYears = new Select(comboBoxYears);
		boxYears.selectByValue(years);
	}

	public void clicarNewsLetter() {
		NewsLetter.click();
	}	
	public void preencheraddress1(String address1) {
		wait.until(ExpectedConditions.elementToBeClickable(txtaddress1)).sendKeys(address1);

	}
	public void preencheraddress2(String address2) {
		wait.until(ExpectedConditions.elementToBeClickable(txtaddress2)).sendKeys(address2);

	}
	public void preenchercity(String city) {
		wait.until(ExpectedConditions.elementToBeClickable(txtcity)).sendKeys(city);

	}
	public void selecionarid_state(String id_state) {
		Select boxId_state = new Select(comboBoxId_state);
		boxId_state.selectByValue(id_state);
	}	
	public void preencherpostcode(String postcode) {
		wait.until(ExpectedConditions.elementToBeClickable(txtpostcode)).sendKeys(postcode);
	}
	public void selecionarid_country(String id_country) {
		Select boxId_country = new Select(comboBoxId_country);
		boxId_country.selectByValue(id_country);
	}
	public void preencherother(String other) {
		wait.until(ExpectedConditions.elementToBeClickable(txtother)).sendKeys(other);
	}
	public void preencherphone(String phone) {
		wait.until(ExpectedConditions.elementToBeClickable(txtphone)).sendKeys(phone);
	}
	public void preencherphone_mobile(String phone_mobile) {
		wait.until(ExpectedConditions.elementToBeClickable(txtPhone_mobile)).sendKeys(phone_mobile);
	}
	public void preencheralias(String alias) {
		wait.until(ExpectedConditions.elementToBeClickable(txtalias)).clear();
		wait.until(ExpectedConditions.elementToBeClickable(txtalias)).sendKeys(alias);
	}
	public void clicarsubmitAccount() {
		submitAccount.click();
	}
}
	


		

