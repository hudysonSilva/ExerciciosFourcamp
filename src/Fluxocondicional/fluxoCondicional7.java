package Fluxocondicional;/*
7. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o seguinte:
− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
− Se o número de lados for igual a 5 escrever PENTÁGONO.
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int apcao = 0;
        double tamanho;
        double area = 0;
        int i;
        do {
            System.out.print("Digite a quantidade de lados :" +
                    "\n− 3 Para TRIÂNGULO e o valor da área." +
                    "\n− 4 Para QUADRADO e o valor da sua área." +
                    "\n− 5 Para PENTÁGONO." +
                    "\n- DIGITE UMA DAS OPÇÕES :");
                    apcao = scan.nextInt();

                    if (apcao <= 2 || apcao > 5 ){
                         System.out.print("\nOpção não existe digite novamente.");
                    }
        }while(apcao <= 2 || apcao >5 );


        for( i = 1; i <= apcao;i++){
            System.out.printf("\nDigite o tamanho do %dº Lado :", i);
            tamanho = scan.nextDouble();
            area = tamanho+area;

        }

        switch (apcao){
            case 3:   System.out.printf("Triangulo e sua area é %.2f", area); break;
            case 4:   System.out.printf("Retangulo e sua area é %.2f", area); break;
            case 5:   System.out.printf("Pentagono e sua area é %.2f", area); break;
        }
    }
}
