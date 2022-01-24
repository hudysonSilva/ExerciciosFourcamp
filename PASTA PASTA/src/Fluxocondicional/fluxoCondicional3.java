package Fluxocondicional;/*
3. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234.
Devem ser impressas as seguintes mensagens:
--ACESSO PERMITIDO caso a senha seja válida.
--ACESSO NEGADO caso a senha seja inválida.
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int senha;

        System.out.println("Digite senha:");
        senha = Scan.nextInt();

        if(senha == 1234){
            System.out.println("Acesso Permitido");
        }
        else{
            System.out.println("Acesso negado");
        }
    }
}
