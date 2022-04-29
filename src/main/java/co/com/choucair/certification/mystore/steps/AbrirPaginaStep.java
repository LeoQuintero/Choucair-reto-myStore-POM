package co.com.choucair.certification.mystore.steps;

import co.com.choucair.certification.mystore.pages.InicioPage;
import net.thucydides.core.annotations.Step;

public class AbrirPaginaStep {
    private InicioPage inicioPage;

    @Step
    public void abrilUrl() {
        inicioPage.open();

    }


}
