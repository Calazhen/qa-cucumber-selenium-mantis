package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;
import pages.MyViewPage;
import runner.RunBase;
import utils.data_driven.ReadPropertiesFile;
import utils.screenShot.Screenshot;

import java.io.IOException;


public class LoginSteps {
    private LoginPage loginPage;
    private MyViewPage myViewPage;
    ReadPropertiesFile readPropertiesFile;


    @Dado("que esteja na pagina da login")
    public void que_esteja_na_pagina_da_login() {
        loginPage = new LoginPage();
        myViewPage = new MyViewPage();
    }

    @Quando("o login for realizado com usuario padrao")
    public void o_login_for_realizado_com_usuario_padrao() throws IOException {
        loginPage.realizarLogin(readPropertiesFile.getReadPropertiesFile("User"), readPropertiesFile.getReadPropertiesFile("Password"));
    }

    @Entao("valido que o login foi realizado")
    public void valido_que_o_login_foi_realizado() throws IOException {
        Assert.assertEquals(readPropertiesFile.getReadPropertiesFile("User") + " ( Henrique Calazans )", myViewPage.getBoasVindas());
    }

    @After
    public void encerraTeste(Scenario scenario) {
        if ((scenario.isFailed())) {
            System.out.println("============================");
            System.out.println("Test que falhou: " + scenario.getName());
            System.out.println("Status: " + scenario.getStatus());
            System.out.println("Tag: " + scenario.getSourceTagNames());
            System.out.println("============================");
            Screenshot.addScreenshotOnScenario(scenario);
        }
        RunBase.getDriver().quit();

    }

    @Before
    public void inicializaTeste() throws IOException {
        // Comente a String abaixo e substitua o valor por "FIREFOX na última linha do método para rodar manualmente
        String browser = System.getProperty("browser").toUpperCase();
        readPropertiesFile = new ReadPropertiesFile();
        String baseUrl = readPropertiesFile.getReadPropertiesFile("baseUrl");
        RunBase.getDriver(RunBase.Browser.valueOf(browser)).get(baseUrl);


        System.out.println("**********************************************************");
        System.out.println("**********************************************************");
        System.out.println(System.getProperty("user.dir") + "\\src\\test\\resources\\values.properties");
        System.out.println("**********************************************************");
        System.out.println("**********************************************************");
        System.out.println(System.getProperty("user.dir"));
        System.out.println("**********************************************************");
        System.out.println("**********************************************************");
    }


}

