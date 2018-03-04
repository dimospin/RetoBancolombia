package com.choucair.formacion.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.choucair.generic.ExcelConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SolicitudTCPage extends PageObject{
	
	// Se inicializa la lectura del archivo .xlsx
	String path = "C:\\Users\\DianaMarcela\\Documents\\RetoBancolombia.xlsx";
	ExcelConfig excel = new ExcelConfig(path);
	int row = (excel.getRowCount(0) - 1);
	
	// Se realiza reconocimiento de los objetos del formulario
	@FindBy(id = "nombresReq")
	public WebElementFacade txtNombre;
	
	@FindBy(id = "apellidosReq")
	public WebElementFacade txtApellido;
	
	@FindBy(id = "typedocreq")
	public WebElementFacade cbxTipoDocumento;
	
	@FindBy(id = "numeroDocumento")
	public WebElementFacade txtDocumento;
	
	@FindBy(id = "fechaNacimientoReq")
	public WebElementFacade txtFecha;
	
	@FindBy(id = "ingresos-mensuales")
	public WebElementFacade txtIngresos;
	
	@FindBy(id = "reqCiuidadDpto_value")
	public WebElementFacade txtCiudad;
	
	@FindBy(xpath = "//*[@id=\"conIframe_rm\"]/div/form/div[7]/div[2]/button")
	public WebElementFacade btnContinuar;
	
	@FindBy(xpath ="//*[@id=\"conIframe_ip\"]/div/form/div[2]/div[1]/label")
	public WebElementFacade txtGenero;
	
	
	public void llenar_Formulario() throws InterruptedException {
		
		//Tomo los datos del archivo .xlsx
		
		String nombre = excel.getData(0, 1, 1);
		String apellido = excel.getData(0, 2, 1);
		String tipodoc = excel.getData(0, 3, 1);
		String nrodoc = excel.getData(0, 4, 1);
		String fecha = excel.getData(0, 5, 1);
		String ingresos = excel.getData(0,6,1);
		String ciudad = excel.getData(0, 7, 1);
		
		// Lleno formulario
		
		txtNombre.sendKeys(nombre);
		txtApellido.sendKeys(apellido);
		cbxTipoDocumento.click();
		cbxTipoDocumento.selectByVisibleText(tipodoc);
		txtDocumento.sendKeys(nrodoc);
		txtFecha.sendKeys(fecha);
		txtIngresos.sendKeys(ingresos);
		txtCiudad.sendKeys(ciudad);
		Thread.sleep(1000);
		txtCiudad.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		txtCiudad.sendKeys(Keys.ENTER);
		btnContinuar.click();
		Thread.sleep(5000);
		
	}
		
	public Boolean verificar() {
		
		return txtGenero.isVisible();
	}
	
	public void reconocimiento() throws InterruptedException
	{
		Thread.sleep(5000);
		
		getDriver().switchTo().frame("Demos");
		
	}

}
