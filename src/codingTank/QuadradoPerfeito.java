package codingTank;

public class QuadradoPerfeito {

	public static void main(String[] args) {

		int[][] matriz = montarEPreencheQuadradoPerfeito();
		int coluna = 0;
		int linha;
		int aux = 0;
		int elem = 0;
		int a = 0;
		int c = 0;
		int ok = 1;

		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					aux += elem;
				}
				if (linha == 0) {
					a += elem;
				} else {
					c += elem;
				}
			}
			if (a != aux) {
				ok = 0;
			}
		}
		if (a != c) {
			ok = 0;
		}
		if (ok == 1) {
			System.out.println("Quadrado perfeito");
		} else {
			System.out.println("Quadrado não perfeito");
		}
	}

	public static int[][] montarEPreencheQuadradoPerfeito() {
		int[][] matriz = { { 20, 6, 7, 17 }, { 9, 15, 14, 12 }, { 13, 11, 10, 16 }, { 8, 18, 19, 5 } };
		return matriz;
	}
}
