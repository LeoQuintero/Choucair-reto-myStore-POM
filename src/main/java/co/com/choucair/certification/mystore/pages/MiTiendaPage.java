package co.com.choucair.certification.mystore.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class MiTiendaPage extends PageObject {

    // label nombre usuario
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]")
    public WebElement labelNombreUsuario;

    // navegador woman
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement navWoman;

    // item t-shirt
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")
    public WebElement nombreItemTshirts;

    // boton add to car
    @FindBy(xpath = "//*[@id='add_to_cart']/button/span")
    public WebElement botonAddToCar;

    //boton chekout
    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
    public WebElement botonCheckout;

/*     boton add to car para el actions
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    public WebElement botonAddToCarTshirt;*/

/*     boton proceed to checkout para el actions
    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    public WebElement botonProceedToCheckout;*/


    public void validarSesionUsuario() {
        String nombreLabel = "Leonardo Quintero";
        String textoLabel = labelNombreUsuario.getText();
        assertThat(nombreLabel, containsString(textoLabel));
    }

    public void ingresarASeccionWoman() {
        navWoman.click();
    }

    public void agregarAlCarrito() {
//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(itemTshirt);
//        botonAddToCarTshirt.click();
//        botonProceedToCheckout.click();
        nombreItemTshirts.click();
        botonAddToCar.click();
        botonCheckout.click();
    }
}

