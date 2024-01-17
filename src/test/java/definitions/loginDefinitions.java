package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.loginPage;

public class loginDefinitions {
    loginPage login;

    public loginDefinitions() {
        login=new loginPage(Hooks.driver);

    }

    @Given("ingresar usuario {string}")
    public void ingresarUsuario(String texto) {
        login.escribirUsuario(texto);
    }


    @And("ingresar password {string}")
    public void ingresarPassword(String texto) {
        login.escribirPassword(texto);
    }

    @When("ingresar a la app")
    public void ingresarALaApp() {
        login.clickLogin();
    }
}
