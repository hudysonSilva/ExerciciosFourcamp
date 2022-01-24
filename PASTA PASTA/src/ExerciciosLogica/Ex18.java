package ExerciciosLogica;/*
18 Exercicio 18
Crie um programa para ler o número total de eleitores
de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores
 */

import java.util.Scanner;
import java.lang.Math;
public class Ex18 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        float total;
        float votoValido;
        float votoBranco;
        float votoNulo;


        System.out.printf("Digite o total de Votos Validos :");
        votoValido = Scan.nextInt();
        System.out.printf("Digite o total de Votos em Brancos :");
        votoBranco = Scan.nextInt();
        System.out.printf("Digite o total de Votos Nulos :");
        votoNulo = Scan.nextInt();

        total =((votoValido/((votoBranco + votoValido + votoNulo)/100))) ;
        System.out.println("Os votos Validos Representam "+total+"% dos Votos");
        total = (votoBranco/((votoBranco + votoValido + votoNulo)/100));
        System.out.println("Os votos em Branco Representam "+total+"% dos Votos");
        total = (votoNulo/((votoBranco + votoValido + votoNulo)/100));
        System.out.println("Os votos Nulos Representam "+total+"% dos Votos");

    }
}
