package ExerciciosCapitulo05;

import javax.swing.JOptionPane;

public class Questao5 {
	public static void main(String[] args) {
		String[] estacionameto = new String[10];
		int opcao = 0;
		int numero;

		while (opcao != 4) {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"## MENU ##\n1 - Entrada\n2 - Sa�da\n3 - Listar Situacao Atual\n4 - Encerrar o programa"));

			if (opcao == 1) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da vaga(0 - 9): "));
				estacionameto[numero] = JOptionPane.showInputDialog("Placa: ");
				JOptionPane.showMessageDialog(null, "Vaga preenchida");

			} else if (opcao == 2) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da vaga(0 - 9): "));
				estacionameto[numero] = null;
				JOptionPane.showMessageDialog(null, "Feito");
			} else if (opcao == 3) {
				for (int i = 0; i < 10; i++) {
					JOptionPane.showMessageDialog(null, "VagaNumero " + i + ": " + estacionameto[i]);
				}
			}
		}
		System.exit(0);
	}
}
