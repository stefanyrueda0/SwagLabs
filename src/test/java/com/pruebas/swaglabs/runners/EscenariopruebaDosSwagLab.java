package com.pruebas.swaglabs.runners;


import com.pruebas.swaglabs.task.ExploraMenu;
import com.pruebas.swaglabs.utils.OpcionesMenu;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.runner.RunWith;

import static com.pruebas.swaglabs.task.ExploraMenu.opcion;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/escenario_prueba_dos_swaglabs.feature",
        glue="com.pruebas.swaglabs.stepdefinitions",
        snippets= SnippetType.CAMELCASE
)

public class EscenariopruebaDosSwagLab {


}
