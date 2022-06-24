# language: pt
# encoding: utf-8

  @AcessarGoogleChrome
  Funcionalidade: pesquisar no Google Chrome
    @ObterResultadosDaPesquisa
      Cenario: acessar Google Chrome
        Dado acesso o Google Chrome
        Quando digito os dados da pesquisa
        Entao os resultados da pesquisa serão exibidos