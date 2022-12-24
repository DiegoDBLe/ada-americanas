package automoveis.oo.semconstrutor;

public class Carro {

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

	public int obterVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void ligar() {
		System.out.println("Carro ligado...0Km/h");
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
		System.out.println("Carro Parado..." + velocidadeAtual + "Km/h");
	}

	@Override
	public String toString() {
		return "Motor: " + this.motor + "\nNúmero de rodas: " + this.numeroDeRodas + "\nAno de Fabricação: "
				+ this.anoDeFabricaao + "\nCor: " + this.cor + "\nMarca: " + this.marca + "\nModelo: " + this.modelo
				+ "\nCombustivel: " + this.estiloDeCombustivel + "\nPreço R$ " + this.preco + "\nVelocidade Máxima: "
				+ this.velocidadeMaxima;
	}

}
