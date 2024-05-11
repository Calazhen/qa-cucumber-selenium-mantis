package pages;

import maps.BugReportMaps;
import org.openqa.selenium.support.PageFactory;
import runner.RunBase;

public class BugReportPage extends BugReportMaps {

    public BugReportPage() {
        PageFactory.initElements(RunBase.getDriver(), this);
    }

    public void cadastrarNovaTarefa(){

    }

}
