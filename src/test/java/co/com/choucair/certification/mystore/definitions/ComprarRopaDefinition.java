package co.com.choucair.certification.mystore.definitions;

import co.com.choucair.certification.mystore.steps.AbrirPaginaStep;
import co.com.choucair.certification.mystore.steps.AccionesTareasStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ComprarRopaDefinition {
    @Steps
    AbrirPaginaStep abrirPaginaStep;
    @Steps
    AccionesTareasStep accionesTareasStep;


    @Given("^que me encuentro en la pagina web My Store$")
    public void queMeEncuentroEnLaPaginaWebMyStore() {
        abrirPaginaStep.abrilUrl();

    }

    @When("^inicio sesion con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void inicioSesionConUsuarioYClave(String usuario, String clave) {
        accionesTareasStep.ClickLogin();
        accionesTareasStep.IniciarSesion(usuario, clave);

    }

    @Then("compruebo nombre usuario de inicio sesion")
    public void comprueboNombreUsuarioDeInicioSesion() {
        accionesTareasStep.validarSesionUsuario();
    }

    @When("agrego un producto al carrito de compra")
    public void agregoUnProductoAlCarritoDeCompra() {
        accionesTareasStep.agregarProductoAlCarrito();


    }

    @And("realizo el proceso de compra por cheque")
    public void realizoElProcesoDeCompraPorCheque() {
        accionesTareasStep.pagarCompra();
    }

    @Then("valido que la compra este realizada")
    public void validoQueLaCompraEsteRealizada() {
        accionesTareasStep.verificarOrdenCompraCompletada();
    }


}
