package stepdefinitions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.DriveManager;
import actions.CreateAccountAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cadastrostep {
	
	DriveManager manager = new DriveManager();
	WebDriver driver = manager.AbrirUrl();
	CreateAccountAction action = PageFactory.initElements(driver, CreateAccountAction.class);
	
	public cadastrostep() throws Exception {
		}
	
	@Given("usuario abriu o site {string}")
	public void usuario_abriu_o_site(String url) {
	    driver.get(url);
	}

	@When("usuario clicou no botao Singnin")
	public void usuario_clicou_no_botao_singnin() {
	   action.clicarSingnin();
	}
	@And("preencher o {string}")
	public void preencher_o(String email) {
	    action.preencherEmail(email);
	}

	@And("usuario clicou no botao Submit Create")
	public void usuario_clicou_no_botao_submit_create() {
	   action.clicarSubmitCreate();
	}
	
	@Then("o sistena apresentara pagina de cadastro")
	public void o_sistena_apresentara_pagina_de_cadastro() {
	    
	}

	@When("usuario preencher todos os campos obrigatorios")
	public void usuario_preencher_todos_os_campos_obrigatorios() {
		action.clicarGender();
	    action.preenchercustomer_firstname("Rafaela");
	    action.preenchercustomer_lastname("Nascimento");
	    action.preencherpasswd("188555");
	    action.selecionarDays("13");
	    action.selecionarMonths("6");
	    action.selecionarYears("1993");
	    action.clicarNewsLetter();
	    action.preencheraddress1("Rosas Street");
	    action.preencheraddress2("35, apt 2");
	    action.preenchercity("Recife");
	    action.selecionarid_state("6");
	    action.preencherpostcode("00000");
	    action.selecionarid_country("21");
	    action.preencherother("Academia Teste Accenture!");
	    action.preencherphone("81.3333-0000");
	    action.preencherphone_mobile("81.99163-4720");
	    action.preencheralias("Amaro Soares Street, 12");
	    
	}

	@And("clicar no botao Submit Account")
	public void clicar_no_botao_submit_account() {
	    action.clicarsubmitAccount();
	}

	@Then("o sistena apresentara pagina de compra")
	public void o_sistena_apresentara_pagina_de_compra() {
		driver.get("http://automationpractice.com/index.php?controller=my-account");
    	assertEquals("My account - My Store", driver.getTitle());
    	driver.quit();
	}

}

