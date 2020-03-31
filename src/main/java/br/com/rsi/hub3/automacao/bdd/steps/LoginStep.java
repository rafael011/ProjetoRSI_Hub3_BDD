package br.com.rsi.hub3.automacao.bdd.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.hub3.automacao.bdd.pageobjects.ConsultaLupaPage;
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
//	@Given("^estou na tela inicial$")
//	public void estouNaTelaInicial() throws Throwable {
//		driver = df.inicializar();
//		login = PageFactory.initElements(driver, LoginPage.class);
//	}
	
	@Given("^clicar no menu de acesso de usuarios$")
	public void clicarNoMenuDeAcessoDeUsuarios() throws Throwable {
		login.clicarBotaoAcessoUsuarios();
	}

	@When("^preencher o campo Usuario$")
	public void preencherOCampoUsuario() throws Throwable {
		login.preencherLogin(excel.getUsuario());
		//login.preencherLogin("rafael14");
	}

	@When("^preencher o campo Senha$")
	public void preencherOCampoSenha() throws Throwable {
		login.preencherSenha(excel.getSenha());
		//login.preencherSenha("Rafa123");
	}

	@When("^clicar no botao Login$")
	public void clicarNoBotaoLogin() throws Throwable {
		login.clicarBotaoLogin();
	}

	@Then("^validar Login com sucesso$")
	public void validarLoginComSucesso() throws Throwable {
		login.validacaoLogin();
	    Assert.assertEquals("rafael05", login.validacaoLogin());
	    //df.encerrar();
	}

	@When("^preencher o campo Usuario com dados invalidos$")
	public void preencherOCampoUsuarioComDadosInvalidos() throws Throwable {
		login.preencherLogin(excel.getUsuarioInvalido());
	}

	@When("^preencher o campo Senha com dados invalidos$")
	public void preencherOCampoSenhaComDadosInvalidos() throws Throwable {
		login.preencherSenha(excel.getSenhaInvalida());
	}

	@Then("^validar mensagem de erro$")
	public void validarMensagemDeUsuarioOuSenhaInvalidos() throws Throwable {
		login.validacaoLoginMensagemErro();
	    Assert.assertEquals("Incorrect user name or password.", login.validacaoLogin());
	    //df.encerrar();
	}
}
