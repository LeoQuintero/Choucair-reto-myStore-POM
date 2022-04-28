package co.com.choucair.certification.mystore.steps;

import co.com.choucair.certification.mystore.pages.AutenticacionPage;
import co.com.choucair.certification.mystore.pages.InicioPage;
import co.com.choucair.certification.mystore.pages.MiTiendaPage;
import net.thucydides.core.annotations.Step;

public class AccionesTareasStep {
    private AutenticacionPage autenticacionPage;
    private InicioPage inicioPage;
    private MiTiendaPage miTiendaPage;

    @Step
    public void ClickLogin() {
        inicioPage.darClickBotonLogin();
    }

    @Step
    public void IniciarSesion(String strusuario, String strclave) {
        autenticacionPage.ingresarDatosUsuario(strusuario, strclave);

    }

    @Step
    public void validarSesionUsuario() {
        miTiendaPage.validarSesionUsuario();
    }
}
