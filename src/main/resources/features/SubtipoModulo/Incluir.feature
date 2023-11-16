#language: pt
#encoding: utf-8

Funcionalidade: Incluir Subtipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Incluir Subipo de Módulo com dados válidos
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao 'Subtipo de Módulo' no menu Configuração
    E que eu clique no botão Incluir Subtipo de Módulo
    E que eu selecione o campo Tipo de Módulo com 'Manobra'
    E que eu preencha o campo Sigla do Subtipo de Módulo com 'DDAA'
    E que eu preencha o campo Nome do Subtipo de Módulo com 'Nome novo'
    Quando eu clicar no botão Salvar
    Então o sistema retorna a página anterior e exibe a mensagem de sucessso 'Subtipo de Módulo salvo com sucesso!'








