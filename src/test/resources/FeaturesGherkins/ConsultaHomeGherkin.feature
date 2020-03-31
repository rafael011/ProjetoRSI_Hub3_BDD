Feature: Consulta pagina inicial

Scenario: Consulta pagina inicial com sucesso 
	When clicar no botao tablets
	Then validar pagina do produto
	
Scenario: Consulta pagina inicial sem sucesso 
	Then validar produto inexistente 
	


