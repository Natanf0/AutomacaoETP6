#language: pt
#encoding: utf-8

Funcionalidade: Voltar Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Voltar tipo de módulo
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao Tipo de Módulo no menu Configuração
    E que eu clique no botão Incluir Tipo de Módulo
    Quando eu clicar no botão Voltar
    Então o sistema retorna para a página anterior
