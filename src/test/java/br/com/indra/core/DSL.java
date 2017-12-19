package br.com.indra.core;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL extends DriverFactory {

	/*********************************************************************/
	private JavascriptExecutor js = (JavascriptExecutor) getDriver();
	private WebDriverWait wait = new WebDriverWait(getDriver(), 40);

	/*********************************************************************/
	/*********************** JAVA SCRIPT *********************************/
	// Escrever em JavaScrip - Elemento de Procura ID
	public void escreverJsId(String id_campo, String texto) {
		js.executeScript("document.getElementById('" + id_campo + "').setAttribute('value', '" + texto + "')");
	}

	// Escrever em Jquarry - Elemento de Procura NAME
	public void escreverJqName(String name_campo, String texto) {
		js.executeScript("$('" + name_campo + "').val('" + texto + "')");

	}

	// Clicar com JavaScript - Elemento de Procura ID
	public void clicarJsId(String id_campo) {
		js.executeScript("document.getElementById('" + id_campo + "').click()");
	}

	// Scroll
	public void rolarPagina(float coordenadaY) {
		js.executeScript("window.scrollBy(0, " + coordenadaY + ")", "");
	}

	/*********************************************************************/
	/*********************** JAVA SCRIPT *********************************/
	// Carregar uma pagina
	public void carregarPagina(String url_page) {
		getDriver().get(url_page);
	}

	/*********************************************************************/
	/************************** ESPERAS **********************************/
	// Esperar ate o Texto ser Localizado - Elemento de Procura NAME
	public Boolean esperarTextoName(String name_campo, String texto_esperado) {
		return wait.until(ExpectedConditions.textToBePresentInElementLocated(By.name(name_campo), texto_esperado));
	}

	// Esperar ate o Texto ser Localizado - Elemento de Procura ID
	public Boolean esperarTextoId(String id_campo, String texto_esperado) {
		return wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(id_campo), texto_esperado));
	}

	// Esperar ate um Texto ser Localizado - Elemento de Procura XPATH
	public Boolean esperarTextoXpath(String id_campo, String texto_esperado) {
		return wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(id_campo), texto_esperado));
	}

	// Esperar ate um Valor ser Localizado - Elemento de Procura NAME
	public Boolean esperarValorName(String name_campo, String texto_esperado) {
		return wait.until(ExpectedConditions.textToBePresentInElementValue(By.name(name_campo), texto_esperado));
	}

	// Esperar ate um Valor ser Localizado - Elemento de Procura ID
	public Boolean esperarValorId(String id_campo, String texto_esperado) {
		return wait.until(ExpectedConditions.textToBePresentInElementValue(By.id(id_campo), texto_esperado));
	}

	// Esperar ate um Valor ser Localizado - Elemento de Procura XPATH
	public Boolean esperarValorXpath(String id_campo, String texto_esperado) {
		return wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(id_campo), texto_esperado));
	}

	// Espera FIXA
	public void tempoEsperaFixa(long tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	/*********************************************************************/
	/************************* CLICAR POR ********************************/

	// Clicar - Elemento de Procura NAME
	public void clicarName(String name_campo) {
		WebElement clicarName = getDriver().findElement(By.name(name_campo));
		clicarName.click();
	}

	// Clicar - Elemento de Procura ID
	public void clicarId(String id_campo) {
		WebElement clicarId = getDriver().findElement(By.id(id_campo));
		clicarId.click();
	}

	// Clicar - Elemento de Procura XPATH
	public void clicarXpath(String id_campo) {
		WebElement clicarId = getDriver().findElement(By.xpath(id_campo));
		clicarId.click();
	}

	/*********************************************************************/
	/*********************** SELECIONAR POR ******************************/
	// Selecionar/Capturar campo - Elemento de Procura NAME
	public WebElement capturarCampoName(String name_campo) {
		return getDriver().findElement(By.name(name_campo));
	}

	// Selecionar/Capturar campo - Elemento de Procura ID
	public WebElement capturarCampoId(String id_campo) {
		return getDriver().findElement(By.id(id_campo));
	}

	// Selecionar/Capturar campo - Elemento de Procura XPATH
	public WebElement capturarCampoXpath(String id_campo) {
		return getDriver().findElement(By.xpath(id_campo));
	}

	/*********************************************************************/
	/*********************** SELECIONAR LINK *****************************/
	// Selecionar Link
	public void clicarlink(String texto) {
		getDriver().findElement(By.linkText(texto)).click();
	}

	/*********************************************************************/
	/********************** SELECIONAR COMBO *****************************/
	// Selecionar um combo por Valor - Elemento de Procura Name
	public void selecionarComboValorName(String name_campo, String texto_selecao) {
		WebElement selecionarComboName = getDriver().findElement(By.name(name_campo));
		// Selecionar o campo FORMA DE PAGAMENTO
		Select select = new Select(selecionarComboName);
		// Selecionar uma opção
		select.selectByValue(texto_selecao);
	}

	// Selecionar um combo por Valor - Elemento de Procura ID
	public void selecionarComboValorId(String id_campo, String texto_selecao) {
		WebElement selecionarComboId = getDriver().findElement(By.id(id_campo));
		// Selecionar o campo FORMA DE PAGAMENTO
		Select select = new Select(selecionarComboId);
		// Selecionar uma opção
		select.selectByValue(texto_selecao);
	}

	// Selecionar um combo por Valor - Elemento de Procura XPATH
	public void selecionarComboValorXpath(String id_campo, String texto_selecao) {
		WebElement selecionarComboId = getDriver().findElement(By.xpath(id_campo));
		// Selecionar o campo FORMA DE PAGAMENTO
		Select select = new Select(selecionarComboId);
		// Selecionar uma opção
		select.selectByValue(texto_selecao);
	}

	// Selecionar um combo por Texto - Elemento de Procura NAME
	public void selecionarComboTextoName(String id_campo, String texto_selecao) {
		WebElement selecionarComboId = getDriver().findElement(By.name(id_campo));
		// Selecionar o campo FORMA DE PAGAMENTO
		Select select = new Select(selecionarComboId);
		// Selecionar uma opção
		select.selectByVisibleText(texto_selecao);
	}

	// Selecionar um combo por Texto - Elemento de Procura ID
	public void selecionarComboTextoId(String id_campo, String texto_selecao) {
		WebElement selecionarComboId = getDriver().findElement(By.id(id_campo));
		// Selecionar o campo FORMA DE PAGAMENTO
		Select select = new Select(selecionarComboId);
		// Selecionar uma opção
		select.selectByVisibleText(texto_selecao);
	}

	// Selecionar um combo por Texto - Elemento de Procura XPATH
	public void selecionarComboTextoXpath(String id_campo, String texto_selecao) {
		WebElement selecionarComboId = getDriver().findElement(By.xpath(id_campo));
		// Selecionar o campo FORMA DE PAGAMENTO
		Select select = new Select(selecionarComboId);
		// Selecionar uma opção
		select.selectByVisibleText(texto_selecao);
	}

	/*********************************************************************/
	public void printarTela(String pasta, String nomeArquivo) throws IOException, AWTException {
		Robot robot = new Robot();
		BufferedImage printTela = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(printTela, "jpeg", new File("ScreenShot" + "/" + pasta + "/" + nomeArquivo + ".jpeg"));
	}
}
