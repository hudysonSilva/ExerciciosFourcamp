package ExerciciosLogica;/*
Três amigos, Carlos, André e Felipe. decidiram rachar
igualmente a conta de um bar. Faça um programa para ler
o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.

 */
import java.util.Scanner;
import java.lang.Math;
public class Ex28 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float valorSemCentavos; //essa é ►sem sentavos
        float valorComCentavos; //essa é ►COM os centavos
        int qtdPessoas;
        float conta, conta1;
        do {
            System.out.println("Digite o valor da conta :");
            conta = Scan.nextFloat();
        }while (conta < 0);
        do {
            System.out.println("Digite a quantidade de pessoas a pagar :");
            qtdPessoas = Scan.nextInt();
            conta1 = (conta / qtdPessoas);
        }while(qtdPessoas < 1 );
        valorSemCentavos = conta1 -(conta1 % 1);
        valorComCentavos = conta1 -(conta1 % 1) + ((conta1 % 1)*qtdPessoas);

        for(int i = 1; i <= (qtdPessoas-1);i++){
            System.out.println("A "+i+"ª Pessoa pagará R$"+valorSemCentavos);
        }
        System.out.println("A ultima pessoa pagará R$"+Math.round(valorComCentavos));
    }
}
