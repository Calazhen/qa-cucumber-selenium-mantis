#language:pt
Funcionalidade: Criar Tarefa

  Contexto:
    Dado que esteja na pagina da login
    Quando o login for realizado com usuario padrao

    Cenario: Criar Tarefa com todos os campos preenchidos

      Dado que estou na tela de criar tarefa
      E tenho os dados preenchidos
      Quando clicar em criar nova tarefa
      Entao devo visualizar a tarefa no dashboard
