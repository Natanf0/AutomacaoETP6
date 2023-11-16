#language: pt
#encoding: utf-8

Funcionalidade: Incluir Tipo de Módulo com dados inválidos

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Incluir tipo de módulo sem preencher campo obrigatório
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao 'Tipo de Módulo' no menu Configuração
    E que eu clique no botão Incluir Tipo de Módulo
    E que eu limpe o campo Tipo de Módulo
    Quando eu clicar no botão Salvar
    Então o sistema exibe mensagem de crítica



