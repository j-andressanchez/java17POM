package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.LoginPage;

public class Login {

    @Steps
    LoginPage loginPage;

    @Given("Se encuentra en la login page de orange")
    public void abrirLoginPage(){
        loginPage.open();
    }

    @When("digita las credenciales de inicio")
    public void digitarCredencialesStandar(){
        loginPage.diligenciarUsuario("Admin");
        loginPage.diligenciarPassword("admin123");
    }

    @When("da click en el boton login")
    public void clickEnLogin(){
        loginPage.clickLogin();
    }

}
