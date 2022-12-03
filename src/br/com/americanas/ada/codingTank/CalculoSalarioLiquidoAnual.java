package br.com.americanas.ada.codingTank;

import java.text.DecimalFormat;
import java.util.Scanner;

//Enunciar
// Um funcionário deseja saber qual o valor líquido anual que recebe da sua empresa. Para tal cálculo é necessário considerar
// que o funcionário recebe o salário + décimo terceiro + férias e não esqueça de considerar o desconto do inss, não vamos trabalhar
// com imposto de renda nesse momento.
// O inss tem desconto com base no valor mensal que o funcionário recebe e para isso vamos utilizar a regra a seguir:
//     de 0 até 1212.00 -> 7,5%.
//     de 1212.01 até 2427,35 -> 9%.
//     de 2427,36 até 3641,03 -> 12%.
//     de 3641,04 até 7087,22 -> 14%.
//     acima de 7087,22 deve ser descontado o teto de 900 reais.
//
//  O resultado final apresentado ao funcionário deve ter o salário anual bruto, total anual de inss descontado e o salário anual líquido final.

public class CalculoSalarioLiquidoAnual {
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do Salario: R$ ");
        double salario = scanner.nextDouble();

        String padrao = "###,###.00";
        DecimalFormat df = new DecimalFormat(padrao);

        int qtdaMessesAno = 13;
        double txSeteEMeioPorcento = (7.5 * salario) / 100;
        double txNovePorcento = (9.0 * salario) / 100;
        double txDozePorcento = (12.0 * salario) / 100;
        double txQuatorzePorcento = (14.0 * salario) / 100;

        double salarioLiquido;
        double descTotalAnualInss;
        double valorFerias = (salario / 3) + salario;
        double salarioAnualBruto = (salario * qtdaMessesAno) + (valorFerias);

        if (salario <= 1212.0) {
            salario -= txSeteEMeioPorcento;
            descTotalAnualInss = qtdaMessesAno * txSeteEMeioPorcento;
            salarioLiquido = salario * qtdaMessesAno;
            System.out.println("Salario Anual Bruto : R$ " + df.format(salarioAnualBruto) +
                    "\nTotal Anual do Inss Descontado: R$ " + df.format(descTotalAnualInss) +
                    "\nSalário Anual Líquido Final: R$ " + df.format(salarioLiquido + valorFerias) +
                    "\nsalario Líquido mensal com desconto de 7,5% do INSS: R$ " + df.format(salario) +
                    "\nValor das Férias R$ " + df.format(valorFerias));
        } else if (salario >= 1212.1 && salario <= 2427.35) {
            salario -= txNovePorcento;
            descTotalAnualInss = qtdaMessesAno * txNovePorcento;
            salarioLiquido = salario * qtdaMessesAno;
            System.out.println("Salario Anual Bruto : R$ " + df.format(salarioAnualBruto) +
                    "\nTotal Anual do Inss Descontado: R$ " + df.format(descTotalAnualInss) +
                    "\nSalário Anual Líquido Final: R$ " + df.format(salarioLiquido + valorFerias) +
                    "\nsalario Líquido mensal com desconto de 9% do INSS: R$ " + df.format(salario) +
                    "\nValor das Férias R$ " + df.format(valorFerias));
        } else if (salario >= 2427.36 && salario <= 3641.03) {
            salario -= txDozePorcento;
            descTotalAnualInss = qtdaMessesAno * txDozePorcento;
            salarioLiquido = salario * qtdaMessesAno;
            System.out.println("Salario Anual Bruto : R$ " + df.format(salarioAnualBruto) +
                    "\nTotal Anual do Inss Descontado: R$ " + df.format(descTotalAnualInss) +
                    "\nSalário Anual Líquido Final: R$ " + df.format(salarioLiquido + valorFerias) +
                    "\nsalario Líquido mensal com desconto de 12% do INSS: R$ " + df.format(salario) +
                    "\nValor das Férias R$ " + df.format(valorFerias));
        } else if (salario >= 3641.04 && salario <= 7087.22) {
            salario -= txQuatorzePorcento;
            descTotalAnualInss = qtdaMessesAno * txQuatorzePorcento;
            salarioLiquido = salario * qtdaMessesAno;
            System.out.println("Salario Bruto Anual: R$ " + df.format(salarioAnualBruto) +
                    "\nTotal Anual de Inss Descontado: R$ " + df.format(descTotalAnualInss) +
                    "\nSalário Anual Líquido Final: R$ " + df.format(salarioLiquido + valorFerias) +
                    "\nSalario Líquido mensal com desconto de 14% do INSS: R$ " + df.format(salario) +
                    "\nValor das Férias R$ " + df.format(valorFerias));
        } else {
            salario -= 900;
            descTotalAnualInss = qtdaMessesAno * 900;
            salarioLiquido = salario * qtdaMessesAno;
            System.out.println("Salario Bruto Anual: R$ " + df.format(salarioAnualBruto) +
                    "\nTotal Anual de Inss Descontado: R$ " + df.format(descTotalAnualInss) +
                    "\nSalário Anual Líquido Final: R$ " + df.format(salarioLiquido + valorFerias) +
                    "\nO salario mensal com desconto máximo(teto) do INSS: R$ " + df.format(salario) +
                    "\nValor das Férias R$ " + df.format(valorFerias));
        }
        
        scanner.close();
    }

}
