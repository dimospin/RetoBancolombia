package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
@CucumberOptions (features = "src/test/resources/features/ProductosServicios.feature", tags = "@CasoExitoso")
//@CucumberOptions (features = "src/test/resources/features/PopupValidation.feature", tags = "@Caso")
public class RunnerTags {

}
