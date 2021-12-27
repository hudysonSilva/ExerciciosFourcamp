package ExerciciosLogica;/*
Crie um programa para que receba do usuário o idade,
altura e peso e exiba no console
 */
import java.util.Scanner;
public class Ex7 {
    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);
        int idade;
        float altura;
        float peso;

        System.out.println("Digite idade :");
        idade = Scan.nextInt();
        System.out.println("Digite Altura :");
        altura = Scan.nextFloat();
        System.out.println("Digite peso :");
        peso = Scan.nextFloat();
        System.out.println("Idade :"+idade+"\nAltura :"+altura+"\nPeso :"+peso);


    }
}
