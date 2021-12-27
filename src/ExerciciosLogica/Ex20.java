package ExerciciosLogica;/*
Crie um programa para converter uma quantidade de
dólar para real;
• O usuário deve informar o valor em dólar;
• O programa deve converter esse valor em reais, exibindo a mensagem com o valor convertido;
• DÓLAR: R$ 6.61;
 */

import java.util.Scanner;
import java.lang.Math;
public class Ex20 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        float dolar = 6.61f;
        float valor = 0;

        System.out.println("Digite o Valor de reais a ser convertida em dolar :");
        valor = Scan.nextFloat();
        System.out.println("O valor em dolar é :"+(valor/dolar));
        System.out.println("Digite o Valor de Dolar a ser convertida em Real :");
        valor = Scan.nextFloat();
        System.out.println("O valor em Real é :"+(valor*dolar));






    }
}
