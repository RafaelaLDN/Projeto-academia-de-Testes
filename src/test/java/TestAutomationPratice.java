import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Constantes;
import Utils.DriverContext;
import actions.CreateAccountAction;
import actions.FluxoComprasAction;

class TestAutomationPratice {
	WebDriver driver;
	CreateAccountAction account;
	FluxoComprasAction purchases;
	

	@BeforeEach
	void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMERDRIVER);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		account = new CreateAccountAction();
		purchases = new FluxoComprasAction();
		
			
	}
	
	@Test
	void testCadastro() throws InterruptedException {
		account.clicarSingnin();
		account.preencherEmail("rafa8@gmail.com");
		account.clicarSubmitCreate();
		account.clicarGender();
		account.preenchercustomer_firstname("Rafaela");
		account.preenchercustomer_lastname("Nascimento");
		account.preencherpasswd("123456");
		account.selecionarDays("13");
		account.selecionarMonths("5");
		account.selecionarYears("1993");
		account.clicarNewsLetter();
		account.preencheraddress1("Rosas Street");
		account.preencheraddress2("35, apt 01");
		account.preenchercity("Piedade");
		account.selecionarid_state("5");
		account.preencherpostcode("11111");
		account.selecionarid_country("21");
		account.preencherother("Academia Teste Accenture!");
		account.preencherphone("81.3333-0000");
		account.preencherphone_mobile("81.99163-4720");
		account.preencheralias("Amaro Soares Street, 12");
		account.clicarsubmitAccount();
	}
	
	@Test
	void testCompras() throws InterruptedException {
		purchases.linkSingnin();
		purchases.preencherEmail("rafa125@gmail.com");
		purchases.preencherpassawd("123456");
		purchases.clicarSubmitLogin();
		purchases.clicarcategoria();
		purchases.clicarsubcategorias();
		purchases.clicarsubcategorias2();
		purchases.clicarimg();
		purchases.clicarqtd();
		purchases.clicarAddtocart();
		purchases.clicarbtnfechar();
		purchases.clicarcategoriaTshirts();
		purchases.clicarpeca1();
		purchases.clicarcor();
		purchases.clicarAddtocart2();
		purchases.clicarcheckout();
		purchases.clicarprocedcheckout();
		purchases.preenchermessage("Entregar em horário comercial!");
		purchases.clicarprocesscheckout();
		purchases.clicarcheckboxservice();
		purchases.clicarprocesscarrier();
		purchases.clicarpaybankwire();
		purchases.clicarconfirmorder();
		purchases.clicarReturn();
				
	}
	

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
		
	}

	

}
