package automoveis.oo;

public class TesteConcessionaria {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.marca = "Mercedes";
		carro1.motor = "AMG";
		carro1.cor = "Prata";
		carro1.modelo = "GLI 360";
		carro1.estiloDeCombustivel = "Flex";
		carro1.numeroDeRodas = 5;
		carro1.anoDeFabricaao = 2022;
		carro1.preco = 370000.00;
		
		System.out.println(carro1);
		
		Moto moto1 = new Moto();
		
		moto1.marca = "Honda";
		moto1.motor = "125cc";
		moto1.cor = "Preta";
		moto1.modelo = "Titan";
		moto1.estiloDeCombustivel = "Flex";
		moto1.numeroDeRodas = 2;
		moto1.anoDeFabricaao = 2022;
		moto1.preco = 7000.00;
		
		System.out.println();
		System.out.println(moto1);
		
	}

}
