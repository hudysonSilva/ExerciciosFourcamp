package ExercicioVetores01;
import java.util.Scanner;
public class Vetor02 {
    /*
    2.	Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes, e que exiba a lista desses nomes na tela.
        Após exibir essa lista, o programa deve mostrar também os nomes na ordem inversa em que o usuário os digitou,
        um por linha.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nome = new String[5];
        System.out.println(nome.length);
        System.out.printf("\nDigite %d nomes a seguir", nome.length);
        System.out.println();

        for(int i = 0; i < nome.length;i++){
            System.out.printf("Digite o %dº nome :", (i+1));
            nome[i] = scan.nextLine();
        }
        for(int i = 0; i < nome.length;i++){
            System.out.printf("\nO %dº Nome :%s", (i+1), nome[i]);
        }
        System.out.println();
        for(int i = nome.length-1; i >= 0 ;i--){
            System.out.printf("\nO %dº nome é %s", (i+1) , (nome[i]));
        }
    }
}
