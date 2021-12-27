package ExerciciosLogica;

import java.util.Scanner;
    public class Ex1 {
        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);
            //print name 7 times
            for(int i = 1; i <= 7; i++){
                System.out.println("Hy my name is Hudy"+i+"º");
            }
            //print 1 to 20
            for(int i = 1;i <=20;i++){
                System.out.println(""+i);
            }
            //Print solicited name 15 times
            System.out.println("\nInsert a name :");
            String name = leia.nextLine();
            for(int i = 1; i<= 15; i++){
                System.out.println("The chosed name was :"+ name);

            }





        }
}
