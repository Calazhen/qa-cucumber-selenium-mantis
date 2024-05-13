## Automação de testes Web com Java, Selenium e Cucumber

Este é um projeto de testes automatizados de Web, cumprindo os [Requisitos](https://glitter-chauffeur-462.notion.site/Desafio-de-Automa-o-Base2-b3dd20f2e40a4ba1b3fcc366f94cdb1d?pvs=4) especificados no Desafio da Empresa.

### Pré-Requisitos do Projeto

Antes de executar os testes, certifique-se de que os seguintes softwares estão instalados no seu sistema:

[INTELIJ Community Edition](https://www.jetbrains.com/idea/)

[Java versão 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

[Apache Maven 3.9.6](https://maven.apache.org/download.cgi)


### **Funcionalidades**

**Login com sucesso:**

Esta funcionalidade testa o login com usuario padrão criado pela a empresa para desenvolvimento do Desafio Técnico.

**Criar Nova Tarefa:**

Esta funcionalidade testa a criação de uma nova tarefa (Bug) no sistema Mantis.


## Executando os Testes:
Para executar os testes, siga estes passos:

1. Clone o repositório:

```powershell
git clone https://github.com/Calazhen/qa-cucumber-selenium-mantis
```

2. Navegue para o diretório do projeto:

```powershell
cd desafio-mantis-base2
```

3. Execute os testes  escolhendo o browser:

```powershell
mvn test -Dtest=**/*RunCucumberTest -Dbrowser=firefox
```
4. Gere o relatório do cucumber:

```powershell
mvn cluecumber-report:reporting
```



### Contatos:
Caso tenha alguma dúvida, entre em contato pelo meu [Linkedin](https://www.linkedin.com/in/henrique-calazans/)

