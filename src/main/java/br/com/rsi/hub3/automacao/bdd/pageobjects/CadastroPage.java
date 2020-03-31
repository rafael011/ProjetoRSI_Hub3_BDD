package br.com.rsi.hub3.automacao.bdd.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import br.com.rsi.hub3.automacao.bdd.utils.DriverFactory;

public class CadastroPage {
	private WebDriver driver;
	//private DriverFactory df = new DriverFactory();
	
	public CadastroPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.ID, using = "menuUserLink")
	private WebElement botaoAcessoUsuarios;
	
	@FindBy (how = How.XPATH, using = "//a[@class='create-new-account ng-scope']")
	private WebElement botaoCriarConta;
	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement campoUsuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement campoEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement campoSenha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement campoConfirmacaoSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement campoNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement campoSobrenome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement campoTelefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement selecionaPais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement campoCidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement campoEndereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement campoEstado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement campoCep;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement opcaoAceitarTermos;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement botaoRegistrar;
	
	@FindBy (how = How.XPATH, using = "//span[@class='hi-user containMiniTitle ng-binding']")
	private WebElement validacao;	
	
//	@FindBy (how = How.XPATH, using = "//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]") 
//	private WebElement validacaoMsgErro;
	
	@FindBy (how = How.XPATH, using = "/html/body/div[3]/section/article/sec-form/div[2]/label[1]") 
	private WebElement validacaoMsgErro;
	
	
	public void clicarBotaoAcessoUsuarios() {
		botaoAcessoUsuarios.click();
		Esperar("5000");
	}
	
	public void clicarBotaoCriarConta() {
		botaoCriarConta.click();
	}
	
	public void preencherUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}

	public void preencherEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public void preencherSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void preencherConfirmacaoSenha(String confirmaSenha) {
		campoConfirmacaoSenha.sendKeys(confirmaSenha);
	}

	public void preencherNome(String nome) {
		campoNome.sendKeys(nome);
	}

	public void preencherSobrenome(String sobrenome) {
		campoSobrenome.sendKeys(sobrenome);
	}

	public void preencherTelefone(String telefone) {
		campoTelefone.sendKeys(telefone);
	}

	public void selecionarPais(String pais) {
		Esperar("3000");
		Select combobox = new Select(selecionaPais);
		Esperar("3000");
		combobox.selectByVisibleText(pais);
	}

	public void preencherCidade(String cidade) {
		campoCidade.sendKeys(cidade);
	}

	public void preencherEndereco(String endereco) {
		campoEndereco.sendKeys(endereco);
	}

	public void preencherEstado(String estado) {
		campoEstado.sendKeys(estado);
	}

	public void preencherCep(String cep) {
		campoCep.sendKeys(cep);
	}

	public void clicarOpcaoAceitarTermos() {
		opcaoAceitarTermos.click();
	}

	public void clicarBotaoCadastrar() {
		botaoRegistrar.click();
		Esperar("5000");
	}
	
	public String validacaoCadastro() {
		Esperar("1000");
		return validacao.getText();
	}
	
	public String validacaoCadastroMensagemErro() {
		Esperar("500");
		return validacaoMsgErro.getText();
	}
	
	public void Esperar(String tempo) {
		JavascriptExecutor javaScriptExecutor= (JavascriptExecutor) driver;
        javaScriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1],"+tempo+");");
	}
	
	
	
	
}
