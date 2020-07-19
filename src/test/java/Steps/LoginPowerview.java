package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPowerview extends DriverFactory {
	
	@Given("^Inicializar o chromedriver com a Url: \"([^\"]*)\"$")
	public void inicializarOChromedriverComAUrl(String arg1) throws Throwable {

		driver.manage().window().maximize();
		driver.get(arg1);
		
	}

	@When("^Digitar no campo Login o usuário: \"([^\"]*)\"$")
	public void digitarNoCampoLoginOUsuário(String arg1) throws Throwable {
	    
		driver.findElement(By.xpath("//input[@placeholder = 'Nome de usuário']")).sendKeys(arg1);
		
	}

	@When("^Digitar no campo Password a senha: \"([^\"]*)\"$")
	public void digitarNoCampoPasswordASenha(String arg1) throws Throwable {

		driver.findElement(By.xpath("//input[@placeholder = 'Senha de acesso']")).sendKeys(arg1);
			
	}

	@When("^Clicar no botão Acessar Blue Powerview$")
	public void clicarNoBotãoAcessarBluePowerview() throws Throwable {

		driver.findElement(By.xpath("//button[@id = 'be-login']")).click();
		
	}

	@Then("^O usuário deverá acessar a aplicação$")
	public void oUsuárioDeveráAcessarAAplicação() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'dropdown-user']")));
					
	}
	
	@Then("^A descrição do usuário deverá ser: \"([^\"]*)\"$")
	public void aDescriçãoDoUsuárioDeveráSer(String arg1) throws Throwable {

		WebElement UsuarioLogado = driver.findElement(By.xpath("//button[@id = 'dropdown-user']"));
		Assert.assertEquals(arg1, UsuarioLogado.getText());
		
	}
	

}
