/*
8. Faça   um   Programa   que
-peça   a   idade   e   a   altura   de   5   pessoas,
-armazene   cada  informação  no   seu   respectivo   vetor.
-Imprima   a   idade  e   a   altura   na   ordem   inversa   a ordem lida.
chato :/
 */
package ExercicioVetores02;
import java.util.Scanner;
public class Vetor08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int                              quantidadePessoa = 3;

        int     [] idade    = new int   [quantidadePessoa];
        double  [] altura   = new double[quantidadePessoa];

        for(int i = 0; i < quantidadePessoa; i++){
            System.out.println("Digite idade :");
            idade[i] = scan.nextInt();
            System.out.println("Digite altura :");
            altura[i] = scan.nextInt();
        }
        //quantidadedePessoa = 3 porem o contador tem q ser 2
        for(int i = (quantidadePessoa-1); i >= 0 ; i--){
            System.out.printf("\nidade %d altura %.2f",idade[i],altura[i]);
        }



    }
}