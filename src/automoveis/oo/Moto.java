package automoveis.oo;

public class Moto extends Veiculos {
	
	
	@Override
	public String toString() {
		return  "Motor: " + super.motor + "\n"
				+ "Número de rodas: " + super.numeroDeRodas + "\n" 
				+ "Ano de Fabricação: " + super.anoDeFabricaao + "\n"
				+ "Cor: " + super.cor + "\n"
				+ "Marca: " + super.marca + "\n"
				+ "Modelo: " + super.modelo + "\n"
				+ "Combustivel: " + super.estiloDeCombustivel + "\n"
				+ "Preço R$ " + super.preco;
	}

}
