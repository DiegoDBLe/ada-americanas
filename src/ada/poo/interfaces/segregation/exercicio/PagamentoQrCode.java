package ada.poo.interfaces.segregation.exercicio;

public class PagamentoQrCode implements FormaDePagamento{
    @Override
    public void pagar() {
        System.out.println("Pagando via QrCode");
    }
}
