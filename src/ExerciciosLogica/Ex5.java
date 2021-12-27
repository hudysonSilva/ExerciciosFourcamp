package ExerciciosLogica;/*
Crie um programa declarando uma variável do tipo int
chamada idade, outra chamada altura e outra peso, ambas
do tipo double, atribua um valor para todas as variáveis e
exiba o resultado no console;
 */
import java.util.Scanner;
public class Ex5 {
   public static void main (String[] args){
       Scanner Scan = new Scanner(System.in);
       Scanner Scan2 = new Scanner(System.in);
       int idade;
       float altura;
       float peso;
       System.out.println("Digite sua idade :");
       idade = Scan.nextInt();
       System.out.println("Digite sua altura :");
       altura = Scan2.nextFloat();
       System.out.println("Digite seu peso :");
       peso = Scan.nextFloat();
       System.out.println("Nome: "+ idade+"\nAltura :"+ altura+"\nPeso :" +peso);
   }
}
