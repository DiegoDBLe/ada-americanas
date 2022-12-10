package ada.aula04;

public class Exercicio05NotaAluno {

	public static void media(int nota) {

		char a = 'A';
		char b = 'B';
		char c = 'C';
		char d = 'D';
		char f = 'F';

		if (nota >= 90) {
			System.out.println(a);

		} else if (nota >= 80) {
			System.out.println(b);

		} else if (nota >= 70) {
			System.out.println(c);

		} else if (nota >= 60) {
			System.out.println(d);

		} else {
			System.out.println(f);
		}
	}
}
