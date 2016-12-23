/* O Imposto sobre a Transmiss�o de Bens M�veis (ITBI) � aplicado sobre o valor de um im�vel a
ser negociado. A base de c�lculo do ITBI (o valor a ser considerado no c�lculo) ser� o maior valor
entre o valor de transa��o (o valor negociado) e o valor venal de refer�ncia (fornecido pela
Prefeitura). Com base nisso, elabore uma classe que receba o valor da transa��o, o valor venal e
o percentual de imposto. Ap�s isso, encontre o maior valor e aplique o percentual sobre ele. Ao
final, apresente o valor do imposto a ser pago. Observa��o: o valor do imposto a ser pago � calculado
por meio da f�rmula: valor do imposto = maior valor * percentual / 100. Para entrada e sa�da
de dados utilize a classe JOptionPane. */

package ExerciciosCapitulo02;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Questao03 {
	public static void main(String[] args) {
		String aux;
		float valorTransacao, valorVenal, percentualImposto, valorImposto, maiorValor;
		try {
			aux = JOptionPane.showInputDialog("qual o valor da transa��o: ");
			valorTransacao = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("qual o valor venal: ");
			valorVenal = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("qual o percentual de imposto: ");
			percentualImposto = Float.parseFloat(aux);
			
			if (valorTransacao > valorVenal){
				maiorValor = valorTransacao;
			} else {
				maiorValor = valorVenal;
			}
			
			valorImposto = (maiorValor * percentualImposto) / 100;
			
			JOptionPane.showMessageDialog(null, "Valor do imposto: " + valorImposto);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Houve erro na conversao, digite apenas caracteres numericos" + erro.toString());
			// TODO: handle exception
		}
		System.exit(0);
	}
}
