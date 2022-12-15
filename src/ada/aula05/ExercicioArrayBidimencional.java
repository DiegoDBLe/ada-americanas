package ada.aula05;

public class ExercicioArrayBidimencional {

	public static void main(String[] args) {

		int[][] matrizInteiros = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(matrizInteiros[0][0]);
		
		for (int i=0; i < matrizInteiros.length; i++) {
			  for (int j=0; j < matrizInteiros[i].length; j++) {
			    System.out.print(matrizInteiros[i][j]);
			  }
			  System.out.println();
			}
	}
}
