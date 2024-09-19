Feature: Realizar login en la pagina orange

  @Test1
  Scenario: Se realiza login exitoso en orange
    Given Se encuentra en la login page de orange
    When digita las credenciales de inicio
    And da click en el boton login
    And da click en el boton PIM
    And agrega nuevo usuario