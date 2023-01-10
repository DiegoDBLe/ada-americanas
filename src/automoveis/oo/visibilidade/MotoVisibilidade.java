package automoveis.oo.visibilidade;

public class MotoVisibilidade {
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

    public MotoVisibilidade(String motor, int numeroDeRodas, int anoDeFabricaao, String cor, String marca,
                            String modelo, String estiloDeCombustivel, double preco, int velocidadeMaxima, int velocidadeAtual) {
        this.motor = motor;
        this.numeroDeRodas = numeroDeRodas;
        this.anoDeFabricaao = anoDeFabricaao;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.estiloDeCombustivel = estiloDeCombustivel;
        this.preco = preco;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
    }

    public MotoVisibilidade(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public int obterVelocidadeMaxima() {
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
        System.out.println("Moto Parada..." + velocidadeAtual + "Km/h");
    }

    @Override
    public String toString() {
        return "Motor: " + this.motor + "\nNúmero de rodas: " + this.numeroDeRodas + "\nAno de Fabricação: "
                + this.anoDeFabricaao + "\nCor: " + this.cor + "\nMarca: " + this.marca + "\nModelo: "
                + this.modelo + "\nCombustivel: " + this.estiloDeCombustivel + "\nPreço R$ " + this.preco
                + "\nVelocidade Máxima: " + this.velocidadeMaxima;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
    }

    public int getAnoDeFabricaao() {
        return anoDeFabricaao;
    }

    public void setAnoDeFabricaao(int anoDeFabricaao) {
        this.anoDeFabricaao = anoDeFabricaao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstiloDeCombustivel() {
        return estiloDeCombustivel;
    }

    public void setEstiloDeCombustivel(String estiloDeCombustivel) {
        this.estiloDeCombustivel = estiloDeCombustivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
