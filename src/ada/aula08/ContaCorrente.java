package ada.aula08;

public class ContaCorrente {

	public String titular;
	public double saldo;
	public int quantidadeErradas = 0;

	public void saca(double quantidade) throws Exception {

		if (quantidade > saldo) {
			quantidadeErradas += 1;
			throw new SaldoInsuficienteException("Saldo insuficiente tente um valor menor");
		}

		saldo = saldo - quantidade;
	}

	public void deposita(double quantidade) {
		saldo += quantidade;
	}

}
