package LacosRepeticao;/*
1.	Escreva um programa para exibir os números de 1 até 50 na tela.
Faça com que os números estejam sequenciados ne mesma linha e tenham espaçamento entre si.
 */
import java.util.Scanner;

public class lacos01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0;i <=50; i++){
            System.out.printf("%d, ", i);
        }

    }
}
