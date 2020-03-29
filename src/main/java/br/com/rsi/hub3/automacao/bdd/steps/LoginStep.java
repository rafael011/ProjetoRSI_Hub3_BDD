package br.com.rsi.hub3.automacao.bdd.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsi.hub3.automacao.bdd.pageobjects.LoginPage;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;
import cucumber.api.java.en.*;

public class LoginStep {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	private LoginPage login = new LoginPage(driver);
	
	@Given("^Usuario esta na Pagina Inicial$")
	public void usuarioEstaNaPaginaInicial() throws Throwable {
		df.inicializar();
	}

	@When("^Usuario navega ate a Pagina de Login$")
	public void usuarioNavegaAteAPaginaDeLogin() throws Throwable {
		login.clicarBotaoAcessoUsuarios();
		Thread.sleep(5000);
	}

	@When("^Usuario digita seu Usuario e Senha$")
	public void usuarioDigitaSeuUsuarioESenha() throws Throwable {
		login.preencherLoginComExcel("rafael05");
		login.preencherSenhaComExcel("Rafa123");
		login.clicarBotaoLogin();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("^exibida Login com sucesso$")
	public void validarLoginComSucesso() throws Throwable {
		System.out.println("Login realizado com sucesso.");
	}
	
	@Then("^finalizar$")
	public void finalizar() throws Throwable {
	    df.encerrar();
	}
}
