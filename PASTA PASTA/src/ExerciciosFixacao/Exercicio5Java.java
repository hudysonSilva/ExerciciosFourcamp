package ExerciciosFixacao;

import java.util.Scanner;
public class Exercicio5Java {
    public static void main(String[] args) {
        /*
        5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A,
        em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
        Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio.
        Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o
        resultado do volume encontrado
         */
        Scanner Scan = new Scanner(System.in);
        double volume;
        double raio;
        double altura;
        double pi=3.14159;

        System.out.print("Digite o raio da lata:");
        raio = Scan.nextDouble();
        System.out.print("Digite a altura da lata da lata:");
        altura = Scan.nextDouble();
        volume = pi * raio * raio * altura;
        System.out.println(pi+" * "+raio+" * "+raio+" * "+altura+" = "+volume);

    }
}
