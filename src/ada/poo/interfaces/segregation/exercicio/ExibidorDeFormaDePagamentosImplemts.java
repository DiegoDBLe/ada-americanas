package ada.poo.interfaces.segregation.exercicio;

import java.util.List;

public class ExibidorDeFormaDePagamentosImplemts {

    public void exibirMeiosDePagamento(List<FormaDePagamento> pagamentos){
        for(FormaDePagamento pagamento : pagamentos){
            System.out.println(pagamento.getClass().getSimpleName());
        }
    }

}
