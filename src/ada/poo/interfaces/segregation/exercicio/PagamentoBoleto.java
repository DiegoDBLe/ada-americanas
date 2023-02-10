package ada.poo.interfaces.segregation.exercicio;

public class PagamentoBoleto implements FormaDePagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento via Bolet");
    }
}
