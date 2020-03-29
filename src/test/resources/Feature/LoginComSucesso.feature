Feature: Login com sucesso

Scenario: Login realizado com sucesso 
	Given Usuario esta na Pagina Inicial 
	When Usuario navega ate a Pagina de Login 
	And Usuario digita seu Usuario e Senha 
	Then validar Login com sucesso
