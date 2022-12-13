package ada.aula05;

public class ExercicioContemNumeroNoArray {

	public static boolean contains(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return true;
			}
		}
		return false;
	}
}
