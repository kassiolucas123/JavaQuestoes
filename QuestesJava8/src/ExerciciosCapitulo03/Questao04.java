/* Fa�a uma classe que apresente em tela a tabuada de qualquer n�mero. O usu�rio fornece o n�-
mero desejado e a classe apresenta a rela��o de todos os c�lculos de 1 a 10. Veja um exemplo de
execu��o na Figura 3.19. */

package ExerciciosCapitulo03;

import javax.swing.JOptionPane;

public class Questao04 {
	public static void main(String[] args) {
		String dado = JOptionPane.showInputDialog(null, "Informe um numero: ");
		int numero = Integer.parseInt(dado);
		JOptionPane.showMessageDialog(null, (numero + "x 1 = " + (numero*1))+ "\n" + (numero + "x 2 = " + (numero*2))+ "\n" + (numero + "x 3 = " + (numero*3))+ "\n" + (numero + "x 4 = " + (numero*4))+ "\n" + (numero + "x 5 = " + (numero*5))+ "\n" +(numero + "x 6 = " + (numero*6))+ "\n" + (numero + "x 7 =" + (numero*7))+ "\n" + (numero + "x 8 = " + (numero*8))+ "\n" + (numero + "x 9 = " + (numero*9))+ "\n" +(numero + "x 10 = " + (numero*10)));
	}
	
	

}
