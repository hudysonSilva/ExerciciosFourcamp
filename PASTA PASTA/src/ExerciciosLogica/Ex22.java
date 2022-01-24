package ExerciciosLogica;/*

Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma
comissão também fixa para cada carro vendido e mais 5%
do valor das vendas por ele efetuadas. Crie um programa
que leia o número de carros por ele vendidos, o valor total
de suas vendas, o salário fixo e o valor que ele recebe por
carro vendido. Calcule e escreva o salário final do vendedor

 */
import java.util.Scanner;
import java.lang.Math;
public class Ex22 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        float salario = 1000;
        float comissao = 5;
        float salarioComissao;

        System.out.println("Digite o valor total de veiculos vendidos:");
        salarioComissao = Scan.nextFloat();
        System.out.println("O seu salario + comissão é :"+(salario+(salarioComissao*(comissao/100))));

    }
}
