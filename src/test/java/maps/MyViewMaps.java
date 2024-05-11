package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyViewMaps {

    @FindBy(css = "#breadcrumbs > ul > li > a")
    protected WebElement linkBoasVindas;

    @FindBy(css = "a[class='btn btn-primary btn-sm']")
    protected WebElement btnCriarTarefa;

}
