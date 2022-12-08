package codingTank;

public class ExercicioQuadradoPerfeito {

	public static void main(String[] args) {
		int[][] matriz = montarEPreencheQuadradoPerfeito();

		int primeiraLinha = 0;
		int outrasLinhas = 0;

		for (int i = 0; i < matriz[0].length; i++) {
			primeiraLinha += matriz[0][i];
		}
		for (int j = 1; j < matriz.length; j++) {
			for (int k = 0; k < matriz.length; k++) {
				primeiraLinha += matriz[j][k];
			}
			if (outrasLinhas != primeiraLinha) {
				System.out.println("É um quadrado perfeito!");
			}
		}
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				outrasLinhas += matriz[i][j];
			}
			if (outrasLinhas != primeiraLinha) {
				System.out.println("É um quadrado perfeito!");
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			outrasLinhas += matriz[i][i];
		}
		if (outrasLinhas != primeiraLinha) {
			System.out.println("É um quadrado perfeito!");
		}
		int linhaAtual = 0;
		for (int j = matriz.length - 1; j >= 0; j--) {
			outrasLinhas += matriz[linhaAtual][j];
			linhaAtual++;
		}
		if (outrasLinhas != primeiraLinha) {
			System.out.println("É um quadrado perfeito!");
		} else {
			System.out.println("Não é um quadrado perfeito!");
		}
	}

	public static int[][] montarEPreencheQuadradoPerfeito() {
		int[][] matriz = { { 20, 6, 7, 17 }, { 9, 15, 14, 12 }, { 13, 11, 10, 16 }, { 8, 18, 19, 5 } };
		return matriz;
	}

}
