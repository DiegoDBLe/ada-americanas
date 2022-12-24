package automoveis.oo.visibilidade;

public class TestVisibilidade {

	public static void main(String[] args) {

		CarroVisibilidade carroVisibilidade1 = new CarroVisibilidade("HRV", "HONDA");
		carroVisibilidade1.acelerar(100);
		carroVisibilidade1.setAnoDeFabricaao(2019);
		carroVisibilidade1.setCor("Preto");
		System.out.println(carroVisibilidade1.toString());
		
		
	}

}
