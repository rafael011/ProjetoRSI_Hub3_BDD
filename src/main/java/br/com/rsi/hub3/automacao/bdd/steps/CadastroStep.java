package br.com.rsi.hub3.automacao.bdd.steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import br.com.rsi.hub3.automacao.bdd.pageobjects.CadastroPage;
import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CadastroStep {
	private WebDriver driver;
	private DriverFactory df = new DriverFactory();
	private CadastroPage cadastro;

	@Before
	public void inicializar() throws Exception {
		driver = df.inicializar();
		cadastro = PageFactory.initElements(driver, CadastroPage.class);
	}

	@After
	public void finalizar() throws Exception {
		df.encerrar();
	}

	@Given("^clicar no botao de acesso de usuarios$")
	public void clicarNoBotaoDeAcessoDeUsuarios() throws Throwable {
		cadastro.clicarBotaoAcessoUsuarios();
	}

	@When("^clicar no botao Criar nova conta$")
	public void clicarNoBotaoCriarNovaConta() throws Throwable {
		cadastro.clicarBotaoCriarConta();
	}

	@When("^preencher o campo usuario$")
	public void preencherOCampoUsuario() throws Throwable {
		cadastro.preencherUsuario("rafael22");
	}

	@When("^preencher o campo email$")
	public void preencherOCampoEmail() throws Throwable {
		cadastro.preencherEmail("rgc.test22@gmail.com");
	}

	@When("^preencher o campo senha$")
	public void preencherOCampoSenha() throws Throwable {
		cadastro.preencherSenha("Rafa123");
	}

	@When("^preencher o campo confirmar senha$")
	public void preencherOCampoConfirmarSenha() throws Throwable {
		cadastro.preencherConfirmacaoSenha("Rafa123");
	}

	@When("^preencher o campo nome$")
	public void preencherOCampoNome() throws Throwable {
		cadastro.preencherNome("Rafael");
	}

	@When("^preencher o campo sobre nome$")
	public void preencherOCampoSobreNome() throws Throwable {
		cadastro.preencherSobrenome("Gomes");
	}

	@When("^preencher o campo telefone$")
	public void preencherOCampoTelefone() throws Throwable {
		cadastro.preencherTelefone("11999990000");
	}

	@When("^selecionar o pais$")
	public void selecionarOPais() throws Throwable {
		cadastro.selecionarPais("Brazil");
	}

	@When("^preencher o campo cidade$")
	public void preencherOCampoCidade() throws Throwable {
		cadastro.preencherCidade("Sao Paulo");
	}

	@When("^preencher o campo endereco$")
	public void preencherOCampoEndereco() throws Throwable {
		cadastro.preencherEndereco("Rua Abcde, N 20");
	}

	@When("^preencher o campo estado$")
	public void preencherOCampoEstado() throws Throwable {
		cadastro.preencherEndereco("SP");
	}

	@When("^preencher o campo cep$")
	public void preencherOCampoCep() throws Throwable {
		cadastro.preencherCep("08455000");
	}

	@When("^marcar a opcao de aceitar os termos$")
	public void marcarAOpcaoDeAceitarOsTermos() throws Throwable {
		cadastro.clicarOpcaoAceitarTermos();
	}

	@When("^clicar no botao cadastrar$")
	public void clicarNoBotaoCadastrar() throws Throwable {
		cadastro.clicarBotaoCadastrar();
	}

	@Then("^validar cadastro com sucesso$")
	public void validarCadastroComSucesso() throws Throwable {
		cadastro.validacaoCadastro();
		Assert.assertEquals("rafael22", cadastro.validacaoCadastro());
	}

}
