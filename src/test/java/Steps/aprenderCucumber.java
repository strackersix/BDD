package Steps; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class aprenderCucumber {

	@Given("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
	    
	}

	@When("^executá-lo$")
	public void executá_lo() throws Throwable {
	    
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {
	    
	}
	
	//------------------------------------------------------------------------//---------------------------------------------------------------------//
		
	private int contador = 0;
	@Given("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
	
		contador = arg1;
		
	}

	@When("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
	    
		contador = contador + arg1;
		
	}

	@Then("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {

		System.out.println("Valor inicial da variável: " + arg1);
		System.out.println("Variável = 15, incrementa + 3 = " + contador);
		
		Assert.assertEquals( arg1 , contador);
		
	}
	
 // ---------------------------------------------------------------------------// ----------------------------------------------------------------------//
	
	Date entrega = new Date();
	
	@Given("^que o prazo é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queOPrazoÉDia(int dia, int mes, int ano) throws Throwable {
	   
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes);
		cal.set(Calendar.YEAR, ano);
		
		entrega = cal.getTime();
				
	}

	@When("^a entrega atrasar em (\\d+) dias$")
	public void aEntregaAtrasarEmDias(int arg1) throws Throwable {

		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.add(Calendar.DAY_OF_MONTH, arg1);
		entrega = cal.getTime();
				
	}
											
	@Then("^a entrega será realizada no dia (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráRealizadaNoDia(String data) throws Throwable {
	   
		DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		String dataFormatada = format.format(entrega);
		
		Assert.assertEquals(data, dataFormatada);
				
	}
	
 // ---------------------------------------------------------------------------// ----------------------------------------------------------------------//
	
	
	
	
}
