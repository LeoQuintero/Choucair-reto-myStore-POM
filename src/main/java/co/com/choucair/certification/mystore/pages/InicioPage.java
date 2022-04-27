package co.com.choucair.certification.mystore.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class InicioPage extends PageObject {
    //login
    @FindBy(className = "login")
    WebElementFacade botonLogin;

    public void darClickBotonLogin() {
        botonLogin.click();    }
}
