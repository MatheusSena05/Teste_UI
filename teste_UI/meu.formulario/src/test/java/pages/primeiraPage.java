package pages;

import org.openqa.selenium.By;

import metodo.MetodosJava;

public class primeiraPage {

	By nome = By.id("nome");
	By sobrenome = By.id("sobrenome");
	By dataNascimento = By.id("dataNascimento");
	By whatsApp = By.id("whatsApp");
	By buttonCadastrar = By.xpath("//button[text()='Cadastrar']");
	
	MetodosJava metodo = new MetodosJava();

	public void cadastrar(String nome, String sobrenome, String dataNascimento, String whatsApp, String textoParaValidar) {

		MetodosJava.preencher(this.nome, nome);
		
		MetodosJava.preencher(this.sobrenome, sobrenome);
		
		MetodosJava.preencher(this.dataNascimento, dataNascimento);
		
		MetodosJava.preencher(this.whatsApp, whatsApp);
		
		MetodosJava.clicar(this.buttonCadastrar);
		
		MetodosJava.validarMensagem(textoParaValidar);
		
		
		
	}

}
