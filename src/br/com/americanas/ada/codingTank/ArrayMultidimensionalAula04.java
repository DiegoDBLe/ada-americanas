package br.com.americanas.ada.codingTank;

import java.util.Random;
import java.util.Scanner;

public class ArrayMultidimensionalAula04 {
	
	/*
	    * Crie uma matriz quadrada de inteiros com o tamanho informado pelo usuario e atribua valores numéricos
	    * aleatorios pelo usuario
	    * */
	    public static void main(String[] args) {

	        /// Arraymultidimensional[][]
	        //  int arrayMultidimensiona[][] = new int [2][2];
	        Scanner sacanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Informe o tamanho da matriz: ");
	        int arrayMultidimensiona[][] = new int[sacanner.nextInt()][sacanner.nextInt()];

	        for (int linha =0; linha < arrayMultidimensiona.length; linha++){
	            for (int coluna = 0; coluna < arrayMultidimensiona[linha].length; coluna++){
	                arrayMultidimensiona[linha][coluna] = random.nextInt(9);
	                System.out.print(arrayMultidimensiona[linha][coluna] + " ");
	            }
	            System.out.println();
	        }
	        
	        sacanner.close();
	    }

}
