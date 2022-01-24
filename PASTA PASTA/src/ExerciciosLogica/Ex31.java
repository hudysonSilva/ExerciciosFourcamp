package ExerciciosLogica;/*
A granja Frangotech possui um controle automatizado
de cada frango da sua produção. No pé direito do frango há
um anel com um chip de identificação; no pé esquerdo são
dois anéis para indicar o tipo de alimento que ele deve
consumir. Sabendo que o anel com chip custa R$4,00 e o
anel de alimento custa R$3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus
frangos

 */
import java.util.Scanner;
import java.lang.Math;
public class Ex31 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float chipAl = 3.50f;
        float chipId = 4;
        float totalPf = (2*chipAl)+chipId;
        int frango;

        do {
            System.out.println("Digite a quantidade de animais :");
            frango = Scan.nextInt();
        }while(frango < 0);
        System.out.println("Você ira precisar de:");
        System.out.println((frango*2)+" Chips de alimentação");
        if(frango >= 2) {
            System.out.println((frango) + " Chips de Identificação");
        }
        if(frango < 2) {
        System.out.println((frango) + " Chip de Identificação");
    }
    }
}
