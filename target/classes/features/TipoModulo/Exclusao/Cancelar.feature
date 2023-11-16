#language: pt
#encoding: utf-8

Funcionalidade: Cancelar do excluir Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Cancelar do excluir Tipo de Módulo com dados válidos
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao 'Tipo de Módulo' no menu Configuração
    E eu clicar na acao 'Excluir'
    E que eu clique no botão Excluir
    E que eu clique em cancelar
    Então o sistema fecha a modal e permanece na pagina








