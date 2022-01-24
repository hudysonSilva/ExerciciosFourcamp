package utils;
import java.util.Scanner;

public class Utils {

    public void bubleSort(int[] vetor) {
        int organizador;
        int i;


        for (i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    organizador = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = organizador;
                }
            }
        }
        ;
    }

    public double media() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos a ser feita a media :");
        double elementos = scan.nextInt();
        double media = 0;
        for (int i = 1; i <= elementos; i++) {
            System.out.printf("Digite o %dº Elemento :", i);
            media = media + scan.nextFloat();
        }
        media = media/elementos;
        return media;
    }


    public String lerSring() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
    public int lerInteiro() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }

    public double lerDouble() {
        Scanner scan = new Scanner(System.in);
        double dbl = scan.nextDouble();
        return dbl;
    }
}
