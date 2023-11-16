#language: pt
#encoding: utf-8

Funcionalidade: Limpar do Alterar Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenário: Limpar tipo de módulo
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao 'Tipo de Módulo' no menu Configuração
    E eu clicar na acao 'Alterar'
    Quando eu clicar no botão Limpar
    Então o campo Tipo de Módulo será limpo

