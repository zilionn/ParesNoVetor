package controller;

public class ParesController {

	public ParesController() {
		super();
	}

	public int pares(int[] vet, int tamanho) {
		if (tamanho <= 0) {
			return 0;
		} else {
			return (((vet[tamanho - 1] %2 <= 0) ? 1: 0) + pares(vet, tamanho - 1));
		}
	}
}
