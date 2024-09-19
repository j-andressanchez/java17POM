package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class LoginPage extends PageObject {

    private By userNameBox = By.id("user-name");
    private By passwordBox = By.id("password");
    private By loginButton = By.id("login-button");
    private By titleText = By.className("title");

    public void diligenciarUsuario(String user){
        $(userNameBox).type(user);
    }

    public void diligenciarPassword(String password){
        $(passwordBox).type(password);
    }

    public void clickLogin(){
        $(loginButton).click();
    }

    public void validarTitulo(String title){
        String actualTitle = $(titleText).getText();
        assertEquals("Título esperado no es igual", title, actualTitle);
    }
}
