package Fluxocondicional; /*
9. Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
Considere que o usuário não informará valores iguais.
 */
import java.util.Scanner;
import java.lang.Math;
    public class fluxoCondicional9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double valor[] = new double[4];
            boolean teste = false;
            double maior = 0;

            System.out.println("digite 3 valores diferentes");


            for (int i = 1 ; i<=3 ;i++){                                                    //PREENCHE A MATRIZ
                do{
                System.out.printf("Digite o %dº Valor :", i);
                valor[i] = scan.nextDouble();

                    if (valor[i] > maior) {                             //atribui o maior   //
                        maior = valor[i];                                                   //
                    }                                                                       //
                                                                                            //
                if (i  > 1){                                                                // daqui
                    for(int j = 1; j < i; j++) {                                            //
                                                                                            //
                        if (valor[i] == valor[j]) {                                         //
                            System.out.printf("\nO %dº valor é igual ao %dº valor", i, j);  //
                            teste = true;                                                   //
                        }                                                                   //
                        else if(valor[i] != valor[j-1]){                                    //
                            teste = false;                                                  //
                        }                                                                   //
                    }                                                                       //
                }                                                                           //
                                                                                            //
            }while(teste == true);                                                          // até aqui valida se os valores imputados são iguais


            }
            System.out.printf("O maior valor é valor %.2f", maior);
        }
    }

