Feature: Login com sucesso

	Context:
	Dado que usuario esta na pagina inicial

Scenario: Login com sucesso 
	Given Usuario clica no botao de acesso de usuarios 
	When Usuario digita seu Usuario 
	And Usuario digita sua Senha
	And Usuario clica no botao Login
	Then validar Login com sucesso
	

	


