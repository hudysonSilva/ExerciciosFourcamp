package ExerciciosFixacao;

import java.util.Scanner;
public class Exerrcicio1Java {
    public static void main(String[] args) {

        /*
        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
        Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15;
        Re = C * 0.8; Ra = C * 1.8 + 32 + 459.6
         */

        Scanner Scan = new Scanner(System.in);

        double celcius;
        double kelvin;
        double reaumur;
        double rankine;
        double fahrenheit;


        System.out.print("Digite a temperatura em celcius:");
        celcius = Scan.nextDouble();

        kelvin =        celcius + 273.15;
        reaumur =       celcius * 1.8 + 32 + 459.6;
        rankine =       celcius * 1.8;
        fahrenheit =    celcius * 1.8 + 32;

        System.out.print("\nEsses são os valores das temperaturas convertidas ;" +
                "\nkelvin       :" + kelvin +
                "\nreaumur      :" + reaumur +
                "\nrankie       :" + rankine +
                "\nfahrenheit   :"+ fahrenheit);

    }
}
