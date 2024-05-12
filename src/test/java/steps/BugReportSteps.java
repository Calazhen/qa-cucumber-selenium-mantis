package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.BugReportPage;
import pages.MyViewPage;
import runner.RunBase;
import utils.data_driven.ReadPropertiesFile;

import java.io.IOException;

public class BugReportSteps {
    MyViewPage myViewPage;
    BugReportPage bugReportPage;
    ReadPropertiesFile readPropertiesFile;

    protected  String resumo;
    protected String descricao;
    protected String mensagemSucesso;
    protected String mensagemAtual ="Por favor, utilize o botão \"Voltar\" de seu navegador web para voltar à pagina anterior. Lá você pode corrigir quaisquer problemas identificados neste erro ou escolher uma outra ação. Você também pode clicar em uma opção da barra de menus para ir diretamente para outra seção.";


    @Dado("que estou na tela de criar tarefa")
    public void que_estou_na_tela_de_criar_tarefa() throws IOException {
        myViewPage = new MyViewPage();
        bugReportPage = new BugReportPage();
        myViewPage.criarNovaterefa();
        readPropertiesFile = new ReadPropertiesFile();
        resumo = readPropertiesFile.getReadPropertiesFile("Resumo");
        descricao = readPropertiesFile.getReadPropertiesFile("Descricao");

    }

    @Dado("tenho os dados preenchidos")
    public void tenho_os_dados_preenchidos() throws IOException {
        bugReportPage.cadastrarTarefaCamposObrigatorios(resumo, descricao);
    }

    @Quando("clicar em criar nova tarefa")
    public void clicar_em_criar_nova_tarefa() {
        bugReportPage.criarNovaTarefa();
    }

    @Entao("deve visualizar a mensagem de sucesso")
    public void deve_visualizar_a_mensage_de_sucesso() throws IOException {
        mensagemSucesso = RunBase.getDriver().findElement(By.cssSelector(".alert.alert-danger")).getText();
        System.out.println(mensagemSucesso);
        Assert.assertEquals(mensagemAtual,mensagemSucesso);

    }



}
