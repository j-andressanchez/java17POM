Feature: Realizar login en la pagina saucedemo

  @Test1
  Scenario: Se realiza login exitoso en saucedemo
    Given Se encuentra en la login page de sauce demo
    When digita las credenciales standard
    And da click en el boton login
    Then valida que el título sea "Products"