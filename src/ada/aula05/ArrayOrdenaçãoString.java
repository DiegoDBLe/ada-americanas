package ada.aula05;

import java.util.Arrays;

public class ArrayOrdenaçãoString {

	public static void main(String[] args) {

		String[] my_array2 = {
	            "Java",                        
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++"
	        };     

		Arrays.sort(my_array2);
		System.out.println(Arrays.toString(my_array2));
	}

}
