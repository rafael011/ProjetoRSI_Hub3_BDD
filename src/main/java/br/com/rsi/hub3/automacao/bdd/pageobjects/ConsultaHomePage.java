package br.com.rsi.hub3.automacao.bdd.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy (how = How.XPATH, using = "//h1[@class='roboto-bold ng-binding']")
	private WebElement validacao;
	
	public void clicarBotaoTablets() {
		botaoTablets.click();
	}
	
	public boolean verificarBotaoInexistente(String produtoInexistente) {
		List<WebElement> ListaElementosHome = driver.findElements(By.xpath("//span[@class='shop_now roboto-bold ng-binding']"));
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
