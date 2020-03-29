package br.com.rsi.hub3.automacao.bdd.pageobjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConsultaHomePage {
	private WebDriver driver;
	
	public ConsultaHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.ID, using = "tabletsTxt")
	private WebElement botaoTablets;
	@FindBy (how = How.ID, using = "tabletsLink")
	private WebElement botaoLinkTablets;
	
	@FindBy (how = How.XPATH, using = "//span[@class='shop_now roboto-bold ng-binding']")
	private WebElement verificarBotaoInexistente;
	
	@FindBy (how = How.XPATH, using = "//h1[@class='roboto-bold ng-binding']")
	private WebElement validacao;
	
	public void clicarBotaoTablets() {
		Actions acao = new Actions(driver);
		WebElement opcaoTablets = botaoTablets;
		acao.moveToElement(opcaoTablets).perform();
		botaoLinkTablets.click();
	}
	
	public boolean verificarBotaoInexistente(String produtoInexistente) {
		List<WebElement> ListaElementosHome = (List<WebElement>) verificarBotaoInexistente;
		for (WebElement elemento : ListaElementosHome) {
			if (elemento.getText().contains(produtoInexistente)) {
				return true;
			}
		}
		return false;
	}	
	
	public String validacao() {
		return validacao.getText();
	}
}
