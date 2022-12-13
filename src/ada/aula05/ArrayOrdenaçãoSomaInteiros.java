package ada.aula05;

import java.util.Arrays;

public class ArrayOrdenaçãoSomaInteiros {

	public static void main(String[] args) {


		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		System.out.println("Soma = " + Arrays.stream(my_array1).sum());
		System.out.println("Média = " + Arrays.stream(my_array1).average().getAsDouble());

	}

}
