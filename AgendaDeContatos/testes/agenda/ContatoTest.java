package agenda;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContatoTest {

	Contato contato;

	@Test
	public void testContatoStringStringString() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");
		
		assert (contato.getNome().equals("Ícaro"));
		assert (contato.getSobrenome().equals("Dantas"));
		assert (contato.getTelefone().equals("(83) 9.91134899"));
	}

	@Test
	public void testContatoContato() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");
		
		Contato clone = new Contato(contato);

		assert (clone != contato);
		assert (clone.getNome().equals(contato.getNome()));
		assert (clone.getSobrenome().equals(contato.getSobrenome()));
		assert (clone.getTelefone().equals(contato.getTelefone()));
	}

	@Test
	public void testToString() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");
		
		assert (contato.toString().equals("Ícaro Dantas (83) 9.91134899"));
	}

	@Test
	public void testToStringString() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");
		
		assert (contato.toString("%s %s - %s").equals("Ícaro Dantas - (83) 9.91134899"));
		assert (contato.toString("%s ... %s").equals("Ícaro ... Dantas"));
		assert (contato.toString("???%s???").equals("???Ícaro???"));
	}

	@Test(expected = NullPointerException.class)
	public void testContatoStringStringStringNull() {
		contato = new Contato(null, "Dantas", "(83) 9.91134899");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testContatoStringStringStringNullString() {
		contato = new Contato("Ícaro", "", "(83) 9.91134899");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testContatoStringStringStringNullStringWithSpaces() {
		contato = new Contato("Ícaro", "                       ", "(83) 9.91134899");
	}

}
