# language:pt

Funcionalidade: Criar Tarefa

  Contexto:
    Dado que esteja na pagina da login
    Quando o login for realizado com usuario padrao

  @CriarTarefa
  Cenario: Criar Tarefa com todos os campos preenchidos
    Dado que estou na tela de criar tarefa
    E tenho os dados preenchidos
    Quando clicar em criar nova tarefa
    Entao deve visualizar a mensagem de sucesso



