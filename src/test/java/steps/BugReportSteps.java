package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.BugReportPage;
import pages.MyViewPage;
import utils.data_driven.ReadPropertiesFile;

import java.io.IOException;

public class BugReportSteps {
    MyViewPage myViewPage;
    BugReportPage bugReportPage;
    ReadPropertiesFile readPropertiesFile;

    protected String resumo;
    protected String descricao;
    protected String mensagemDeErroLimiteCriacaoTarefas = "APPLICATION ERROR #27\n" +
            "Você atingiu o limite permitido de atividade de 10 nos últimos 3600 segundos, suas ações foram bloqueados para evitar spam's, por favor, tente novamente mais tarde.\n" +
            "Por favor, utilize o botão \"Voltar\" de seu navegador web para voltar à pagina anterior. Lá você pode corrigir quaisquer problemas identificados neste erro ou escolher uma outra ação. Você também pode clicar em uma opção da barra de menus para ir diretamente para outra seção.";
    protected String mensagemDeSucessoCompleta = "Operação realizada com sucesso.\n" +
            "\n" +
            "Visualizar Tarefa Enviada 386\n" +
            "Ver Tarefas";

    protected String mensagemDeSucesso = "Operação realizada com sucesso.";

    @Dado("que esta na tela de criar tarefa")
    public void que_estou_na_tela_de_criar_tarefa() throws IOException {
        myViewPage = new MyViewPage();
        bugReportPage = new BugReportPage();
        readPropertiesFile = new ReadPropertiesFile();
        resumo = readPropertiesFile.getReadPropertiesFile("Resumo");
        descricao = readPropertiesFile.getReadPropertiesFile("Descricao");
        myViewPage.criarNovaterefa();
    }

    @Dado("tem os dados preenchidos")
    public void tenho_os_dados_preenchidos()  {
        bugReportPage.cadastrarTarefaCamposObrigatorios(resumo, descricao);
    }

    @Quando("clicar em criar nova tarefa")
    public void clicar_em_criar_nova_tarefa() {
        bugReportPage.criarNovaTarefa();
    }

    @Entao("deve visualizar a mensagem de sucesso")
    public void deve_visualizar_a_mensage_de_sucesso()  {
        // Assert.assertEquals(mensagemDeErroLimiteCriacaoTarefas, bugReportPage.pegarMensagemDeLimiteTarefasCriadas());
        // Assert para sucesso da criação da Task
        Assert.assertEquals(mensagemDeSucesso, bugReportPage.pegarMensagemDeSucesso());
    }


}
