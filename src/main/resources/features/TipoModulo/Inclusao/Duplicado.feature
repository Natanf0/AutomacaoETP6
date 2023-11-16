#language: pt
#encoding: utf-8

Funcionalidade: Incluir Tipo de Módulo duplicado

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Incluir Tipo de Módulo com dado duplicado
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao Tipo de Módulo no menu Configuração
    E que eu clique no botão Incluir Tipo de Módulo
    E que eu preencha o campo Tipo de Módulo com 'Duplicado01111'
    E eu clicar no botão Salvar
    E que eu clique no botão Incluir Tipo de Módulo
    E que eu preencha o campo Tipo de Módulo com 'Duplicado01111'
    Quando eu clicar no botão Salvar
    Então o sistema permanece na página e exibe a mensagem de crítica 'Não foi possível salvar alterações porque este tipo de módulo já está cadastrado.'








