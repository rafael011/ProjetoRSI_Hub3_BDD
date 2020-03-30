Feature: Consulta Lupa

	Context:
	Dado que usuario esta na pagina inicial

Scenario: Consulta Lupa com sucesso 
	Given clicar no botao da lupa de pesquisa 
	When preencher a barra de pesquisa da lupa 
	And clicar no produto pesquisado
	Then validar pagina do produto pesquisado