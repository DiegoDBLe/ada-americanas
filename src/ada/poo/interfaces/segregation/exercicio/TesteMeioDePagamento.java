package ada.poo.interfaces.segregation.exercicio;

import java.util.Arrays;

public class TesteMeioDePagamento {
    public static void main(String[] args) {

    ExibidorDeFormaDePagamentosImplemts exibidorDeFormaDePagamentos = new ExibidorDeFormaDePagamentosImplemts();
    SeletorDeFormaDeFormaDePagamentoImplements seletorDeFormaDeFormaDePagamento = new SeletorDeFormaDeFormaDePagamentoImplements();

    GerenciadoDeFormasDePagamento gerenciadoQrCode = new GerenciadorDeFormasDePagamentoImpl(Arrays
            .asList(new PagamentoQrCode(), new PagamentoDinheiro()));

    GerenciadoDeFormasDePagamento gerenciadoCartoes = new GerenciadorDeFormasDePagamentoImpl(Arrays
            .asList(new PagamentoCartaoDeCredito(), new PagamentoCartaoDeDebito()));
    GatewayDePagamento gatewayDePagamento = new SiStemaDePagamentos(seletorDeFormaDeFormaDePagamento, gerenciadoCartoes);

    gatewayDePagamento.pagar();

    System.out.println("");

    exibidorDeFormaDePagamentos.exibirMeiosDePagamento(gerenciadoQrCode.getFormaDePagamentos());

    }

}

