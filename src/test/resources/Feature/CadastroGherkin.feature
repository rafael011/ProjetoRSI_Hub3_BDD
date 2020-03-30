Feature: Cadastro com sucesso 

	Context:
	Dado que usuario esta na pagina inicial

Scenario: Cadastro com sucesso 
	Given clicar no botao de acesso de usuarios 
	When clicar no botao Criar nova conta 
	And preencher o campo usuario 
	And preencher o campo email 
	And preencher o campo senha 
	And preencher o campo confirmar senha 
	And preencher o campo nome 
	And preencher o campo sobre nome 
	And preencher o campo telefone 
	And selecionar o pais 
	And preencher o campo cidade 
	And preencher o campo endereco 
	And preencher o campo estado 
	And preencher o campo cep 
	And marcar a opcao de aceitar os termos 
	And clicar no botao cadastrar 
	Then validar cadastro com sucesso