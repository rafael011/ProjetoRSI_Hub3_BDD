package br.com.rsi.hub3.automacao.bdd.steps;
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
	
	@Before
	public void inicializar() throws Exception {
		driver = df.inicializar();
		home = PageFactory.initElements(driver, ConsultaHomePage.class);
	}

	@After
	public void finalizar() throws Exception {
	    df.encerrar();
	}
	
	@When("^clicar no botao tablets$")
	public void clicarNoBotaoTablets() throws Throwable {
	    home.clicarBotaoTablets();
	}

	@Then("^validar pagina do produto$")
	public void validarPaginaDoProduto() throws Throwable {
	    home.validacao();
	}
}
