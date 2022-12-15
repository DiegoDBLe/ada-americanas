package ada.aula04;

public class ExercicioQuantosDiasTemOMes {
	
	public static int mesAno(int mes) {
		
		int ano = 2000;
		int numeroDeDias = 0;
		
		switch (mes) {
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
				numeroDeDias = 31;
				break;
			case 4: case 6:
			case 9: case 11:
				numeroDeDias = 30;
				break;
			case 2:
				if(((ano % 4 == 0) && !(ano % 100 ==0) || (ano % 400 ==0)))
					numeroDeDias = 29;
				else {
					numeroDeDias = 28;
					break;
				}
			
			default:
				throw new IllegalArgumentException("Mês escolhido é inválido " + mes);
		}
		
		System.out.println("Numero de dias do mÊs " + mes + " é: " + numeroDeDias + " dias." );
		
		return mes;
		
	}
	
	

}
