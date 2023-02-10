package ada.poo.interfaces.segregation.exercicio;

import java.util.Collections;
import java.util.List;

public class SeletorDeFormaDeFormaDePagamentoImplements implements SeletorDeFormaDeFormaDePagamento {

    public FormaDePagamento selecionarMeioDePagamento(List<FormaDePagamento> pagamentos) {
        Collections.shuffle(pagamentos);
        return pagamentos.get(0);
    }
}
