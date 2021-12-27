package Fluxocondicional;/*
2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou
não votar este ano (não é necessário considerar o mês em que ela nasceu).
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int ano;
        int anoatual = 2021;

        System.out.println("digite o ano do seu nascimento (formato 0000) :");
        ano = Scan.nextInt();

        ano = anoatual-ano;
        if (ano >=16) {
            System.out.println("Você ja pode votar só não vota bo bozo");
        }
        else{
            System.out.println("Você ainda nao pode votar... adolecente nem é gente");
        }




    }
}
