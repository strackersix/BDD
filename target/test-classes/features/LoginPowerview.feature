Feature: Praticar Gherkin com Cucumber e Selenium.

Scenario: Acessar a aplicação do Powerview.
Given Inicializar o chromedriver com a Url: "https://powerview-qa.doc88.com.br/auth/login"
When Digitar no campo Login o usuário: "gabriel.souza@doc88.com.br" 
And Digitar no campo Password a senha: "G@briel@123456"
And Clicar no botão Acessar Blue Powerview
Then O usuário deverá acessar a aplicação
And A descrição do usuário deverá ser: "Gabriel Oliveira Conrado de Souza"




