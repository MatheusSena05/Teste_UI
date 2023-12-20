package metodo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import drivers.primeiroDriver;

public class MetodosJava extends primeiroDriver {

	public static void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public static void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public static void validarTexto(By elemento, String textoEsperado) {
		String textoCapturadoString = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturadoString);

	}
	
	
	public static void validarMensagem(String textoEsperado) {
		String mensagemAlert = driver.switchTo().alert().getText();
		assertTrue(mensagemAlert.contains(textoEsperado));
	}

}
