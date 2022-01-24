package ExerciciosLogica;/*
Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por
10, 12 e 15 reais. Construa um programa em que o usuário forneça a quantidade de camisetas pequenas, médias e
grandes referentes a uma venda, e a máquina informe quanto será o valor arrecadado
 */
import java.util.Scanner;
import java.lang.Math;
public class Ex27 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        float camisaP;
        float valorP = 10;
        float camisaM;
        float valorM = 12;
        float camisaG;
        float valorG = 15;

        do  {
        System.out.print("Digite a quantidade de camisas P vendidas :");
        camisaP = Scan.nextFloat();
        System.out.print("Digite a quantidade de camisas M vendidas :");
        camisaM = Scan.nextFloat();
        System.out.print("Digite a quantidade de camisas G vendidas :");
        camisaG = Scan.nextFloat();
        if(camisaP <0 || camisaM <0 || camisaG <0 ){
            System.out.println("O valor vendido não pode ser menor que 0\nDigite novamente");
            }
        } while(camisaP < 0 || camisaM <0 || camisaG <0);

        System.out.println("O valor total vendido foi :"+((camisaP*valorP)+(camisaM*valorM)+(camisaG*valorG)));

    }
}
