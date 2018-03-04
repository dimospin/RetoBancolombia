package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ProductosServiciosSteps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductosServiciosDefinition {
	
	@Steps
	ProductosServiciosSteps productosServiciosSteps;
	
	@Given("^Que me encuentro en el sitio web de Productos y Servicios Bancolombia$")
	public void que_me_encuentro_en_el_sitio_web_de_Productos_y_Servicios_Bancolombia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		productosServiciosSteps.ingresar_PortalBancolombia();
	}

	@Given("^Capturo información de TC$")
	public void capturo_información_de_TC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		productosServiciosSteps.capturar_InfoTC();
	}

	@When("^Diligencio el formulario de Datos Basicos de Solicitud Tarjeta Credito$")
	public void diligencio_el_formulario_de_Datos_Basicos_de_Solicitud_Tarjeta_Credito() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		productosServiciosSteps.diligenciar_Formulario();
	}

	@Then("^Verifico diligenciamiento exitoso del formulario$")
	public void verifico_diligenciamiento_exitoso_del_formulario() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		productosServiciosSteps.verificar_Diligenciamiento();
	}


	
	
	
	
	
	
	
	
//	
//	@Given("^Autentico en sucursal virtual negocios con tipo de identificacion \"([^\"]*)\" y Número de Identificación \"([^\"]*)\"$")
//	public void autentico_en_sucursal_virtual_negocios_con_tipo_de_identificacion_y_Número_de_Identificación(String tipoUsr, String identificacion) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		consultasValidationSteps.login_edpyme(tipoUsr, identificacion);
//	}
//
//	@Given("^Ingreso a la funcionalidad de validacion de codigo de seguridad \"([^\"]*)\"$")
//	public void ingreso_a_la_funcionalidad_de_validacion_de_codigo_de_seguridad(String seguridad) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		consultasValidationSteps.security_edpyme(seguridad);
//	}
//
//	@When("^Ingreso a la opcion del menu principal consultas$")
//	public void ingreso_a_la_opcion_del_menu_principal_consultas() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    consultasValidationSteps.consultas_edpyme();
//	}
//
//	@Then("^Verifico el saldo de la cuenta seleccionada con el Backend de manera exitosa$")
//	public void verifico_el_saldo_de_la_cuenta_seleccionada_con_el_Backend_de_manera_exitosa() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}





}
