package br.com.rsi.hub3.automacao.bdd.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import br.com.rsi.hub3.automacao.bdd.pageobjects.LoginPage;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;
import br.com.rsi.hub3.automacao.bdd.utils.MassaDeDados;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	private LoginPage login;
	private MassaDeDados excel;
	
	@Before
	public void inicializar() throws Exception {
		driver = df.inicializar();
		login = PageFactory.initElements(driver, LoginPage.class);
		excel = new MassaDeDados();
	}

	@After
	public void finalizar() throws Exception {
	    df.encerrar();
	}
	
	@Given("^Usuario clica no botao de acesso de usuarios$")
	public void clicarNoBotaoDeAcessoDeUsuarios() throws Throwable {
		login.clicarBotaoAcessoUsuarios();
	}

	@When("^Usuario digita seu Usuario$")
	public void preencherOCampoUsuario() throws Throwable {
		login.preencherLoginComExcel(excel.getUsuario());
		//login.preencherLoginComExcel("rafael14");
	}

	@When("^Usuario digita sua Senha$")
	public void preencherOCampoSenha() throws Throwable {
		login.preencherSenhaComExcel(excel.getSenha());
		//login.preencherSenhaComExcel("Rafa123");
	}

//	@When("^Usuario clica no botao Login$")
//	public void clicarNoBotaoLogin() throws Throwable {
//		login.clicarBotaoLogin();
//	}
//
//	@Then("^validar Login com sucesso$")
//	public void validarLoginComSucesso() throws Throwable {
//	    login.validacaoLogin();
//	    Assert.assertEquals("rafael14", login.validacaoLogin());
//	}
	
}
