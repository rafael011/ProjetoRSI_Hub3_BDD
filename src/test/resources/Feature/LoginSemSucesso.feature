Feature: Login sem sucesso

Scenario: Login sem sucesso 
	Given Usuario esta na Pagina Inicial 
	When Usuario navega ate a Pagina de Login 
	And Usuario digita seu Usuario e Senha invalidos 
	Then exibir mensagem de erro