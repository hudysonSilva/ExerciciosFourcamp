package LacosRepeticao;/*
8.	Crie um programa para ler 3 notas inseridas por um aluno e mostrar a média delas. Caso a média seja menor que 6.0,
o console deverá constar sua média + a mensagem de reprovado. Se maior ou igual, conste sua média + mensagem de aprovação.
*/
import java.util.Scanner;
public class lacos08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media;
        double nota = 0;
        System.out.println("Digite as 3 notas do aluno");
        for(int i = 1; i <=3 ; i++){
            System.out.printf("Digite a %dª nota do aluno :", i);
            nota = nota+scan.nextInt();

        }

        media = nota/3;
        if(media < 6) {
            System.out.printf("\nSua media é :%.2f\n Você foi reprovado", media);
        }
        else {
            System.out.printf("\nSua media é :%.2f\n Você foi Aprovado", media);
        }

    }}