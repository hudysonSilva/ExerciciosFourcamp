/*
3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */
package ExercicioVetores02;
import java.util.Scanner;
public class Vetor03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeDeNotas = 4;
        double[] nota = new double[quantidadeDeNotas];
        double media = 0;

        System.out.println("Digite 4 notas para media");

        for(int i = 0 ;i < nota.length;  i++ ){
            System.out.printf("Digite a %dª nota:", (i+1));
            nota[i] = scan.nextDouble();
            media = media + nota[i];
        }
        for(int i = 0 ;i < nota.length;  i++ ){
            System.out.printf("\n%dª Nota %.2f",(i+1) ,nota[i]);
        }
        System.out.println("\n Media :"+(media/nota.length));



    }
}