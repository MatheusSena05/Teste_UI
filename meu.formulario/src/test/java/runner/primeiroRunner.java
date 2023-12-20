package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import drivers.primeiroDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class primeiroRunner extends primeiroDriver {

	public static void abrirNavegador() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sena%20Rocha/HTML/MeuSite/formulario.html");

	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
