package ada.poo.interfaces.segregation.exercicio;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeFormasDePagamentoImpl implements GerenciadoDeFormasDePagamento{

    private final List<FormaDePagamento> formasDePagamento;

    public  GerenciadorDeFormasDePagamentoImpl(List<FormaDePagamento> formasDePagamento) {
        this.formasDePagamento = formasDePagamento;
    }

    @Override
    public List<FormaDePagamento> getFormaDePagamentos() {
        return new ArrayList<>(formasDePagamento);
    }
}
