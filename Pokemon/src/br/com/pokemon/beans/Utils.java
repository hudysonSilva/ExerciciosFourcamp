package br.com.pokemon.beans;

import java.util.Scanner;

public class Utils {

    public String[] lerVetor(int tamanhoDoVetor){
        String[] vetor = new String[tamanhoDoVetor];
        for(int i = 0;i < vetor.length;i++){
            lerSring("%dª posição do vetor:");
        }
        return vetor;
    }

    public String lerSring(String nomeDaVariavel) {
        System.out.print("Digite "+nomeDaVariavel+" :");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
    public int lerInteiro(String nomeDaVariavel) {
        System.out.print("Digite "+nomeDaVariavel+" :");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }

    public double lerDouble(String nomeDaVariavel) {
        System.out.print("Digite "+nomeDaVariavel+" :");
        Scanner scan = new Scanner(System.in);
        double dbl = scan.nextDouble();
        return dbl;
    }

}
