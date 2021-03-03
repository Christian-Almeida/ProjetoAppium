#language:pt
#encoding: UTF-8

Funcionalidade: Menu Mobile
  Esquema do Cenario: Acessar Menus do site na versao mobile
    Sendo um usuário no site
    desejo acessar os Menus principais

    Dado que esteja na home da pagina
    Quando eu clico no Menu e escolho <titulo>
    Entao deve ir para <url> e mostrar <texto>
    Exemplos:
      | titulo                            | url                                         |texto                |
      |"Quem somos"                       |"https://auditeste.com.br/quem-somos/"       |"//QUEM SOMOS"       |
      |"Cases de Sucesso"                 |"https://auditeste.com.br/cases-de-sucesso/" |"//CASES DE SUCESSO" |
      |"Trabalhe Conosco"                 |"https://auditeste.com.br/trabalhe-conosco/" |"//TRABALHE CONOSCO" |
      |"Blog"                             |"https://auditeste.com.br/blog/"             |"//BLOG"             |
      |"Contato"                          |"https://auditeste.com.br/contato/"          |"//CONTATO"          |


  Esquema do Cenario: Acessar Menu Serviço do site na versao mobile
  Sendo um usuário no site
  desejo acessar o menu de serviço
  assim sendo redirecionado para cada página

    Dado que esteja na home da pagina
    Quando eu clico no Menu Servico e escolho <titulo>
    Entao devera ir para <url> e mostrar <texto>
    Exemplos:
      | titulo                            | url                                                                 |texto                                  |
      |"Testes Automatizados"             |"https://auditeste.com.br/servicos/testes-automatizados/"            |"//TESTES AUTOMATIZADOS"               |
      |"Testes Funcionais Não Funcionais" |"https://auditeste.com.br/servicos/testes-funcionais-nao-funcionais/"|"//TESTES FUNCIONAIS NÃO FUNCIONAIS"   |
      |"Testes Manuais"                   |"https://auditeste.com.br/servicos/testes-manuais/"                  |"//TESTES MANUAIS"                     |
      |"Testes Mobile"                    |"https://auditeste.com.br/servicos/testes-mobile/"                   |"//TESTES MOBILE"                      |
      |"Fábrica de Testes"                |"https://auditeste.com.br/servicos/testes-fabrica/"                  |"//FÁBRICA DE TESTES"                  |
      |"Consultoria"                      |"https://auditeste.com.br/servicos/testes-consultoria/"              |"//CONSULTORIA"                        |
      |"Crowdsourced Auditeste"           |"https://auditeste.com.br/servicos/crowdsourced-auditeste/"          |"//CROWDSOURCED AUDITESTE"             |
      |"Alocação de Profissionais"        |"https://auditeste.com.br/servicos/teste-alocacao/"                  |"//ALOCAÇÃO DE PROFISSIONAIS"          |
      |"Automação de Processos"           |"https://auditeste.com.br/servicos/automacao-de-processos/"          |"//AUTOMAÇÃO DE PROCESSOS"             |
