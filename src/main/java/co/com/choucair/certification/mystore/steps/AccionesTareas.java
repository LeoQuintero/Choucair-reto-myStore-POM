package co.com.choucair.certification.mystore.steps;

import co.com.choucair.certification.mystore.pages.AutenticacionPage;
import co.com.choucair.certification.mystore.pages.InicioPage;
import net.thucydides.core.annotations.Step;

public class AccionesTareas {
    private AutenticacionPage autenticacionPage;
    private InicioPage inicioPage;

    @Step
    public void ClickLogin() {
        inicioPage.darClickBotonLogin();
    }

    @Step
    public void IniciarSesion(String strusuario, String strclave) {
        autenticacionPage.ingresarDatosUsuario(strusuario, strclave);
    }
}
