package ada.aula05;

public class ArrayOrdenaçãoInteiro {

	public static void main(String[] args) {

		int auxiliar;

		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		for (int i = 0; i < my_array1.length; i++) {
			
			System.out.print(my_array1[i] + ",");
			for (int j = 0; j < my_array1.length; j++) {
				if (my_array1[i] < my_array1[j]) {
					auxiliar = my_array1[i];
					my_array1[i] = my_array1[j];
					my_array1[j] = auxiliar;
				}
			}
		}
		System.out.println();
		System.out.println("Depois da Ordenação: ");
		for (int i = 0; i < my_array1.length; i++) {
			System.out.print(my_array1[i] + ",");
		}

	}

}
