package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.LoginPage;

public class Login {

    @Steps
    LoginPage loginPage;

    @Given("Se encuentra en la login page de sauce demo")
    public void abrirLoginPage(){
        loginPage.open();
    }

    @When("digita las credenciales standard")
    public void digitarCredencialesStandar(){
        loginPage.diligenciarUsuario("standard_user");
        loginPage.diligenciarPassword("secret_sauce");
    }

    @When("da click en el boton login")
    public void clickEnLogin(){
        loginPage.clickLogin();
    }

    @Then("valida que el título sea {string}")
    public void validarTitulo(String title){
        loginPage.validarTitulo(title);
    }
}
