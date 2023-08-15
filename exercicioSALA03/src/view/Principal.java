package view;

import javax.swing.JOptionPane;

import controller.ParesController;

public class Principal {

	public static void main(String[] args) {
		ParesController parCont = new ParesController();
		int posicoes = 0;
		
		do {
			try {
				String input = JOptionPane.showInputDialog("digite o tamanho do vetor: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				posicoes = Integer.parseInt(input);
				if (posicoes <= 0) {
					JOptionPane.showMessageDialog(null, "tamanho inválido");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "tamanho inválido");
				continue;
			}
			break;
		}while (true);
		
		int[] vet = new int[posicoes];
		for (int i = 0; i < posicoes; i++) {
			do {
				try {
					String input = JOptionPane.showInputDialog("digite o " + (i + 1) + " valor do vetor: ", "");
					if (input == null) {
						JOptionPane.showMessageDialog(null, "encerrado");
						System.exit(0);
					}
					vet[i] = Integer.parseInt(input);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "valor inválido");
					continue;
				}
				break;
			} while(true);
		}
		
		JOptionPane.showMessageDialog(null, "valores pares no vetor: " +parCont.pares(vet, posicoes));
	}

}
