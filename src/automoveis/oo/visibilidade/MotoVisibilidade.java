package automoveis.oo.visibilidade;

public class MotoVisibilidade{
	
	
	private String motor;
	private int numeroDeRodas;
	private int anoDeFabricaao;
	private String cor;
	private String marca;
	private String modelo;
	private String estiloDeCombustivel;
	private double preco;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	
	public MotoVisibilidade(String motor, String cor, String modelo) {
		this.motor = motor;
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public MotoVisibilidade(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}

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
		return "Motor: " + this.motor + "\nNúmero de rodas: " + this.numeroDeRodas + "\nAno de Fabricação: "
				+ this.anoDeFabricaao + "\nCor: " + this.cor + "\nMarca: " + this.marca + "\nModelo: "
				+ this.modelo + "\nCombustivel: " + this.estiloDeCombustivel + "\nPreço R$ " + this.preco 
				+ "\\nVelocidade Máxima: " + this.velocidadeMaxima;
	}


}
