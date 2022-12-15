package ada.aula05;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		//Array com 5 Linhas e 7 colunas
		int matrizInteiro [] [] = new int [5][7];
		
		for(int linha = 0; linha < matrizInteiro.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiro[linha].length; coluna++) {
				System.out.print(matrizInteiro[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}
