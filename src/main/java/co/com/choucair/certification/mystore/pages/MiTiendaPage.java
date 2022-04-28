package co.com.choucair.certification.mystore.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class MiTiendaPage extends PageObject {

    // label nombre usuario
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]")
    WebElementFacade labelNombreUsuario;

    public void validarSesionUsuario() {
            String nombreLabel = "Leonardo Quintero";
            String textoLabel = labelNombreUsuario.getText();
            assertThat(nombreLabel, containsString(textoLabel));
        }
    }

