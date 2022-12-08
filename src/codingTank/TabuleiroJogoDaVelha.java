package br.com.americanas.ada.codingTank;

public class TabuleiroJogoDaVelha {
	
	public static void main(String[] args) {

        int[][] tabuleiro= new int[3][3];

        System.out.println();
        for(int linha=0 ; linha<3 ; linha++){

            for(int coluna=0 ; coluna<3 ; coluna++){

                if(tabuleiro[linha][coluna]==-1){
                    System.out.print(" X ");
                }
                if(tabuleiro[linha][coluna]==1){
                    System.out.print(" O ");
                }
                if(tabuleiro[linha][coluna]==0){
                    System.out.print("   ");
                }
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
    }

}
