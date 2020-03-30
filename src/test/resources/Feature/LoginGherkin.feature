@login
Feature: Login com sucesso

	Context:
	Dado que usuario esta na pagina inicial

Scenario: Login com sucesso 
	Given clicar no botao de acesso de usuarios 
	When preencher o campo Usuario 
	And preencher o campo Senha
	And clicar no botao Login
	Then validar Login com sucesso
	

	


