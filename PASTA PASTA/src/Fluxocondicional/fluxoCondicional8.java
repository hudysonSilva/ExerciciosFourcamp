package Fluxocondicional;/*
8. Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional8 {
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

            if (apcao <= 2){
                System.out.print("\nNão é um poligono.");
            }
            else if (apcao > 5){
                System.out.print("\nPoligono não identificado.");
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
