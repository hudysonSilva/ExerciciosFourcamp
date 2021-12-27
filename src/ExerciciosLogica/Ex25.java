package ExerciciosLogica;/*
Um motorista deseja colocar no seu tanque X reais de
gasolina. Escreva um programa para ler o preço do litro da
gasolina e o valor do pagamento, e exibir quantos litros ele
conseguiu colocar no tanque.
 */
import java.util.Scanner;
import java.lang.Math;
public class Ex25 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        float valorG;
        float valorPago;

        System.out.println("Digite o valor da Gasolina :");
        valorG = Scan.nextFloat();
        System.out.println("Digite o valor Pago");
        valorPago = Scan.nextFloat();

        System.out.println("A quantidade em litros abatecida é:"+(valorPago/valorG));


    }
}
