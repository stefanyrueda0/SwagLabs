#language: es
  #Author: Stefany Rueda

  Característica: Prueba cerrar sesion desde pagina principal

    Escenario: Cierre de sesión

      Dado que Salomé inicia sesión con usuario standard_user y contraseña secret_sauce .
      Cuando LOGOUT desde la pagina principal
      Entonces Salomé debería ver la pagina de login
