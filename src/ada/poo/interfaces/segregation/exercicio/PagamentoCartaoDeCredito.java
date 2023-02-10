package ada.poo.interfaces.segregation.exercicio;

public class PagamentoCartaoDeCredito implements FormaDePagamento{

    @Override
    public void pagar() {
        System.out.println("Pagando via cartão de crédito");
    }
}
