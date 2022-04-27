#Autor: Leonardo Quintero
@HistoriaDeUsuario
Feature: Proceso de compra en la tienda online
  Yo como usuario QUIERO realizar el proceso de compra de un producto de la tienda PARA adquirir un producto


  @CompraExitosa1ProductoPorCheque
  Scenario: Validar Compra exitosa 1 producto por cheque
    Given que me encuentro en la pagina web My Store
    When inicio sesion con usuario "leoquintero7@gmail.com" y clave "12345"
    Then compruebo nombre usuario de inicio sesion
    When agrego un producto al carrito de compra
    And realizo el proceso de compra por cheque
    Then valido que la compra este realizada