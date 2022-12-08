package codingTank;

public class ExercicioParcelaEmprestimo {

	public static void main(String[] args) {

		/*
		 * Uma cliente pegou um emprestimo em um banco no valor de R$ 20.000,00 Parcela
		 * >= R$ 1000 oções de parcelamento.
		 */

		double valorTotal = 20000;

		for (int parcela = 1; parcela <= 20; parcela++) {
			double valorParcela = valorTotal / parcela;

			if (valorParcela < 1000) {
				break;
			}
			System.out.println("Parcela " + parcela + " valor R$ " + valorParcela);
		}

		for (int i = 0; i <= 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
