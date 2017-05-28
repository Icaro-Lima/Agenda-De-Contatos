import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Agenda agenda = new Agenda(100);

		System.out.print(Menu.getTextoMenuDeOpcoes());

		String token;
		while (!(token = sc.nextLine()).equals("S")) {
			if (token.equals("C")) {
				System.out.print(Utilidades.ENDL + Menu.getTextoCadastrarContatoPosicao());
				int posicao = Integer.parseInt(sc.nextLine());

				if (posicao > 0 && posicao <= agenda.getCapacidade()) {
					System.out.print(Menu.getTextoCadastrarContatoNome());
					String nome = sc.nextLine();

					System.out.print(Menu.getTextoCadastrarContatoSobrenome());
					String sobrenome = sc.nextLine();

					System.out.print(Menu.getTextoCadastrarContatoTelefone());
					String telefone = sc.nextLine();

					Contato contato = new Contato(nome, sobrenome, telefone);

					agenda.cadastrarContato(contato, posicao);

					System.out.println(Menu.getTextoCadastrarContatoCadastroRealizado() + Utilidades.ENDL);
				} else {
					System.out.println(Menu.getTextoPosicaoInvalida() + Utilidades.ENDL);
				}
			} else if (token.equals("L")) {
				System.out.println(Utilidades.ENDL + agenda.toString());
			} else if (token.equals("E")) {
				System.out.print(Menu.getTextoExibirContato());
				int posicao = Integer.parseInt(sc.nextLine());

				if (agenda.validarPosicao(posicao)) {
					Contato contato = agenda.obterContato(posicao);

					System.out.println(Utilidades.ENDL + contato.toString("%s %s - %s") + Utilidades.ENDL);
				} else {
					System.out.println(Menu.getTextoPosicaoInvalida() + Utilidades.ENDL);
				}
			} else {
				System.out.println(Menu.getTextoOpcaoInvalida() + Utilidades.ENDL);
			}

			System.out.print(Menu.getTextoMenuDeOpcoes());
		}
	}

}
