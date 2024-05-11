package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import maps.BugReportMaps;
import pages.MyViewPage;

public class CriarTarefaSteps {
    MyViewPage myViewPage;
    BugReportMaps bugReportMaps;

    @Dado("^que estou na tela de criar tarefa$")
    public void que_estou_na_tela_de_criar_tarefa(){
        myViewPage = new MyViewPage();
        bugReportMaps = new BugReportMaps();

        myViewPage.criarNovaterefa();
    }

    @Dado("^tenho os dados preenchidos$")
    public void tenho_os_dados_preenchidos()   {

    }

    @Quando("^clicar em criar nova tarefa$")
    public void clicar_em_criar_nova_tarefa()  {
    }

    @Entao("^devo visualizar a tarefa no dashboard$")
    public void devo_visualizar_a_tarefa_no_dashboard()   {

    }

}
