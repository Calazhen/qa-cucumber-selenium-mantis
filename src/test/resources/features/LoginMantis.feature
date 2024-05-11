#language:pt

Funcionalidade: Login

  @LoginComSucesso
  Cenario: Login com sucesso
    Dado que esteja na pagina da login
    Quando o login for realizado com usuario padrao
    Entao valido que o login foi realizado
