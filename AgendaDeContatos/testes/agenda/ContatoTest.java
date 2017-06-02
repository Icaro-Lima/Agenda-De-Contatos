package agenda;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContatoTest {

	Contato contato;

	/**
	 * Testa se está instanciando a classe contato corretamente.
	 */
	@Test
	public void testContatoStringStringString() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");

		assertEquals("Criou o nome errado.", contato.getNome(), "Ícaro");
		assertEquals("Criou o sobrenome errado.", contato.getSobrenome(),
				"Dantas");
		assertEquals("Criou o telefone errado.", contato.getTelefone(),
				"(83) 9.91134899");
	}

	/**
	 * Testa se está clonando corretamente (ponteiros diferentes e atributos
	 * iguais).
	 */
	@Test
	public void testContatoContato() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");

		Contato clone = new Contato(contato);

		assertNotEquals("O ponteiro do clone é o mesmo do original.", clone,
				contato);
		assertEquals("O nome do clone é diferente do nome original.",
				clone.getNome(), contato.getNome());
		assertEquals("O sobrenome do clone é diferente do nome original.",
				clone.getSobrenome(), contato.getSobrenome());
		assertEquals("O telefone do clone é diferente do nome original.",
				clone.getTelefone(), contato.getTelefone());
	}

	/**
	 * Testa o toString sem parâmetros.
	 */
	@Test
	public void testToString() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");

		assertEquals("toString do contato com problemas.", contato.toString(),
				"Ícaro Dantas (83) 9.91134899");
	}

	/**
	 * Testa o toString com parâmetro string.
	 */
	@Test
	public void testToStringString() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");

		assertEquals("Problema no toString argumentado do contato.",
				contato.toString("%s %s - %s"),
				"Ícaro Dantas - (83) 9.91134899");
		assertEquals("Problema no toString argumentado do contato.",
				contato.toString("%s ... %s"), "Ícaro ... Dantas");
		assertEquals("Problema no toString argumentado do contato.",
				contato.toString("???%s???"), "???Ícaro???");
	}

	/**
	 * Testa se está dando NullPointerException pro caso de um dos argumentos
	 * ser null.
	 */
	@Test(expected = NullPointerException.class)
	public void testContatoStringStringStringNull() {
		contato = new Contato(null, "Dantas", "(83) 9.91134899");
	}

	/**
	 * Testa se está dando IllegalArgumentException pro caso de passar uma
	 * string vazia.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testContatoStringStringStringNullString() {
		contato = new Contato("Ícaro", "", "(83) 9.91134899");
	}

	/**
	 * Testa se está dando IllegalArgumentException pro caso de passar uma
	 * string apenas com espaços.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testContatoStringStringStringNullStringWithSpaces() {
		contato = new Contato("Ícaro", "                       ",
				"(83) 9.91134899");
	}

}
