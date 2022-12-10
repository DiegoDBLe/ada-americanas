package ada.aula04;

public class Exercicio06SwitchLambda {
	
	public static String mesAnoLambda(int numeroMes) {
		
		String mesNome;
		
		switch (numeroMes) {
		case 1 -> mesNome = "Janeiro";
		case 2 -> mesNome = "fevereiro";
		case 3 -> mesNome = "Março";
		case 4 -> mesNome = "Abril";
		case 5 -> mesNome = "Maio";
		case 6 -> mesNome = "Junho";
		case 7 -> mesNome = "Julho";
		case 8 -> mesNome = "Agosto";
		case 9 -> mesNome = "Setmbro";
		case 10 -> mesNome = "Outubro";
		case 11 -> mesNome = "Novembro";
		case 12 -> mesNome = "Dezembro";
		
		default ->
		throw new IllegalArgumentException("Valor inválido: " + numeroMes);
		}
		return mesNome;
	}

}
