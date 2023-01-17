package automoveis.oo.heranca;

public class TesteHeranca {

    public static void main(String[] args) {


        Carro carro1 = new Carro();
        carro1.setModelo("HRV");
        carro1.setCor("Azul");
        String modelo = carro1.getModelo();
        String cor = carro1.getCor();

        System.out.println("Modelo: " + modelo + "\nCor: " + cor );

        System.out.println("");

        Moto moto2 = new Moto();
        moto2.setCor("Vermelha");
        moto2.setModelo("CB250");

        String moto2Modelo = moto2.getModelo();
        String moto2Cor = moto2.getCor();

        System.out.println("Modelo: " + moto2Modelo + "\nCor: " + moto2Cor );


    }
}
