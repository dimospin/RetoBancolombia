package com.choucair.formacion.pageobjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.choucair.generic.ExcelConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TarjetaCreditoPage extends PageObject{
	
	// Se inicializa la lectura del archivo .xlsx
	String path = "C:\\Users\\DianaMarcela\\Documents\\RetoBancolombia.xlsx";
	ExcelConfig excel = new ExcelConfig(path);

	// Se realiza reconocimiento de los objetos de la pagina
	
	@FindBy(xpath = "//*[@id=\"card_0\"]/div[2]/h2")
	//*[@id="card_0"]/div[2]/h2
	public WebElementFacade titleAmex;
	
	@FindBy(xpath = "//*[@id=\"card_0\"]/div[3]/ul/li[1]")
	public WebElementFacade texto1;
	
	@FindBy(xpath = "//*[@id=\"card_0\"]/div[3]/ul/li[2]")
	public WebElementFacade texto2;
	
	@FindBy(xpath = "//*[@id=\"card_0\"]/div[3]/ul/li[3]")
	public WebElementFacade texto3;
	
	@FindBy(xpath = "//*[@id=\"card_1\"]/div[2]/h2")
	public WebElementFacade titleMC;
		
	@FindBy(xpath = "//*[@id=\"card_1\"]/div[3]/ul/li[1]")
	public WebElementFacade texto4;
	
	@FindBy(xpath = "//*[@id=\"card_1\"]/div[3]/ul/li[2]")
	public WebElementFacade texto5;
	
	@FindBy(xpath = "//*[@id=\"card_1\"]/div[3]/ul/li[3]")
	public WebElementFacade texto6;
	
	@FindBy(xpath = "//*[@id=\"card_0\"]/div[4]/a")
	public WebElementFacade btn;
	
	
	public void setDataExcel() throws IOException, InterruptedException {
		
		// Llevamos los dato al archivo .xlsx
		excel.setData(1, 0, 0, titleAmex.getText(), path);
		excel.setData(1, 1, 1, texto1.getText(), path);
		excel.setData(1, 2, 1, texto2.getText(), path);
		excel.setData(1, 3, 1, texto3.getText(), path);
		excel.setData(1, 4, 0, titleMC.getText(), path);
		excel.setData(1, 5, 1, texto4.getText(), path);
		excel.setData(1, 6, 1, texto5.getText(), path);
		excel.setData(1, 7, 1, texto6.getText(), path);
	}
	
		
	public void btn_clic() {
		
		btn.click();
	}
	
	
		
	
	
	

}
