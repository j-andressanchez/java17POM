package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class LoginPage extends PageObject {

    private By userNameBox = By.xpath("//input[@name='username']");
    private By passwordBox = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[text()=' Login ']");

    public void diligenciarUsuario(String user){
        $(userNameBox).type(user);
    }

    public void diligenciarPassword(String password){
        $(passwordBox).type(password);
    }

    public void clickLogin(){
        $(loginButton).click();
    }
}
