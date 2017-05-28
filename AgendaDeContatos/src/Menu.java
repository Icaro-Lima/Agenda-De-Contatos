public class Menu {

	public static String getTextoMenuDeOpcoes() {
		return "(C)adastrar Contato" + Utilidades.ENDL + "(L)istar Contatos" + Utilidades.ENDL + "(E)xibir Contato"
				+ Utilidades.ENDL + "(S)air" + Utilidades.ENDL + Utilidades.ENDL + "Opção> ";
	}

	public static String getTextoOpcaoInvalida() {
		return "OPÇÃO INVÁLIDA!";
	}

	public static String getTextoPosicaoInvalida() {
		return "POSICAO INVÁLIDA!";
	}

	public static String getTextoExibirContato() {
		return "Contato> ";
	}

	public static String getTextoCadastrarContatoPosicao() {
		return "Posição: ";
	}

	public static String getTextoCadastrarContatoNome() {
		return "Nome: ";
	}

	public static String getTextoCadastrarContatoSobrenome() {
		return "Sobrenome: ";
	}

	public static String getTextoCadastrarContatoTelefone() {
		return "Telefone: ";
	}

	public static String getTextoCadastrarContatoCadastroRealizado() {
		return "CADASTRO REALIZADO!";
	}

}
