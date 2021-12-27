package LacosRepeticao;/*
4.	Crie um programa que leia várias idades e calcule a média entre elas. Caso a maioria seja maior de 18 anos,
 o console deve mostrar “Aqui tem mais adultos”, se contrário, mostrar outra mensagem*/
import java.util.Scanner;

public class lacos04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade;
        int media = 0;

        System.out.println("Digite a quantidade de pessoas :");
        quantidade = scan.nextInt();
        int[] idade = new int[quantidade];                              //

        for(int i = 1; i <= quantidade; i ++) {
            System.out.printf("Digite a idade da %dª pessoa", i);
            idade[i-1] = scan.nextInt();
            media =  idade[i-1]+media;
        }
        media = media/quantidade;
        if(media >= 18) {
            System.out.printf("Aqui tem mais adultos");
        }
        else{
            System.out.printf("A media de idade é %d, não tem muitos adultos por aqui", media);
        }
    }
}

