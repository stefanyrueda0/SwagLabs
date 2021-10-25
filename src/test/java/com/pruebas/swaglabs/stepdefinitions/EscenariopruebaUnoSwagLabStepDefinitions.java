package com.pruebas.swaglabs.stepdefinitions;

import com.pruebas.swaglabs.task.IncioSesion;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;


import static com.pruebas.swaglabs.ui.Navegacion.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.mockito.ArgumentMatchers.contains;


public class EscenariopruebaUnoSwagLabStepDefinitions {


    @Before
    public void actor(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) inicia sesión con usuario (.*) y contraseña (.*) .$")
    public void queSaloméIniciaSesiónConUsuarioStandard_userYContraseñaSecret_sauce(String actor, String user, String contrasena) {
        OnStage.theActorCalled(actor).attemptsTo(


                IncioSesion.login(user, contrasena)
);


    }

    @Cuando("^ella agrega un producto al carrito$")
    public void ellaAgregaUnProductoAlCarrito() {


        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(AGREGAR_PRODUCTO)
        );
    }

    @Entonces("^el producto debe estar agregado al carrito$")
    public void elProductoDebeEstarAgregadoAlCarrito() {

        OnStage.theActorInTheSpotlight().should(
                seeThat(the(AGREGAR_PRODUCTO), isNotCurrentlyEnabled())
        );
    }

}
