package pages;

import org.openqa.selenium.By;

public class primeiraPage {

	By nome = By.id("nome");
	By sobrenome = By.id("sobrenome");
	By dataNascimento = By.id("dataNascimento");
	By whatsApp = By.id("whatsApp");
	By buttonCadastrar = By.xpath("//button[text()='Cadastrar']");

	public void cadastrar(String nome, String sobrenome, String dataNascimento, String whatsApp) {

	}

}
