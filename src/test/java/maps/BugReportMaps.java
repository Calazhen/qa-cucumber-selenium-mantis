package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BugReportMaps  {
    @FindBy(id="category_id")
    protected WebElement cboCategoria;

    @FindBy(id="reproducibility")
    protected WebElement cboFrequencia;

    @FindBy(id="severity")
    protected WebElement cboGravidade;

    @FindBy(id="priority")
    protected WebElement cboPrioridade;

    @FindBy(css = "i[title='+']")
    protected WebElement btnPlusPreenchaPerfil;

    @FindBy(id="summary")
    protected WebElement inpResumo;

    @FindBy(id="description")
    protected WebElement inpDescricao;

    @FindBy(id="steps_to_reproduce")
    protected WebElement inpPassosParaReproduzir;

    @FindBy(id="additional_info")
    protected WebElement inpInformacoesAdicionais;

    @FindBy(id= "tag_select")
    protected  WebElement cboMarcadoresAtuais;

    @FindBy(xpath = "(//div[@class='dropzone center dz-clickable'])[1]")
    protected  WebElement dragAndDropAdicionarArquivos;

    @FindBy (xpath = "//span[normalize-space()='público']")
    protected WebElement rdbVisibilidadePublico;

    @FindBy (xpath = "//span[normalize-space()='privado']")
    protected WebElement rdbVisibilidadePrivado;

    @FindBy(xpath = "//span[normalize-space()='selecione para criar mais tarefas']")
    protected WebElement chkContinuarRelatando;

    @FindBy(css = "input[value='Criar Nova Tarefa']")
    protected WebElement btCriarNovaTarefa;





}
