package agenda;

import main.Utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgendaTest {

	Agenda agenda;

	/**
	 * Testa se a agenda está sendo instanciada normalmente.
	 */
	@Test
	public void testAgenda() {
		agenda = new Agenda(101);

		assertEquals("Problema na capacidade da agenda.",
				agenda.getCapacidade(), 101);
	}

	/**
	 * Testa se a agenda está bem encapsulada (não permitir o contato ser
	 * alterado por fora).
	 */
	@Test
	public void testCadastrarContatoEObterContato() {
		agenda = new Agenda(100);
		Contato contato = new Contato("Ícaro", "Dantas", "(83) 9.9384-7651");

		agenda.cadastrarContato(contato, 7);

		Contato contatoObtido = agenda.obterContato(7);

		assertEquals("O clone não ficou com o mesmo nome.", contato.getNome(),
				contatoObtido.getNome());
		assertEquals("O clone não ficou com o mesmo sobrenome.",
				contato.getSobrenome(), contatoObtido.getSobrenome());
		assertEquals("O clone não ficou com o mesmo telefone.",
				contato.getTelefone(), contatoObtido.getTelefone());
	}

	/**
	 * Testa se está validando posições corretamente.
	 */
	@Test
	public void testValidarPosicao() {
		agenda = new Agenda(100);

		assertEquals(
				"Validou a posição incorretamente. Posição dentro do escopo, mas sem contato.",
				agenda.validarPosicao(1), false);
		assertEquals(
				"Validou a posição incorretamente. Posição dentro do escopo mas sem contato.",
				agenda.validarPosicao(100), false);
		assertEquals("Validou a posição incorretamente.",
				agenda.validarPosicao(0), false);

		Contato contato = new Contato("Ícaro", "Dantas", "(83) 9.9384-7651");

		agenda.cadastrarContato(contato, 3);

		assertEquals(
				"Validou a posição incorretamente. Posição dentro do escopo e sem contato.",
				agenda.validarPosicao(1), false);
		assertEquals(
				"Validou a posição incorretamente. Posição dentro do escopo sem contato",
				agenda.validarPosicao(100), false);
		assertEquals(
				"Validou a posição incorretamente. Posição fora do escopo.",
				agenda.validarPosicao(0), false);
		assertEquals(
				"Validou a posição incorretamente. Posição dentro do escopo e com contato.",
				agenda.validarPosicao(3), true);
	}

	/**
	 * Testa se a capacidade está correta.
	 */
	@Test
	public void testGetCapacidade() {
		agenda = new Agenda(850);

		assertEquals("Agenda com problema no getCapacidade.",
				agenda.getCapacidade(), 850);
	}

	/**
	 * Testa o método toString.
	 */
	@Test
	public void testToString() {
		agenda = new Agenda(100);

		Contato contatoIcaro = new Contato("Ícaro", "Dantas",
				"(83) 9.9384-7651");
		Contato contatoIzaac = new Contato("Izaac", "Amâncio",
				"(83) 9.9113-4899");

		agenda.cadastrarContato(contatoIcaro, 3);
		agenda.cadastrarContato(contatoIzaac, 100);

		assertEquals("toString da agenda com problemas.", agenda.toString(),
				"3 - Ícaro Dantas" + Utilidades.FIM_DE_LINHA
						+ "100 - Izaac Amâncio" + Utilidades.FIM_DE_LINHA);
	}

}
