Feature: Login 

Scenario: Login realizado com sucesso 
	Given Usuario esta na Pagina Inicial 
	When Usuario navega ate a Pagina de Login 
	And Usuario digita seu Usuario e Senha 
	Then exibida Login com sucesso