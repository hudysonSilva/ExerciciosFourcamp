package ExerciciosLogica;/*
Crie um programa declarando uma variável do tipo
String chamada nome, outra chamada celular e outra chamada cidade, atribua um valor para todas as variáveis e
exiba o resultado no console;
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex4 {

    public static void main (String[] args){
        String nome;
        int celular;
        Scanner     Scan = new Scanner(System.in);
        Scanner     Scan2 = new Scanner(System.in);
        System.out.println("Digite Ceulular");
        celular =   Scan.nextInt();
        System.out.println("Digite nome");
        nome =      Scan2.nextLine();
        System.out.println("Nome:"+celular+"Celular"+nome);


    }
}
