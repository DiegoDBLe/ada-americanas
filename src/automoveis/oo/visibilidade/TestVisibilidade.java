package automoveis.oo.visibilidade;

import automoveis.oo.visibilidade.modelo.CarroVisibilidade;
import automoveis.oo.visibilidade.modelo.MotoVisibilidade;

public class TestVisibilidade {

	public static void main(String[] args) {

		CarroVisibilidade carroVisibilidade1 = new CarroVisibilidade("HRV", "HONDA");
		carroVisibilidade1.acelerar(100);
		carroVisibilidade1.setAnoDeFabricaao(2019);
		carroVisibilidade1.setCor("Preto");
		System.out.println(carroVisibilidade1.toString());

		System.out.println("--=-=-=-=-=-=-=-=-================");

		MotoVisibilidade motoVisibilidade  = new MotoVisibilidade("125cc", 2, 2023,
				"Vermelha", "Honda", "CB-500", "FLEX", 15_000.00,
				300,0 );
		motoVisibilidade.setAnoDeFabricaao(2023);
		motoVisibilidade.setCor("Preto");
		motoVisibilidade.setNumeroDeRodas(2);
		motoVisibilidade.setPreco(1000.00);
		System.out.println(motoVisibilidade.toString());
		
		
	}

}
