package br.com.indra.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {

	/*********************************************************************/
	private static WebDriver driver;

	private static DSL dsl = null;

	/*********************************************************************/
	/************************** Construtor *******************************/

	public DriverFactory() {
		driver = getDriver();
	}

	/*********************************************************************/
	/***************************** Metodo ********************************/
	public DSL getDSL() {
		if (dsl == null) {
			dsl = new DSL();
		}
		return dsl;
	}

	/*********************************************************************/
	/****************************** Browse ******************************/
	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.ie.driver", "SeleniumDriver/IEDriverServer.exe");

			driver = new InternetExplorerDriver();

			// Maximiza a tela
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	/*********************************************************************/
}
