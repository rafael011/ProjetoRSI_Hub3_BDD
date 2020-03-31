Feature: Cadastro 

Background: 
	Given inicializar
	When clicar no botao de acesso de usuarios 
	And clicar no botao Criar nova conta 
	
Scenario: Cadastro com sucesso 
	When preencher o campo usuario 
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
	
	Scenario: Cadastro sem sucesso 
	When preencher o campo usuario com dados ja cadastrados
	And preencher o campo email com dados ja cadastrados
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
	Then validar mensagem de usuario ja cadastrado