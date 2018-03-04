package com.choucair.formacion.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class PortalBancolombiaPage extends PageObject {

	// Productos y Servicios del Menu Principal
	@FindBy(xpath = "//*[@id=\"main-menu\"]/div[2]/ul[1]/li[3]/a")
	public WebElementFacade opcProductsService;

	@FindBy(xpath = "//*[@id=\"productosPersonas\"]/div/div[1]/div/div/div[7]/div/a")
	public WebElementFacade opcTarjetasCredito;

	public void menuProductsService() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		opcProductsService.click();
		opcTarjetasCredito.click();

	}

	


}
