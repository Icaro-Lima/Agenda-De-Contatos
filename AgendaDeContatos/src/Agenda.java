/**
 * Representação de uma agenda de contatos. A agenda tem um array de contatos
 * que podem ser cadastrados, listados, exibidos, etc.
 *
 * @author Ícaro Dantas
 */
public class Agenda {

	private Contato[] contatos = new Contato[100];
	
	/**
	 * Cadastra um contato em uma determinada posição na agenda.
	 * 
	 * @param contato
	 *            Um Contato para adicionar na agenda.
	 * @param posicao
	 *            A posição em que o contato deve ser inserido (1 - 100).
	 */
	public void cadastrarContato(Contato contato, int posicao) {
		contatos[posicao - 1] = contato;
	}

	/**
	 * Retorna um contato em uma determinada posição da agenda.
	 * 
	 * @param posicao
	 *            A posição em que o contato se encontra (1 - 100).
	 */
	public Contato obterContato(int posicao) {
		return new Contato(contatos[posicao - 1]);
	}

	/**
	 * Retorna uma lista de contatos não nulos. Seguindo o formato: "POS - NOME SOBRENOME"
	 * 
	 * @param posicao
	 *            A posição em que o contato se encontra (1 - 100).
	 */
	@Override
	public String toString() {
		String listagem = "";

		for (int i = 0; i < 100; i++) {
			if (contatos[i] != null) {
				listagem += contatos[i].toString("%s%s") + Utilidades.endl;
			}
		}

		return listagem;
	}

}
