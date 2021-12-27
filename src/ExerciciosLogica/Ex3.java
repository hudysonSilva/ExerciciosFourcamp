package ExerciciosLogica;

import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;

public class Ex3 {
    public static void main (String[]args){
        Scanner Scan = new Scanner(System.in);
        //Print solicited name 15 times
        System.out.println("\nInsert a name :");
        String name =
                Scan.nextLine();
        for(int i = 1; i<= 15; i++){
            System.out.println("The chosed name was :"+ name);
        }
    }
}
