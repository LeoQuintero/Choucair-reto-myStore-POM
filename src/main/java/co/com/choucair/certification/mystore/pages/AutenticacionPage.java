package co.com.choucair.certification.mystore.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AutenticacionPage extends PageObject {


    //campo email
    @FindBy(id = "email")
    WebElementFacade campoEmail;

    //campo password
    @FindBy(id = "passwd")
    WebElementFacade campoPassword;

    //botón Sign in
    @FindBy(id = "SubmitLogin")
    WebElementFacade botonSignin;

    public void ingresarDatosUsuario(String strusuario, String strclave) {
        campoEmail.sendKeys(strusuario);
        campoPassword.sendKeys(strclave);
        botonSignin.click();
    }
}

