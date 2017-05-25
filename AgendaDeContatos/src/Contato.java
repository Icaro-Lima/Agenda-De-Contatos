/**
 * Representação de um contato, todo contato tem nome, sobrenome e telefone.
 *
 * @author Ícaro Dantas
 */
public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

	/**
	 * Constrói um contato a partir de seu nome, sobrenome e telefone.
	 * 
	 * @param nome
	 *            Nome do contato.
	 * @param sobrenome
	 *            Sobrenome do contato.
	 * @param telefone
	 *            Telefone do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	/**
	 * Constrói um contato a partir de um contato existente.
	 * @param contato Um objeto da classe Contato.
	 */
	public Contato(Contato contato) {
		this.nome = contato.getNome();
		this.sobrenome = contato.getSobrenome();
		this.telefone = contato.getTelefone();
	}

	/**
	 * Retorna a String que representa o contato. A representação segue o
	 * formato “NOME SOBRENOME TELEFONE”.
	 * 
	 * @returns Uma String representando informações à respeito do contato.
	 */
	@Override
	public String toString() {
		return this.getNome() + " " + this.getSobrenome() + " " + this.getTelefone();
	}

	/**
	 * Retorna a String que representa o aluno. A representação depende do
	 * parâmetro formatString.
	 *
	 * @param formatString
	 *            Uma String de formatação
	 * @returns Uma String representando informações à respeito do contato, com
	 *          estritamente 3 x %s. Ex: "Nome: %s, Sobrenome: %s, Telefone:
	 *          %s".
	 */
	public String toString(String formatString) {
		return String.format(formatString, this.getNome(), this.getSobrenome(), this.getTelefone());
	}

	/**
	 * Retorna o nome do contato.
	 *
	 * @returns Uma String representando o nome do contato.
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Retorna o sobrenome do contato.
	 *
	 * @returns Uma String representando o sobrenome do contato.
	 */
	public String getSobrenome() {
		return this.sobrenome;
	}

	/**
	 * Retorna o telefone do contato.
	 *
	 * @returns Uma String representando o telefone do contato.
	 */
	public String getTelefone() {
		return this.telefone;
	}

	/**
	 * Seta o nome do contato.
	 * 
	 * @param nome
	 *            Uma String representando o nome do contato.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Seta o sobrenome do contato.
	 * 
	 * @param nome
	 *            Uma String representando o sobrenome do contato.
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * Seta o telefone do contato.
	 * 
	 * @param nome
	 *            Uma String representando o telefone do contato.
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
