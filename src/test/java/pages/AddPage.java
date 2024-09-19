package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddPage extends PageObject {

    private By firstNameInput = By.xpath("//input[@name='firstName']");
    private By middleNameInput = By.xpath("//input[@name='middleName']");
    private By lastNameInput = By.xpath("//input[@name='lastName']");
    private By employeIdInput = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private By detailsSwitchLabel = By.xpath("//div[@class='oxd-switch-wrapper']/label");
    private By usernameInput = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private By passwordInput = By.xpath("(//div[@class='oxd-form-row user-password-row']//input[@class='oxd-input oxd-input--active'])[1]");
    private By confirmPassInput = By.xpath("(//div[@class='oxd-form-row user-password-row']//input[@class='oxd-input oxd-input--active'])[2]");
    private By saveButton = By.xpath("//button[text()=' Save ']");
    private By usernameLabel = By.xpath("//label[text()='Username']");

    public void validaLabel(){
        $(usernameLabel).waitUntilVisible();
    }

    public void clickSaveButton(){
        $(saveButton).click();
    }

    public void typeConfirmPass(String password){
        $(confirmPassInput).clear();
        $(confirmPassInput).type(password);
    }

    public void typePassword(String password) {
        $(passwordInput).clear();
        $(passwordInput).type(password);
    }

    public void typeUsername(String user){
        $(usernameInput).clear();
        $(usernameInput).type(user);
    }

    public void typeFirstName(String name){
        $(firstNameInput).clear();
        $(firstNameInput).type(name);
    }

    public void typeMiddleName(String middleName){
        $(middleNameInput).clear();
        $(middleNameInput).type(middleName);
    }

    public void typeLastName(String lastName){
        $(lastNameInput).clear();
        $(lastNameInput).type(lastName);
    }

    public void typeEmployeeId(int id){
        $(employeIdInput).clear();
        $(employeIdInput).type(String.valueOf(id));
    }

    public void clickSwitchDetails(){
        $(detailsSwitchLabel).click();
    }
}
