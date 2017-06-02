package main;

import java.util.Scanner;

import agenda.Agenda;
import agenda.Contato;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Agenda agenda = new Agenda(100);

		System.out.print(Menu.getTextoMenuDeOpcoes());

		String token;
		while (!(token = sc.nextLine()).equals("S")) {
			if (token.equals("C")) {
				System.out.print(Utilidades.FIM_DE_LINHA + Menu.getTextoCadastrarContatoPosicao());
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

					System.out.println(Menu.getTextoCadastrarContatoCadastroRealizado() + Utilidades.FIM_DE_LINHA);
				} else {
					System.out.println(Menu.getTextoPosicaoInvalida() + Utilidades.FIM_DE_LINHA);
				}
			} else if (token.equals("L")) {
				System.out.println(Utilidades.FIM_DE_LINHA + agenda.toString());
			} else if (token.equals("E")) {
				System.out.print(Menu.getTextoExibirContato());
				int posicao = Integer.parseInt(sc.nextLine());

				if (agenda.validarPosicao(posicao)) {
					Contato contato = agenda.obterContato(posicao);

					System.out.println(
							Utilidades.FIM_DE_LINHA + contato.toString("%s %s - %s") + Utilidades.FIM_DE_LINHA);
				} else {
					System.out.println(Menu.getTextoPosicaoInvalida() + Utilidades.FIM_DE_LINHA);
				}
			} else {
				System.out.println(Menu.getTextoOpcaoInvalida() + Utilidades.FIM_DE_LINHA);
			}

			System.out.print(Menu.getTextoMenuDeOpcoes());
		}

		sc.close();
	}

}
