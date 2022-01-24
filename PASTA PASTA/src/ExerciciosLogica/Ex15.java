package ExerciciosLogica;/*
Crie um programa para ler um valor (do teclado) e escrever (na tela) o seu antecessor
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex15 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero para saber sue antecessor :");
        numero = Scan.nextInt();
        System.out.println("Seu antecessor é :"+(numero-1));

    }

}
