package ada.poo.interfaces.segregation.exercicio;

import java.util.List;

public class SiStemaDePagamentos implements GatewayDePagamento{

    private final SeletorDeFormaDeFormaDePagamento seletorDeFormaDeFormaDePagamento;
    private final GerenciadoDeFormasDePagamento gerenciadoDeFormasDePagamento;

    public SiStemaDePagamentos(SeletorDeFormaDeFormaDePagamento seletorDeFormaDeFormaDePagamento, GerenciadoDeFormasDePagamento gerenciadoDeFormasDePagamento) {
        this.seletorDeFormaDeFormaDePagamento = seletorDeFormaDeFormaDePagamento;
        this.gerenciadoDeFormasDePagamento = gerenciadoDeFormasDePagamento;
    }

    @Override
    public void pagar() {
        List<FormaDePagamento> formasDePagamentos = gerenciadoDeFormasDePagamento.getFormaDePagamentos();
        FormaDePagamento formaDePagamento = seletorDeFormaDeFormaDePagamento.selecionarMeioDePagamento(formasDePagamentos);
        formaDePagamento.pagar();
    }
}
