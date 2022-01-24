package ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio2Java {
    public static void main(String[] args) {

        /*
        2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino,
        feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
        a. a maior e a menor altura do grupo;
        b. a média de altura dos homens;
        c. o número de mulheres.
        */
            Scanner Scan = new Scanner(System.in);
            Scanner Scan1 = new Scanner(System.in);
            double maior =0.0;
            double menor =3.5;
            double alturaMediaMasculina = 0;
            int quantidadeDeHomen = 0;
            int i ;
            int feminino = 0;
            String[] sexo = new String[4];
            double[] altura = new double[4];

            //Insersão de dados dentro do for
            for( i = 1; i <= 3; i++){
                do {
                    System.out.println("Digite a altura da " + i + "ª Pessoa :");
                    altura[i] = Scan.nextDouble();//colocando alturas
                    if(altura[i] <=0){
                        System.out.println("Alturas menores que 0 não podem ser distinguidas por criaturas tridimensionais digite a altura de uma criatura tridimensional");
                    }
                    if(altura[i] >=3.50){
                        System.out.println("Girafas não são permitidas digite a altura de um humano");
                    }
                }while(altura[i] <=0 || altura[i]>=3.5);
                if (altura[i] > maior) {
                    maior = altura[i]; //Descobre maior altura dos Homens
                    System.out.println(maior);
                }
                if (altura[i] < menor) {
                    menor = altura[i]; //Descobre menor altura dos Homens
                }
                do {
                    System.out.println("Digite o Sexo (sexo biologico apenas M ou F) da " + i + "ª Pessoa :");
                    sexo[i] = Scan1.nextLine();     //Recebe sexo F ou M
                    if(sexo[i].equals ("M")){       //
                        sexo[i] = "m";              //
                    }                               //
                    if(sexo[i].equals ("F")) {      //Aqui transforma "F" e "M" em "f" e "m"
                        sexo[i] = "f";              //
                    }                               //
                    else {
                        System.out.println("Caractere invalido digite novamente");
                    }
                }while(!sexo[i].equals("f") && !sexo[i].equals("m"));

                if(sexo[i].equals("f") ){ //Descobre quantidade de mulheres
                    feminino = (feminino+1);
                }
                if(sexo[i].equals("m")) {
                    alturaMediaMasculina = alturaMediaMasculina+altura[i];
                    quantidadeDeHomen = quantidadeDeHomen+1;
                }
            }

            System.out.println("A maior pessoa do grupo é :"+maior); //mostra a maior altura
            System.out.println("A menor pessoa do grupo é :"+menor); //mostra a menor altura
            System.out.println("A media de altura dos Homens é :"+(alturaMediaMasculina/(quantidadeDeHomen))); //Calcula e mostra media de altura dos homens
            System.out.println("A quantidade de pessoas com sexo Feminino é :"+feminino); //Nostra quantidade de mulheres
        }

}
