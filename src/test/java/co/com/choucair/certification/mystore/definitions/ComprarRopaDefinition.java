package co.com.choucair.certification.mystore.definitions;

import co.com.choucair.certification.mystore.steps.AbrirPaginaStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ComprarRopaDefinition {
    @Steps
    AbrirPaginaStep abrirPaginaStep;

    @Given("^que me encuentro en la pagina web My Store$")
    public void queMeEncuentroEnLaPaginaWebMyStore() {
        abrirPaginaStep.abrilUrl();

    }

    @When("^inicio sesion con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void inicioSesionConUsuarioYClave(String usuario, String clave) {

    }

    @Then("compruebo nombre usuario de inicio sesion")
    public void comprueboNombreUsuarioDeInicioSesion() {

    }

    @When("agrego un producto al carrito de compra")
    public void agregoUnProductoAlCarritoDeCompra() {

    }

    @And("realizo el proceso de compra por cheque")
    public void realizoElProcesoDeCompraPorCheque() {

    }

    @Then("valido que la compra este realizada")
    public void validoQueLaCompraEsteRealizada() {

    }


}
