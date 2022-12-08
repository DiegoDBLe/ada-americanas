package br.com.americanas.ada.codingTank;

public class OperadoresAula02 {

	public static void main(String[] args) {
		
        // [Tipo] [ nome]
        String nomeVariavel = "Qualquer coisa";

        System.out.println(nomeVariavel);

        // byte; short; int; long; float; double; char; boolean

        byte b1 = 127;
        short s1 = 5000;
        int i1 = 100000;
        long li = 50000;
        float f1 = 100.0f;
        double d1 = 100.0D;
        char c1 = 71; // -> Tabela ASK
        char c2 = 'A';
        boolean falso = false;
        boolean verdadeiro = true;

        System.out.println(c1);

        // + - * / %
        double d2 = 2.5;
        double d3 = 2.5;

        System.out.println(d2 + d3);

        // maiorque > <menorque <=menorouigual maiorouigual>= igua== diferente!=
        int numero1 = 10;
        int numero2 = 20;
        boolean isNumero1MaiorQueNumero2 = numero1 > numero2;

        if (numero1 >= numero2){
            System.out.println("Numero 1 é maior que numero 2");
        } else if (numero1 == numero2) {
            System.out.println("Numeros iguais");
        } else if (numero1 != numero2) {
            System.out.println("Numeros diferentes");
        } else {
            System.out.println("Numero 2 é maior que numero 1");
        }

        // Operadores lógicos &&(AND) || (OR) ! (NEGAÇÃO):
        int tempoEmpresa = 2;
        double salario = 4000;
        boolean isPossivelAumento = tempoEmpresa >= 2 && salario >= 4000;

        if (isPossivelAumento){
            System.out.println("Aumento salarial autorizado");
        }else {
            System.out.println("Aumento salarial negado");
        }

        // Operadores de atribuição += -= *= /= %=
        int i5 = 10;
        i5 += 5;

        System.out.println(i5);

        i5 *= 2;
        System.out.println(i5);

        i5 -= 5;
        System.out.println(i5);

        i5 /=2;
        System.out.println(i5);

        i5 %=2;
        System.out.println(i5);

        i5 ++;
        System.out.println(i5);

        i5--;
        System.out.println(i5);

        ++i5;
        System.out.println(i5);

        --i5;
        System.out.println(i5);

    }
}
