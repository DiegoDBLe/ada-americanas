package ada.poo.interfaces.segregation.exercicio;

public class PagamentoDinheiro implements FormaDePagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento via Dinheiro");
    }
}
