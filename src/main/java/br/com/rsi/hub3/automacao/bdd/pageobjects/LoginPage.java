package br.com.rsi.hub3.automacao.bdd.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;

public class LoginPage {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.ID, using = "menuUserLink")
	private WebElement botaoAcessoUsuarios;
	
	@FindBy (how = How.NAME, using = "username")
	private WebElement campoLogin;
	
	@FindBy (how = How.NAME, using = "password")
	private WebElement campoSenha;
	
	@FindBy (how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-sender/button")
	private WebElement botaoLogin;
	
	@FindBy (how = How.XPATH, using = "//span[@class='hi-user containMiniTitle ng-binding']")
	private WebElement validacao;
	
	@FindBy (how = How.ID, using = "//label[@id='signInResultMessage']")
	private WebElement validacaoMsgErro;
	
	
	public void clicarBotaoAcessoUsuarios() {
		botaoAcessoUsuarios.click();
		df.Esperar("5000");
	}
	
	public void preencherLoginComExcel(String login) {
		campoLogin.sendKeys(login);
	}

	public void preencherSenhaComExcel(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void clicarBotaoLogin() {
		botaoLogin.click();
		df.Esperar("5000");
	}
	
	public String validacaoLogin() {
		return validacao.getText();
	}
	
	public String validacaoLoginMensagemErro() {
		df.Esperar("500");
		return validacaoMsgErro.getText();
	}
}
