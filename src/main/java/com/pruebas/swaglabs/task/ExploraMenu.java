package com.pruebas.swaglabs.task;

import com.pruebas.swaglabs.utils.OpcionesMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.swaglabs.ui.Navegacion.MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ExploraMenu implements Task {

    private OpcionesMenu menu;

    public ExploraMenu(OpcionesMenu menu){
    this.menu=menu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU),
                WaitUntil.the(menu.getMenu(), isVisible()),
                Click.on(menu.getMenu())
        );
    }
public static ExploraMenu opcion(OpcionesMenu menu){
        return instrumented (ExploraMenu.class, menu);

}

}
