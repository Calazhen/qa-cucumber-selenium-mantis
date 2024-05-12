package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BugReportMaps {

    @FindBy(id = "summary")
    protected WebElement inpResumo;

    @FindBy(id = "description")
    protected WebElement inpDescricao;


    @FindBy(css = "input[value='Criar Nova Tarefa']")
    protected WebElement btCriarNovaTarefa;

    @FindBy(css = "#main-container > div.main-content > div.page-content > div > div > div.alert.alert-danger")
    protected WebElement msgErroDeLimiteTarefasCriadas;

    @FindBy(css = ".alert.alert-success.center")
    protected WebElement msgSucessoAoCriarTarefa;


}
