public class Menu {

	public static String getTextoMenuDeOpcoes() {
		return "(C)adastrar Contato" + Utilidades.endl + "(L)istar Contatos"
				+ Utilidades.endl + "(E)xibir Contato" + Utilidades.endl
				+ "(S)air" + Utilidades.endl + "Opção> ";
	}
	
	public static String getTextoOpcaoInvalida() {
		return "OPÇÃO INVÁLIDA!";
	}
	
	public static String getTextoExibirContato() {
		return "Contato> ";
	}
	
	public static String getTextoCadastrarContatoPosicao() {
		return "Contato> ";
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
