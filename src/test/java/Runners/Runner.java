package Runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				
	features = "src/test/resources/features/LoginPowerview.feature", // diretório da feature. 
	glue = "Steps", // Pacote dos steps / métodos. 
	plugin = "pretty", // Ao executar via Junit, apresentar todos os dados no console como se tivesse executado pelo Plugin Cucumber.
	monochrome = true, // Retirar caracteres especiais correspondente a cores, para que o console apresente a informação de forma legível. 
	snippets = SnippetType.CAMELCASE, // Ao executar Cucumber, gerar os métodos no modelo CamelCase. 
	dryRun = false, // Com o valor = true, não executa o teste, apenas valida se o mapeamento está correto.
	strict = false // Seta erro o passo não mapeado / não declarar o método gerado pelo Cucumber. 
		
		
	)

public class Runner {
		
}
