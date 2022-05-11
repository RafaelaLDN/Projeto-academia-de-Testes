package actions;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.DriverContext;
import pages.FluxoComprasPage;

public class FluxoComprasAction extends FluxoComprasPage {
protected WebDriverWait wait;
JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();
	
	public FluxoComprasAction() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		wait = new WebDriverWait(DriverContext.getDriver(), 30);
	}
	
	public void linkSingnin() {
		linkSignin.click();	
	}
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(preencherEmail)).sendKeys(email);
	}
	public void preencherpassawd(String passwd) {
		wait.until(ExpectedConditions.elementToBeClickable(preencherpassawd)).sendKeys(passwd);
	}
	public void clicarSubmitLogin() {
		clicarSubmitLogin.click();	
	}	
		
	public void clicarcategoria() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarcategoria)).click();
	}
	public void clicarsubcategorias() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarsubcategorias)).click();
	}
	public void clicarsubcategorias2() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarsubcategorias2)).click();
	}
	public void clicarimg() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarimg)).click();
	}
	
				
	public void clicarAddtocart() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarAddtocart)).click();
	}	
	public void clicarqtd() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarqtd)).click();
	}	
		
	public void clicarbtnfechar() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarbtnfechar)).click();
	}	
	
	public void clicarcategoriaTshirts() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarcategoriaTshirts)).click();
	}	
	
	public void clicarpeca1() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarpeca1)).click();
	}	
	
	public void clicarcor() {
		wait.until(ExpectedConditions.elementToBeClickable(cor)).click();
	}	
	public void clicarAddtocart2() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarAddtocart2)).click();
	}	
		
	public void clicarcheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarcheckout)).click();
	}
	public void clicarprocedcheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarprocedcheckout)).click();
	}
	public void preenchermessage(String message) {
		wait.until(ExpectedConditions.elementToBeClickable(txtmsg)).sendKeys(message);
	}
	public void clicarprocesscheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarprocesscheckout)).click();
	}
	public void clicarcheckboxservice() {
		clicarcheckboxservice.click();	
	}
	public void clicarprocesscarrier() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarprocesscarrier)).click();
	}
	public void clicarpaybankwire() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarpaybankwire)).click();
	}
	public void clicarconfirmorder() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarconfirmorder)).click();
	}
	public void clicarReturn() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarReturn)).click();
	}
}
