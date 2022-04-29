package co.com.choucair.certification.mystore.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;


public class MiOrdenCompra extends PageObject {
    // boton 2 de checkout
    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span")
    public WebElement botonCheckoutSummay;

    @FindBy(css = "button[name='processAddress']")
    public WebElement botonCheckoutAddress;

    @FindBy(className = "checker")
    public WebElement checkBoxIgree;

    @FindBy(css = "button[name='processCarrier']")
    public WebElement botonCheckoutShipping;

    @FindBy(className = "cheque")
    public WebElement linkPagoPorCheque;

    @FindBy(xpath = "//*[@id='cart_navigation']/button/span")
    public WebElement botonConfirmMyOrder;

    public void pagarProducto() {
        botonCheckoutSummay.click();
        botonCheckoutAddress.click();
        checkBoxIgree.click();
        botonCheckoutShipping.click();
        linkPagoPorCheque.click();
        botonConfirmMyOrder.click();
    }
}
