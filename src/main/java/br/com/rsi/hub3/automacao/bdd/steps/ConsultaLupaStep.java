package br.com.rsi.hub3.automacao.bdd.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.hub3.automacao.bdd.pageobjects.ConsultaHomePage;
import br.com.rsi.hub3.automacao.bdd.pageobjects.ConsultaLupaPage;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class ConsultaLupaStep {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	private ConsultaLupaPage lupa;
	
//	@Before
//	public void inicializar() throws Exception {
//		driver = df.inicializar();
//		lupa = PageFactory.initElements(driver, ConsultaLupaPage.class);
//	}
//
//	@After
//	public void finalizar() throws Exception {
//	    df.encerrar();
//	}
	
	@Given("^inicio$")
	public void inicio() throws Throwable {
		driver = df.inicializar();
		lupa = PageFactory.initElements(driver, ConsultaLupaPage.class);
	}
	
	@Given("^clicar no botao da lupa de pesquisa$")
	public void clicarNoBotaoDaLupaDePesquisa() throws Throwable {
	    lupa.clicarBotaoLupa();
	}

	@When("^preencher a barra de pesquisa da lupa$")
	public void preencherABarraDePesquisaDaLupa() throws Throwable {
	    lupa.preencherPesquisaLupa("HP CHROMEBOOK 14 G1(ENERGY STAR)");
	}

	@When("^clicar no produto pesquisado$")
	public void clicarNoProdutoPesquisado() throws Throwable {
	    lupa.clicarProdutoPesquisaLupa();
	}

	@Then("^validar pagina do produto pesquisado$")
	public void validarPaginaDoProdutoPesquisado() throws Throwable {
	    lupa.validacao();
	    Assert.assertEquals("HP CHROMEBOOK 14 G1(ENERGY STAR)", lupa.validacao());
	    df.encerrar();
	}

	@When("^preencher a barra de pesquisa da lupa com produto inexistente$")
	public void preencherABarraDePesquisaDaLupaComProdutoInexistente() throws Throwable {
		lupa.preencherPesquisaLupa("DELL");
	}
	
	@When("^clicar no botao fechar lupa$")
	public void clicarNoBotaoFecharLupa() throws Throwable {
		lupa.clicarFecharLupa();
	}

	@Then("^validar mensagem de produto nao encontrado$")
	public void validarMensagemDeProdutoNaoEncontrado() throws Throwable {
		lupa.validacaoPesquisaInvalida();
	    Assert.assertEquals("No results for \"DELL\"", lupa.validacaoPesquisaInvalida());
	    df.encerrar();
	}
}
