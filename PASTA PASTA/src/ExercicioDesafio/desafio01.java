/*
1.	Três candidatos concorreram a uma eleição (A, B, C). O usuário deve informar
- quantos votos cada candidato recebeu,
- quantos foram os votos brancos e quantos foram os votos nulos.
- O algoritmo deve calcular e informar:
    o número total de eleitores
    o percentual de votos que cada candidato recebeu (em relação ao número total de eleitores)
    o percentual de brancos e o percentual de nulos.
 */
package ExercicioDesafio;
import java.util.Scanner;
public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //►Inserir quantidade de eleitores
        int quantidadeEleitores;
        //Rodar matris pra  candidato 1 2 3
        int a =0;
        int b =0;
        int c =0;
        int candidatos[] = {a, b, c};



        System.out.print("\nDigite a quantidade de Eleitores :");
        quantidadeEleitores = scan.nextInt();
        System.out.println();
        //matriz pra quantidade de eleitores
        int eleitores[] = new int[quantidadeEleitores];
        for (int i=0; i<=(eleitores.length-1);i++){
            do {

                System.out.printf("\nVocê é o %dº Candidato digite seu voto :", (i+1));
                eleitores[i] = scan.nextInt();
                if ( eleitores[i] < 1 || eleitores[i] > 3 ){
                    System.out.println("Candidato não existe digite novamente ");
                }

            }while( eleitores[i] < 1 || eleitores[i] > 3 );
        }

    }
}
