package agenda;

import static org.junit.Assert.*;

import org.junit.Test;

import agendaDeContatos.Utilidades;

public class AgendaTest {

	Agenda agenda;

	@Test
	public void testAgenda() {
		agenda = new Agenda(101);

		assert agenda.getCapacidade() == 101;
	}

	@Test
	public void testCadastrarContatoEObterContato() {
		agenda = new Agenda(100);
		Contato contato = new Contato("Ícaro", "Dantas", "(83) 9.9384-7651");

		agenda.cadastrarContato(contato, 7);

		Contato contatoObtido = agenda.obterContato(7);

		assert contato.getNome().equals(contatoObtido.getNome());
		assert contato.getSobrenome().equals(contatoObtido.getSobrenome());
		assert contato.getTelefone().equals(contatoObtido.getTelefone());
	}

	@Test
	public void testValidarPosicao0() {
		agenda = new Agenda(100);

		assert agenda.validarPosicao(1) == false;
		assert agenda.validarPosicao(100) == false;
		assert agenda.validarPosicao(0) == false;

		Contato contato = new Contato("Ícaro", "Dantas", "(83) 9.9384-7651");

		agenda.cadastrarContato(contato, 3);

		assert agenda.validarPosicao(1) == false;
		assert agenda.validarPosicao(100) == false;
		assert agenda.validarPosicao(0) == false;
		assert agenda.validarPosicao(3);
	}

	@Test
	public void testGetCapacidade() {
		agenda = new Agenda(850);

		assert agenda.getCapacidade() == 850;
	}

	@Test
	public void testToString() {
		agenda = new Agenda(100);

		Contato contatoIcaro = new Contato("Ícaro", "Dantas", "(83) 9.9384-7651");
		Contato contatoIzaac = new Contato("Izaac", "Amâncio", "(83) 9.9113-4899");

		agenda.cadastrarContato(contatoIcaro, 3);
		agenda.cadastrarContato(contatoIzaac, 100);

		assert agenda.toString()
				.equals("3 - Ícaro Dantas" + Utilidades.FIM_DE_LINHA + "100 - Izaac Amâncio" + Utilidades.FIM_DE_LINHA);
	}

}
