#language: pt
#encoding: utf-8

Funcionalidade: Incluir Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Incluir Tipo de Módulo com dados válidos
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao Tipo de Módulo no menu Configuração
    E que eu clique no botão Incluir Tipo de Módulo
    E que eu preencha o campo Tipo de Módulo com 'Teste1010'
    Quando eu clicar no botão Salvar
    Então o sistema retorna a página anterior e exibe a mensagem de sucessso 'Tipo de Módulo salvo com sucesso!'








