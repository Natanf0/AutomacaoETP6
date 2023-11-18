#language: pt
#encoding: utf-8

Funcionalidade: Alterar Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Consultar tipo de módulo
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao Tipo de Módulo no menu Configuração
    E que eu realize a inclusao previa e pesquise pelo tipo de módulo recem incluido
    E eu clicar na acao 'Alterar'
    Quando eu alterar o campo Tipo de Mdulo com 'Modulo TY22'
    E eu clicar no botão Salvar
    Então o sistema retorna a página anterior e exibe a mensagem de sucessso 'Alteração no tipo de módulo salva com sucesso.'

