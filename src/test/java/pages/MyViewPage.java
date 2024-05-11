package pages;

import maps.MyViewMaps;
import org.openqa.selenium.support.PageFactory;
import runner.RunBase;

public class MyViewPage extends MyViewMaps {

    public MyViewPage() {
        PageFactory.initElements(RunBase.getDriver(), this);
    }

    public String getBoasVindas() {
        return linkBoasVindas.getText();
    }

    public void criarNovaterefa() {
        btnCriarTarefa.click();
    }
}


