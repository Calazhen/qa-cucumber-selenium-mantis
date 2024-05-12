package pages;

import maps.BugReportMaps;
import org.openqa.selenium.support.PageFactory;
import runner.RunBase;
import utils.data_driven.ReadPropertiesFile;

import java.io.IOException;

public class BugReportPage extends BugReportMaps {
    ReadPropertiesFile readPropertiesFile;

    public BugReportPage() {
        PageFactory.initElements(RunBase.getDriver(), this);

    }

    public void cadastrarTarefaCamposObrigatorios(String resumo, String descricao) {
        inpResumo.sendKeys(resumo);
        inpDescricao.sendKeys(descricao);
    }

    public void cadastrarTarefaPadrao() throws IOException {
        cboFrequencia.selectByValue("sempre");
        cboGravidade.selectByValue("grande");
        cboPrioridade.selectByValue("alta");
        inpResumo.sendKeys(readPropertiesFile.getReadPropertiesFile("Resumo"));
        inpDescricao.sendKeys(readPropertiesFile.getReadPropertiesFile("Descricao"));
        inpPassosParaReproduzir.sendKeys(readPropertiesFile.getReadPropertiesFile("PassosParaReproduzir"));
        inpInformacoesAdicionais.sendKeys(readPropertiesFile.getReadPropertiesFile("InformacoesAdicionais"));
        dragAndDropAdicionarArquivos.sendKeys(readPropertiesFile.getReadPropertiesFile("bug"));
    }

    public void criarNovaTarefa() {
        btCriarNovaTarefa.click();
    }

}
