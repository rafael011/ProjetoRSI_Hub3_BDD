package br.com.rsi.hub3.automacao.bdd.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;

public class ConsultaLupaPage {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	
	public ConsultaLupaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.ID, using = "menuSearch")
	private WebElement botaoLupa;
	
	@FindBy (how = How.ID, using = "autoComplete")
	private WebElement campoLupa;
	
	@FindBy (how = How.XPATH, using = "//p[contains(text(),'HP CHROMEBOOK 14 G1(ENERGY STAR)')]")
	private WebElement clicarProduto;
	
	@FindBy (how = How.XPATH, using = "//div[@class='autoCompleteCover']//div//img")
	private WebElement botaoFecharLupa;
	
	@FindBy (how = How.XPATH, using = "//a[@class='select ng-binding']")
	private WebElement validacao;
	
	@FindBy (how = How.XPATH, using = "//span[@class='ng-binding']")
	private WebElement validacaoPesquisaInvalida;

	
	public void clicarBotaoLupa() {
		botaoLupa.click();
		Esperar("3000");
	}
	
	public void preencherPesquisaLupa(String produto) {
		campoLupa.sendKeys(produto);
		Esperar("5000");
	}
	public void clicarProdutoPesquisaLupa() {
		clicarProduto.click();
	}
	
	public void clicarFecharLupa() {
		botaoFecharLupa.click();
	}
	
	public String validacao() {
		return validacao.getText();
	}
	
	public String validacaoPesquisaInvalida() {
		return validacaoPesquisaInvalida.getText();
	}
	
	public void Esperar(String tempo) {
		JavascriptExecutor javaScriptExecutor= (JavascriptExecutor) driver;
        javaScriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1],"+tempo+");");
	}
}
