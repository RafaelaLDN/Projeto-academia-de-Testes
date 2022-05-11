package stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.DriveManager;
import actions.FluxoComprasAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class comprastep {

	DriveManager manager = new DriveManager();
	WebDriver driver = manager.AbrirUrl();
	FluxoComprasAction purchases = PageFactory.initElements(driver, FluxoComprasAction.class);
	
	public comprastep() throws Exception {
		}
	@Given("usuario abrir o site {string}")
	public void usuario_abrir_o_site(String url) {
	    driver.get(url);
	}

	@When("usuario clicar no botao Singnin")
	public void usuario_clicar_no_botao_singnin() {
	   purchases.linkSingnin();
	}

	@And("preencher o {string}, {string}")
	public void preencher_o(String email, String senha) {
	    purchases.preencherEmail(email);
	    purchases.preencherpassawd(senha);
	}

	@And("clicar no botao Submit login")
	public void clicar_no_botao_submit_login() {
	    purchases.clicarSubmitLogin();
	}

	@Then("o sistena apresentara pagina de compras")
	public void o_sistena_apresentara_pagina_de_compras() {
		driver.get("http://automationpractice.com/index.php?controller=my-account");
    	assertEquals("My account - My Store", driver.getTitle());
	}

	@Given("usuario esteja logado")
	public void usuario_esteja_logado() {
	    
	}
	
	@When("usuario escolher pecas")
	public void usuario_escolher_pecas() {
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
	}

	@And("usuario seguir no processo de finalizacao de compra {string}")
	public void usuario_seguir_no_processo_de_finalizacao_de_compra(String string) {
	    purchases.clicarcheckout();
	    purchases.clicarprocedcheckout();
	    purchases.preenchermessage(string);
	    purchases.clicarprocesscheckout();
	    purchases.clicarcheckboxservice();
	    purchases.clicarprocesscarrier();
	    purchases.clicarpaybankwire();
	    purchases.clicarconfirmorder();
	}

	@Then("o sistema devera exibir a compra finalizada")
	public void o_sistema_devera_exibir_a_compra_finalizada() {
	    driver.get("http://automationpractice.com/index.php?controller=order-confirmation&id_cart=4534961&id_module=3&id_order=428552&key=06dbe315ba49e53b3a94e78b01a28e01");
	    	assertEquals("Order confirmation - My Store", driver.getTitle());
	}

	@And("retornar para a pagina inicial")
	public void retornar_para_a_pagina_inicial() {
		purchases.clicarReturn();
		driver.quit();
	    
	}


}
