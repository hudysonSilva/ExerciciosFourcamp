package ExerciciosFixacao;

import java.util.Scanner;
public class Exercicio3Java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos a ser feita a media :");
        double elementos = scan.nextInt();
        double media = 0;
        for (int i = 1; i <= elementos; i++) {
            System.out.printf("Digite o %dº Elemento :", i);
            media = media + scan.nextFloat();
        }
        media = media/elementos;
    }
}