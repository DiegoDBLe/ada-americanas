package codingTank;

import java.util.Scanner;

public class LosanguloExercicioFaculdade {
	
	  // Exercício Faculdade Estácio Java (feito em Python)
    // Programa de impressão de losangos de acordo com entrada do usuário

     public static void main( String[] args )
     {
         Scanner entrada = new Scanner( System.in );

         System.out.print( "Digite um número ímpar entre  1 a 19: " );
         int d = entrada.nextInt();
         int aux = 1;

         // Faz um tratamento para aceitar somente números ímpares entre 1 a 19
         while( ( d % 2 == 0 ) || ( d < 1 ) || ( d > 19 ) )
         {
             System.out.print( "ERRO. Digite um número ímpar entre  1 a 19: " );
             d = entrada.nextInt();

         } // fim do tratamento - loop while

         for(
                 int i = 1; i <= (d/2)+1; i++) //contador de linhas
         {
             for( int j = (d/2)+1; j > i; j-- ) //contador de espaços
                 System.out.print( " " );
             for( int k = 1 ; k <= aux; k++ ) //contador de asteriscos
                 System.out.print( "*" );
             aux += 2;
             System.out.println();
         }

         aux -= 2;

         for( int i = 1; i <= (d/2); i++ ) //contador de linhas
         {
             for( int j = 1; j <= i; j++ ) //contador de espaços
                 System.out.print( " " );

             aux -= 2;

             for( int k = 1 ; k <= aux; k++ ) //contador de asteriscos
                 System.out.print( "*" );
             System.out.println();
         }

         entrada.close();
     }

}
