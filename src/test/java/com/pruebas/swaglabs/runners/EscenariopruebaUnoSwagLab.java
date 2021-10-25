package com.pruebas.swaglabs.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/escenario_prueba_uno_swaglabs.feature",
        glue="com.pruebas.swaglabs.stepdefinitions",
        snippets= SnippetType.CAMELCASE
)

public class EscenariopruebaUnoSwagLab {


}
