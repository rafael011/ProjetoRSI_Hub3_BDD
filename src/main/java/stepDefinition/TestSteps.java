package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class TestSteps {
	private WebDriver driver;
	@Given("^Usuario esta na Pagina Inicial$")
	public void usuarioEstaNaPaginaInicial() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chormedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^Usuario navega ate a Pagina de Login$")
	public void usuarioNavegaAteAPaginaDeLogin() throws Throwable {
		driver.findElement(By.id("menuUserSVGPath")).click(); 
	}

	@When("^Usuario digita seu Usuario e Senha$")
	public void usuarioDigitaSeuUsuarioESenha() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("rafael05");
		driver.findElement(By.name("password")).sendKeys("Rafa123");
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-sender/button")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("^exibida Login com sucesso$")
	public void exibidaLoginComSucesso() throws Throwable {
		System.out.println("Login realizado com sucesso.");
	}
}
