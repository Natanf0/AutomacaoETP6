#language: pt
#encoding: utf-8

Funcionalidade: Excluir Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Incluir Tipo de Módulo com dados válidos
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao Tipo de Módulo no menu Configuração
    E que eu realize a inclusao previa e pesquise pelo tipo de módulo recem incluido
    E eu clicar na acao 'Excluir'
    E que eu clique no botão Excluir
    E que eu confirme a exclusao
    Então o sistema retorna a página anterior e exibe a mensagem de sucessso 'Tipo de Módulo excluído com sucesso!'








