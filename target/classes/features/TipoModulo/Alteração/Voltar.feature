#language: pt
#encoding: utf-8

Funcionalidade: Voltar do Alterar Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Voltar tipo de módulo
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao Tipo de Módulo no menu Configuração
    E eu clicar na acao 'Alterar'
    Quando eu clicar no botão Voltar
    Então o sistema retorna para a página anterior
