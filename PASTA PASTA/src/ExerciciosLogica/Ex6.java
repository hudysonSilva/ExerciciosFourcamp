package ExerciciosLogica;/*
Crie um programa para que receba do usuário o nome,
celular e cidade e exiba no console;
 */

import java.util.Scanner;
public class Ex6 {

    public static void main (String []args){
        Scanner Scan = new Scanner(System.in);
        String nome;
        String cidade;
        int celular;
        System.out.println("Digite nome :");
        nome = Scan.nextLine();
        System.out.println("Digite Cidade :");
        cidade = Scan.nextLine();
        System.out.println("Digite Celular :");
        celular = Scan.nextInt();
        System.out.println("Nome:"+nome+" \nCidade :"+ cidade +" \nCelular :");


    }
}
