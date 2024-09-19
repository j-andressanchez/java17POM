package definitions;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.AddPage;
import pages.MainPage;

public class MainDefinition {

    @Steps
    MainPage mainPage;
    AddPage addPage;

    @When("da click en el boton PIM")
    public void clickPIM(){
        mainPage.clickPim();
    }

    @When("agrega nuevo usuario")
    public void agregarUser() {
        mainPage.clickAdd();
        addPage.clickSwitchDetails();
        addPage.validaLabel();
        addPage.typeFirstName("Jhon");
        addPage.typeMiddleName("Andres");
        addPage.typeLastName("Sanchez");
        addPage.typeEmployeeId(00413);
        addPage.typeUsername("jasanch");
        addPage.typePassword("jasanch123");
        addPage.typeConfirmPass("jasanch123");
        addPage.clickSaveButton();
    }

}
