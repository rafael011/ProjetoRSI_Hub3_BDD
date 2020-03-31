package br.com.rsi.hub3.automacao.bdd.steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import br.com.rsi.hub3.automacao.bdd.pageobjects.ConsultaHomePage;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class ConsultaHomeStep {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	private ConsultaHomePage home;
	
//	@Before
//	public void inicializar() throws Exception {
//		driver = df.inicializar();
//		home = PageFactory.initElements(driver, ConsultaHomePage.class);
//	}
//
//	@After
//	public void finalizar() throws Exception {
//	    df.encerrar();
//	}
	
	@Given("^inicial$")
	public void estouNaTelaInicial() throws Throwable {
		driver = df.inicializar();
		home = PageFactory.initElements(driver, ConsultaHomePage.class);
	}
	
	@When("^clicar no botao tablets$")
	public void clicarNoBotaoTablets() throws Throwable {
	    home.clicarBotaoTablets();
	}

	@Then("^validar pagina do produto$")
	public void validarPaginaDoProduto() throws Throwable {
	    home.validacao();
	    Assert.assertEquals("TRAVEL CONFIDENTLY AND IN STYLE", home.validacao());
	    df.encerrar();
	}
	
	@Then("^validar produto inexistente$")
	public void validarProdutoInexistente() throws Throwable {
	    Assert.assertFalse(home.verificarBotaoInexistente("Smartphones"));
	    df.encerrar();
	}
}
