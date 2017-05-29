package agenda;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContatoTest {

	Contato contato;
	
	@Before
	public void initializeContato() {
		contato = new Contato("Ícaro", "Dantas", "(83) 9.91134899");
	}
	
	@Test
	public void testContatoStringStringString() {		
		assert(contato.getNome().equals("Ícaro"));
		assert(contato.getSobrenome().equals("Dantas"));
		assert(contato.getTelefone().equals("(83) 9.91134899"));
	}

	@Test
	public void testContatoContato() {
		Contato clone = new Contato(contato);
		
		assert(clone != contato);
		assert(clone.getNome().equals(contato.getNome()));
		assert(clone.getSobrenome().equals(contato.getSobrenome()));
		assert(clone.getTelefone().equals(contato.getTelefone()));
	}

	@Test
	public void testToString() {
		assert(contato.toString().equals("Ícaro Dantas (83) 9.91134899"));
	}

	@Test
	public void testToStringString() {
		assert(contato.toString("%s %s - %s").equals("Ícaro Dantas - (83) 9.91134899"));
		assert(contato.toString("%s ... %s").equals("Ícaro ... Dantas"));
		assert(contato.toString("???%s???").equals("???Ícaro???"));
	}

}
