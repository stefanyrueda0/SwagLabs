package com.pruebas.swaglabs.stepdefinitions;

import com.pruebas.swaglabs.task.ExploraMenu;
import com.pruebas.swaglabs.utils.OpcionesMenu;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.swaglabs.ui.Navegacion.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EscenariopruebaDosSwagLabsStepDefinitions {

    @Cuando("^(.*) desde la pagina principal$")
    public void cierreSesiónDesdeLaPaginaPrincipal(OpcionesMenu menu) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ExploraMenu.opcion(menu)
        );
    }


    @Entonces("^Salomé debería ver la pagina de login$")
    public void saloméDeberíaVerLaPaginaDeLogin() {

        OnStage.theActorInTheSpotlight().should(
                seeThat(the(CAMPO_USUARIO), isEnabled())
        );
    }
}
