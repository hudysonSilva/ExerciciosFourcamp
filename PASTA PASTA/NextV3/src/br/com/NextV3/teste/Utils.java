package br.com.NextV3.teste;

import java.util.Scanner;

public class Utils {

    public String lerSring(String nomeDaVariavel) {
        System.out.print(nomeDaVariavel);
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
    public int lerInteiro(String nomeDaVariavel) {
        System.out.print(nomeDaVariavel);
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }

    public double lerDouble(String nomeDaVariavel) {
        System.out.print(nomeDaVariavel);
        Scanner scan = new Scanner(System.in);
        double dbl = scan.nextDouble();
        return dbl;
    }

}
