package br.com.rsi.hub3.automacao.bdd.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/Feature", //Declarando local dos Gherkin
		 glue={"br.com.rsi.hub3.automacao.bdd.steps"}, //Declarando o pacote das Steps
		 snippets = SnippetType.CAMELCASE,
		 tags = "~@ignore"//"@consultahome"//"@cadastro" //
		 )
public class Runner {

}
