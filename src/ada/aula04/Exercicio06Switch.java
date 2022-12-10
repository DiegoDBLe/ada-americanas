package ada.aula04;

public class Exercicio06Switch {

	public static String mesAno(int numeroMes) {

		int mes = numeroMes;
		String nomeMes;
		
		switch (mes) {
            case 1:
            	nomeMes = "Janeiro";
                return nomeMes;
            case 2:
            	nomeMes = "Fevereiro";
                return nomeMes;
            case 3:
            	nomeMes = "Março";
                return nomeMes;
            case 4:
            	nomeMes = "Abril";
                return nomeMes;
            case 5:
            	nomeMes = "Maio";
               return  nomeMes;
            case 6:
            	nomeMes = "Junho";
                return  nomeMes;
            case 7:
            	nomeMes = "Julho";
                return  nomeMes;
            case 8:
            	nomeMes ="Agosto";
                return  nomeMes;
            case 9:
            	nomeMes ="Setembro";
                return  nomeMes;
            case 10:
            	nomeMes ="Outubro";
                return  nomeMes;
            case 11:
            	nomeMes = "Novembro";
                return  nomeMes;
            case 12:
            	nomeMes ="Dezembro";
                return  nomeMes;
            default: 
            	nomeMes ="Mes inválido";
                return  nomeMes;
        }
	}
}
