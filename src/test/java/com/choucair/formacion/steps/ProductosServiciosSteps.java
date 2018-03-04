package com.choucair.formacion.steps;

import java.io.IOException;


import com.choucair.formacion.pageobjects.PortalBancolombiaPage;

import com.choucair.formacion.pageobjects.SolicitudTCPage;
import com.choucair.formacion.pageobjects.TarjetaCreditoPage;

import net.thucydides.core.annotations.Step;

public class ProductosServiciosSteps {
	
	PortalBancolombiaPage portalBancolombiaPage;
	TarjetaCreditoPage tarjetaCreditoPage;
	SolicitudTCPage solicitudTCPage;
	
	@Step
	
	public void ingresar_PortalBancolombia() throws IOException, InterruptedException {
		
		portalBancolombiaPage.open();
		portalBancolombiaPage.menuProductsService();
		
	}
	
	@Step
	
	public void capturar_InfoTC() throws IOException, InterruptedException {
		
		tarjetaCreditoPage.setDataExcel();
	}

	
	@Step
	
	public void diligenciar_Formulario() throws InterruptedException {
		tarjetaCreditoPage.btn_clic();
		solicitudTCPage.reconocimiento();
		solicitudTCPage.llenar_Formulario();
	}
	
	@Step
	
	public void verificar_Diligenciamiento() {
		solicitudTCPage.verificar();
	}
	
}
