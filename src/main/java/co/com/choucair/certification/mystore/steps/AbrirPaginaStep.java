package co.com.choucair.certification.mystore.steps;

import co.com.choucair.certification.mystore.pages.InicioPage;

public class AbrirPaginaStep {
    private InicioPage inicioPage;
    public void abrilUrl() {
        inicioPage.open();
    }
}
