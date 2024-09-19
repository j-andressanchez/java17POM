package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MainPage extends PageObject {

    private By pimButton = By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]");
    private By addButton = By.xpath("//button[text()=' Add ']");


    public void clickPim(){
        $(pimButton).click();
    }

    public void clickAdd(){
        $(addButton).click();
    }
}
