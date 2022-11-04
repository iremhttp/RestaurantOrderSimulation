package Project;

import java.util.Scanner;
import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        double sum = 0;

        System.out.println("Welcome to our restaurant!");
        System.out.println("What do you want to do?");
        System.out.println("");
        System.out.println("Press 1 to ORDER ");
        System.out.println("Press 2 to PAY THE BILL ");
        System.out.println("Press 3  to GIVE US FEEDBACK ");
        System.out.println("Press 4 to SEE OUR TOP DISHES OF THE WEEK ");
        System.out.println("Press 5 IF YOU ARE NOT GOING TO TAKE ANOTHER ACTION");
        System.out.println("");
        System.out.println("Please enter a number (1,2,3,4,5 )");

        int number1;
        int qua =0;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        while (number1 != -2) {
            ArrayList<String>foods=new ArrayList<>();
           
            Choices.TheSystem(number1,sum,foods,qua);

            if (number1 == -2) {
                Choices.displayChoices(sum,foods,qua);

            }


        }
    }
}
