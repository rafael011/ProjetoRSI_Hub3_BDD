Feature: Consulta Lupa

Background: 
	Given clicar no botao da lupa de pesquisa
	
Scenario: Consulta Lupa com sucesso  
	When preencher a barra de pesquisa da lupa 
	And clicar no produto pesquisado
	Then validar pagina do produto pesquisado
	
Scenario: Consulta Lupa sem sucesso  
	When preencher a barra de pesquisa da lupa com produto inexistente 
	And clicar no botao da lupa de pesquisa
	And clicar no botao fechar lupa
	Then validar mensagem de produto nao encontrado