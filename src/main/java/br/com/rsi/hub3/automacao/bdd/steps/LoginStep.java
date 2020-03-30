package br.com.rsi.hub3.automacao.bdd.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import br.com.rsi.hub3.automacao.bdd.pageobjects.LoginPage;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;
import cucumber.api.java.en.*;
import cucumber.api.java.*;

public class LoginStep {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	private LoginPage login;
	
	@Before
	public void inicializar() throws Exception {
		driver = df.inicializar();
		login = PageFactory.initElements(driver, LoginPage.class);
	}	

	@Given("^Usuario clica no botao de acesso de usuarios$")
	public void usuarioClicaNoBotaoDeAcessoDeUsuarios() throws Throwable {
		login.clicarBotaoAcessoUsuarios();
	}

	@When("^Usuario digita seu Usuario$")
	public void usuarioDigitaSeuUsuario() throws Throwable {
		login.preencherLoginComExcel("rafael05");
	}

	@When("^Usuario digita sua Senha$")
	public void usuarioDigitaSuaSenha() throws Throwable {
		login.preencherSenhaComExcel("Rafa123");
	}

	@When("^Usuario clica no botao Login$")
	public void usuarioClicaNoBotaoLogin() throws Throwable {
		login.clicarBotaoLogin();
	}

	@Then("^validar Login com sucesso$")
	public void validarLoginComSucesso() throws Throwable {
	    login.validacaoLogin();
	}
	
	@After
	public void finalizar() throws Exception {
	    df.encerrar();
	}
	
}
