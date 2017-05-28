/**
 * Representação de uma agenda de contatos. A agenda tem um array de contatos
 * que podem ser cadastrados, listados, exibidos, etc.
 *
 * @author Ícaro Dantas
 */
public class Agenda {

	private Contato[] contatos;
	private int capacidade;

	/**
	 * Constrói uma agenda a partir da capacidade da mesma.
	 * 
	 * @param capacidade
	 *            Capacidade da agenda.
	 */
	public Agenda(int capacidade) {
		this.capacidade = capacidade;
		this.contatos = new Contato[capacidade];
	}
	
	/**
	 * Cadastra um contato em uma determinada posição na agenda.
	 * 
	 * @param contato
	 *            Um Contato para adicionar na agenda.
	 * @param posicao
	 *            A posição em que o contato deve ser inserido (1 - capacidade).
	 */
	public void cadastrarContato(Contato contato, int posicao) {
		contatos[posicao - 1] = new Contato(contato);
	}

	/**
	 * Retorna um contato em uma determinada posição da agenda.
	 * 
	 * @param posicao
	 *            A posição em que o contato se encontra (1 - capacidade).
	 * @return Um objeto da classe Contato representando o contato a ser obtido.
	 */
	public Contato obterContato(int posicao) {
		return new Contato(contatos[posicao - 1]);
	}

	/**
	 * Retorna um valor booleano representando a validade da posição. Uma
	 * posição válida é uma posição maior que 0 e menor ou igual à capacidade da
	 * agenda e que o contato nessa posição não seja nulo.
	 * 
	 * @param posicao
	 *            A posição em que o contato se encontra (1 - capacidade).
	 * @return True: Caso a posição seja válida. False: Caso a posição seja
	 *         inválida.
	 */
	public boolean validarPosicao(int posicao) {
		if (posicao > 0 && posicao <= this.getCapacidade()) {
			if (this.contatos[posicao - 1] != null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Retorna a capacidade da agenda.
	 * 
	 * @return Um inteiro representando a capacidade da agenda.
	 */
	public int getCapacidade() {
		return this.capacidade;
	}

	/**
	 * Retorna uma lista de contatos não nulos. Seguindo o formato: "POSICAO -
	 * NOME SOBRENOME"
	 * 
	 * @param posicao
	 *            A posição em que o contato se encontra (1 - 100).
	 * @return Uma String representando a agenda. No seguinte formato: "POSICAO
	 *         - NOME SOBRENOME".
	 */
	@Override
	public String toString() {
		String listagem = "";

		for (int i = 0; i < this.getCapacidade(); i++) {
			if (contatos[i] != null) {
				listagem += (i + 1) + contatos[i].toString(" - %s %s") + Utilidades.FIM_DE_LINHA;
			}
		}

		return listagem;
	}

}
