package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utils.DriverContext;

public class FluxoComprasPage {
	public FluxoComprasPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);

	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using = "Sign in")
	protected WebElement linkSignin;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"email\"]")
	protected WebElement preencherEmail;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"passwd\"]")
	protected WebElement preencherpassawd;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span/i")
	protected WebElement clicarSubmitLogin;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	protected WebElement clicarcategoria;
		
	@FindBy(how=How.XPATH, using = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a")
	protected WebElement clicarsubcategorias;	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a")
	protected WebElement clicarsubcategorias2;	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	protected WebElement clicarimg;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"add_to_cart\"]/button")
	protected WebElement clicarAddtocart;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]")
	protected WebElement clicarqtd;
				
	@FindBy(how=How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	protected WebElement clicarbtnfechar;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	protected WebElement clicarcategoriaTshirts;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	protected WebElement clicarpeca1;
	
	@FindBy(how=How.NAME, using = "Blue")
	protected WebElement cor;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"add_to_cart\"]/button")
	protected WebElement clicarAddtocart2;
			
	@FindBy(how=How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement clicarcheckout;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement clicarprocedcheckout;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"ordermsg\"]/textarea")
	protected WebElement txtmsg;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement clicarprocesscheckout;
	
	@FindBy(how=How.ID, using = "uniform-cgv")
	protected WebElement clicarcheckboxservice;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"form\"]/p/button")
	protected WebElement clicarprocesscarrier;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	protected WebElement clicarpaybankwire;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement clicarconfirmorder;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"header_logo\"]/a/img")
	protected WebElement clicarReturn;
	
}