package com.pruebas.swaglabs.utils;

import com.pruebas.swaglabs.ui.Navegacion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public enum OpcionesMenu {

    ALLITEMS(Navegacion.ALLITEMS),
    ABOUT(Navegacion.ABOUT),
    LOGOUT(Navegacion.LOGOUT)
    ;

    private Target menu;

    OpcionesMenu(Target menu){
        this.menu=menu;
    }

    public Target getMenu() {
        return menu;
    }
}
