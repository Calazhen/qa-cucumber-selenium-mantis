package pages;

import maps.LoginMaps;
import org.openqa.selenium.support.PageFactory;
import runner.RunBase;

import java.util.concurrent.TimeUnit;

public class LoginPage extends LoginMaps {

    public LoginPage() {
        PageFactory.initElements(RunBase.getDriver(), this);
    }

    public void realizarLogin(String usuario, String senha) {
        RunBase.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        inpNomeDeUsuario.sendKeys(usuario);
        btnEntrar.click();
        inpSenha.sendKeys(senha);
        cbxMantenhaMeConectado.click();
        btnEntrar.click();
    }
}


