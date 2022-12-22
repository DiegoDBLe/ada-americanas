package automoveis.oo;

public class Moto{
	
	
	public String motor;
	public int numeroDeRodas;
	public int anoDeFabricaao;
	public String cor;
	public String marca;
	public String modelo;
	public String estiloDeCombustivel;
	public double preco;
	public int velocidadeMaxima;
	public int velocidadeAtual;
	
	
	public int obterVelocidadeMaxima(){
		return velocidadeMaxima;
	}
	
	public void ligar() {
		System.out.println("Moto ligada...0Km/h");
	}
	
	public void acelerar(int aumentoDeVelocidade) {
		velocidadeAtual += aumentoDeVelocidade;
		System.out.println("Acelerando: " + velocidadeAtual + "Km/h");
	}
	
	public void desacelerar(int diminuirDeVelocidade) {
		velocidadeAtual -= diminuirDeVelocidade;
		System.out.println("Desacelerando: " + diminuirDeVelocidade + "Km/h");
		System.out.println("velocidade atual: " + velocidadeAtual + "Km/h");
	}
	
	public void parar() {
		desacelerar(velocidadeAtual);
		System.out.println("Moto Parada..." + velocidadeAtual +  "Km/h");
	}

	@Override
	public String toString() {
		return "Motor: " + this.motor + "\n" + "Número de rodas: " + this.numeroDeRodas + "\n" + "Ano de Fabricação: "
				+ this.anoDeFabricaao + "\n" + "Cor: " + this.cor + "\n" + "Marca: " + this.marca + "\n" + "Modelo: "
				+ this.modelo + "\n" + "Combustivel: " + this.estiloDeCombustivel + "\n" + "Preço R$ " + this.preco 
				+ "Velocidade Máxima: " + this.velocidadeMaxima;
	}


}
