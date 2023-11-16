#language: pt
#encoding: utf-8

Funcionalidade: Consultar Tipo de Módulo

  Contexto:
    Dado que eu acesse a tela de login do sistema

  Cenario: Consultar tipo de módulo
    E que eu acesse o sistema com o perfil 'Proprietario'
    E que eu selecione a opcao Tipo de Módulo no menu Configuração
    E que eu realize a inclusao previa do tipo de modulo 'Modulo x3sa' e pesquise pelo tipo de módulo recem incluido
    Quando eu clicar na acao 'Consultar'
    Então o sistema exibe a tela de consulta do tipo de módulo 'Modulo x3sa'

