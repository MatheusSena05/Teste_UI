package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import runner.primeiroRunner;

public class primeiroStep {

	@Before
	public void antesDoTeste() {
		primeiroRunner.abrirNavegador();
	}

	@After
	public void depoisDoTeste() {
		primeiroRunner.fecharNavegador();
	}

	@Test
	public void abrirNavegador1() {
		System.out.println("OK, teste 1 realizado com sucesso");

	}
	
	@Test
	public void abrirNavegador2() {
		System.out.println("OK, teste 2 realizado com sucesso");
		
	}

	@Test
	public void abrirNavegador3() {
		System.out.println("OK, teste 3 realizado com sucesso");
	}
	@Test
	public void abrirNavegador4() {
		System.out.println("OK, teste 4 realizado com sucesso");

	}

}
