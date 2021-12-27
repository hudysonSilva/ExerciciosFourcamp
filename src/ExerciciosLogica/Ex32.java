package ExerciciosLogica;/*
A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e
garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para
calcular quantos litros de refrigerante ele comprou.

 */
import java.util.Scanner;
import java.lang.Math;
public class Ex32
        {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float lata350 = 0.350f;
        float qtdLata350;
        float pet600 = 0.600f;
        float qtdPet600;
        float pet2L  = 2;
        float qtdPet2L;
        float litros;

        System.out.println("Digite a quantidade de latas compradas: ");
        qtdLata350 = Scan.nextFloat();
        System.out.println("Digite a quantidade de Garrafas 600ml: ");
        qtdPet600 = Scan.nextFloat();
        System.out.println("Digite a quantidade de Garrafas 2L: ");
        qtdPet2L = Scan.nextFloat();
    }
}
