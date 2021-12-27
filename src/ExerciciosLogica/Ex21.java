package ExerciciosLogica;/*
O custo de um carro novo ao consumidor é a soma do
custo de fábrica com a porcentagem do distribuidor e dos
impostos (aplicados ao custo de fábrica). Supondo que o
percentual do distribuidor seja de 28% e os impostos de
45%, crie uma programa para ler o custo de fábrica de um
carro, calcular e escrever o custo final ao consumidor
 */

import java.util.Scanner;
import java.lang.Math;
public class Ex21 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        float custoCarro = 0;
        float custoFabrica = 28;
        float custoImposto = 45;

        System.out.println("Digite o valor do carro :");
        custoCarro = Scan.nextFloat();
        System.out.println("O custo total do carro é :"+(custoCarro*(1+((custoFabrica+custoImposto)/100))));

    }
}
