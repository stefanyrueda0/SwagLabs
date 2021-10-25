package com.pruebas.swaglabs.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.pruebas.swaglabs.ui.Navegacion.CAMPO_CONTRSENA;
import static com.pruebas.swaglabs.ui.Navegacion.CAMPO_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class IncioSesion implements Task {

    private String user;
    private String contrasena;

    public IncioSesion(String user, String contrasena) {
    this.user=user;
    this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(

             Open.url("https://www.saucedemo.com/"),
             WaitUntil.the(CAMPO_USUARIO,isVisible()),
             Enter.theValue(user).into(CAMPO_USUARIO),
             Enter.theValue(contrasena).into(CAMPO_CONTRSENA).thenHit(Keys.ENTER)
     );
    }
    public static IncioSesion login(String user, String contrasena){
        return instrumented(IncioSesion.class, user, contrasena);
    }
}
