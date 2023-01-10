package automoveis.oo.visibilidade;

public class MotoBuilder {

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


    public MotoBuilder motor(String motor) {
        this.motor = motor;
        return this;
    }

    public MotoBuilder numeroDeRodas(int numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
        return this;
    }

    public MotoBuilder anoDeFabricaao(int anoDeFabricaao) {
        this.anoDeFabricaao = anoDeFabricaao;
        return this;
    }

    public MotoBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public MotoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public MotoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public MotoBuilder combustivel(String estiloDeCombustivel) {
        this.estiloDeCombustivel = estiloDeCombustivel;
        return this;
    }

    public MotoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public MotoBuilder velocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
        return this;
    }

    public MotoBuilder velocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
        return this;
    }

    public MotoVisibilidade build() {
        return new MotoVisibilidade(motor, numeroDeRodas, anoDeFabricaao, cor, marca, modelo, estiloDeCombustivel, preco,
                velocidadeMaxima, velocidadeAtual);
    }
}

