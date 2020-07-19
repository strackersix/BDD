Feature: Aprender Cucumber
	 Como um aluno 
	 Eu quero aprender a utilizar Cucumber 
	 para que eu possa automatizar critérios de aceitação 

Scenario: Deve executar especificação 
	Given que criei o arquivo corretamente
	When executá-lo
	Then a especificação deve finalizar com sucesso 
	
Scenario: Deve incrementar contador
	Given que o valor do contador é 15
	When eu incrementar em 3
	Then o valor do contador será 18
	
Scenario: Deve incrementar contador
	Given que o valor do contador é 123
	When eu incrementar em 35
	Then o valor do contador será 158
	
Scenario: Deve calcular atraso no prazo de entrega.
	Given que o prazo é dia 05/04/2018
	When a entrega atrasar em 2 dias
	Then a entrega será realizada no dia 07/04/2018	
	
Scenario: Deve calcular atraso no prazo de entrega da China.
  Given que o prazo é dia 05/04/2018
  When a entrega atrasar em 2 meses
  Then a entrega será efetuada em 05/06/2018	