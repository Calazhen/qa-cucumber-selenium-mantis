package pages;

import maps.BugReportMaps;
import org.openqa.selenium.support.PageFactory;
import runner.RunBase;


public class BugReportPage extends BugReportMaps {

    public BugReportPage() {
        PageFactory.initElements(RunBase.getDriver(), this);


    }

    public void cadastrarTarefaCamposObrigatorios(String resumo, String descricao) {
        inpResumo.sendKeys(resumo);
        inpDescricao.sendKeys(descricao);
    }

    public void criarNovaTarefa() {
        btCriarNovaTarefa.click();
    }

    public String pegarMensagemDeSucesso() {
        String mensagemSucessoCompleta = msgSucessoAoCriarTarefa.getText();
        String[] linha = mensagemSucessoCompleta.split("\n");
        return linha[0];

    }

    public String pegarMensagemDeLimiteTarefasCriadas() {
        return msgErroDeLimiteTarefasCriadas.getText();
    }


}
