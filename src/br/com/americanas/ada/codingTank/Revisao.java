package br.com.americanas.ada.codingTank;

public class Revisao {
	
	 public static void main(String[] args) {

	        int [] arrayInteiros = new int[]{1,2,3};

	        for (int i = 0; i < arrayInteiros.length; i++){
	            System.out.println(arrayInteiros[i]);
	        }

	        for (int inteiro : arrayInteiros) {
	            System.out.print(inteiro + " ");
	        }

	        int[][] matriz = new int[3][3];
//	        matriz[0] = new int[5];
//	        matriz[1] = new int[4];

	        for (int[] array: matriz) {
	            for(int i = 0; i < array.length; i++){
	                System.out.print(array[i]);
	            }
	            System.out.println();
	        }
	    }

}
