package ExerciciosLogica;/*
Entrar com o dia e o mês de uma data e informar
quantos dias se passaram desde o início do ano. Esqueça a
questão dos anos bissextos e considere sempre que um mês
possui 30 dias.
 */
import java.util.Scanner;
import java.lang.Math;
public class Ex26 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int dia;
        int mes;
        for (dia = 0; dia < 1 || dia > 30; dia = dia) {
            System.out.println("Digite dia no formato \"00\"");
            dia = Scan.nextInt();
            if (dia < 1 || dia > 30) {
                System.out.println("Dia invalido digite novamente");
            }
            for (mes = 0; mes < 1 || dia > 12; mes = mes) {
                System.out.println("Digite mês  00");
                mes = Scan.nextInt();
                if (mes < 1 || mes > 12) {
                    System.out.println("Mês invalido digite novamente");
                }

                System.out.println("Dêsde o começo do ano se passaram :"+(dia+(mes*30)));
            }


        }
    }
}
