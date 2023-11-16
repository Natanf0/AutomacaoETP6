#language: pt
#encoding: utf-8

Funcionalidade: Exemplo de funcionalidade

  Contexto:
    Dado que acesse a pagina do Training Wheels Protocol

  @Fluxo_Principal
  Esquema do Cenario: Login - Basic Auth
    E Clique em 'Basic Auth'
    E Prencha '<usuario>' e '<senha>'
    Exemplos:
      | usuario | senha |
      | admin   | admin |

  @Fluxo_Principal
  Cenario: Clicar Checkboxes
    E Clique em 'Checkboxes'
    E Selecionar a opcao 'iron-man'

  @Fluxo_Principal
  Cenario: Clicar Radio Buttons
    E Clique em 'Radio Buttons'
    E Selecionar o radio button 'the-avengers'

  @Fluxo_Principal
  Cenario: Selecionar Combo Box
    E Clique em 'Dropdown'
    Quando Selecionar a opcao do combobox 'Natasha Romanoff'

  @Test
  Esquema do Cenario: Login
    E Clique em 'Login'
    E Preencher as credenciais com '<usuario>' e '<senha>'
    E clicar em login
    Então Validar a mensagem de login 'Olá, Tony Stark. Você acessou a área logada!'
    E limpo o cache '<cache>'

    Exemplos:
      | usuario | senha   | cache |
      | stark   | jarvis! | true  |
      | stark   | jarvis! | false |

  @Validacoes
  Cenario: Mover o mouse
    E Clique em 'Hovers'
    Quando Mover o mouse sobre a foto do 'Homem Aranha'

  @Validacoes
  Cenario: Validar botao bloqueado
    E Clique em 'Select 2 Uma opcao'
    Quando Clicar em liga-Desliga
    Então a comboBox fica bloqueada

  @Validacoes
  Esquema do Cenario: Alertas
    E Clique em 'Alertas em JavaScript'
    Quando clico no alert JavaScript '<alert>' e confirmo o Alerta
    E valido a mensagem '<mensagem>'
    Exemplos:
      | alert    | mensagem                 |
      | Alerta   | Você ativou um alerta JS |
      | Confirma | Mensagem confirmada      |

  @Validacoes
  Esquema do Cenario: Alerta - Prompt
    E Clique em 'Alertas em JavaScript'
    Quando clico no alert JavaScript '<alert>', preencher o nome '<mensagem>' e confirmo o Alerta
    E valido a mensagem Prompt '<mensagem>'
    Exemplos:
      | alert  | mensagem |
      | Prompt | Teste    |

  @teste
  Esquema do Cenario: Tabelas
    E Clique em 'Tabelas'
    Quando clico em '<acao>'
    Exemplos:
      | acao   |
      | edit   |
      | delete |

  @Fluxo_Alternativo
  Cenario: Upload de Arquivos
    E Clique em 'Upload de Arquivos'
    E gerar o QrCode com nome 'qrCodeTest' da url 'https://www.youtube.com/c/ManualdoQA'
    Quando faço o upload do QR Code
    Então valido a mensagem de sucesso 'File Uploaded!'