package automoveis.oo.visibilidade;

import automoveis.oo.visibilidade.modelo.MotoVisibilidade;

public class TestMoto {

    public static void main(String[] args) {
        // usando o set, se torna verboso
        MotoVisibilidade moto1 = new MotoVisibilidade("125cc", 2, 2023, "Vermelha","HONDA", "CB500", "FLEX",
                15_000, 500, 0);
        moto1.setMarca("HONDA"); // baixo acoplamento
        moto1.setModelo("CB1000");
        moto1.setCor("Verde");
        moto1.setVelocidadeMaxima(200);
        moto1.setPreco(40_000.00);

        System.out.println(moto1);
        System.out.println(moto1.getMarca());
        System.out.println(moto1.getCor());

        // usando o construtor
        // 1 - dificuldade no preenchimento
        // 2 - respeitar a ordem dos tipos
        // 3 - temos memoria curta, acabamos esqucendo a que se refere cada valor informado
        MotoVisibilidade moto2 = new MotoVisibilidade("125cc", 2, 2023, "Vermelha","HONDA", "CB500", "FLEX",
                15_000, 500, 0);

        // Design Pattern -> Builder (faz parte do grupo dos padrões Criacionais)
        // 1 - dificuldade no preenchimento -> X
        // 2 - respeitar a ordem dos tipos -> X
        // 3 - temos memoria curta, acabamos esqucendo a que se refere cada valor informado -> X
        // 4 - usando o set, se torna verboso -> X

        System.out.println(" ");

        MotoVisibilidade motoVisibilidade = new MotoBuilder()
                .anoDeFabricaao(2023)
                .cor("Vermelha")
                .numeroDeRodas(2)
                .preco(15_000)
                .combustivel("FLEX")
                .modelo("CB-500")
                .marca("HONDA")
                .motor("125cc")
                .build();

        System.out.println(motoVisibilidade);
    }
}
