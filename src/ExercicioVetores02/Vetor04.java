/*

    4. Faça  um  Programa que  leia  um   vetor  de  10   caracteres, e  diga  quantas  lidas. Imprima as consoantes.

 */
package ExercicioVetores02;
import java.util.Scanner;
public class Vetor04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] letra = new char[]{'a', 'e', 'i', 'o', 'u', 'p', 'q', 'r', 's','t'};
        int leitura = letra.length;

        for(int i = 0; i < letra.length;i ++){
            if (letra[i] == 'a' || letra[i] == 'e' || letra[i] == 'i' || letra[i] == 'o'  || letra[i] == 'u' ){
            }
            else{
                System.out.printf("\nA %dª Letra do vetor é uma consoante letra :%c",(i+1) , letra[i]);
            }
        }
    }
}