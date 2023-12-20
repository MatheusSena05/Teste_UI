package metodo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.primeiroDriver;

public class MetodosJava extends primeiroDriver {

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturadoString = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturadoString);

	}

}
