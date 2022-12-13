package ada.aula05;

import java.util.Arrays;

public class ExercicioNomesArray {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Ronaldo", "Neymar", "Ronaldinho", "Romario"};
		
		System.out.println(nomes[1]);
		
		//Declarando mais de um array:
		
		int[] r = new int[44], k = new int[33];
		
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(k));
		
		
		//Imprimindo pelo forEach:
		for (int i : k) {
			System.out.println(k[i]);
		}
		
		//for tradicional:
		for(int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
		}
	}

}
