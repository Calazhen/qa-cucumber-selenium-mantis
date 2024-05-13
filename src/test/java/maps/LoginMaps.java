package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginMaps {

    @FindBy(id = "username")
    protected WebElement inpNomeDeUsuario;
    @FindBy(id = "password")
    protected WebElement inpSenha;
    @FindBy(css = "input[value='Entrar']")
    protected WebElement btnEntrar;
    @FindBy(css = "label[for='remember-login'] span[class='lbl padding-6']")
    protected WebElement cbxMantenhaMeConectado;


}
