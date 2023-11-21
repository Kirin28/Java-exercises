package exercisesforprogrammers;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("What is the first number?");
        if (userInput.hasNextInt()) {
            num1 = userInput.nextInt();
        } 
    
        System.out.println("What is the second number?");
        if (userInput.hasNextInt()) {
            num2 = userInput.nextInt();
        } else {
        System.out.println("An input must be a numerical value.");
        }
       

        System.out.println(num1 + num2);
    }
}
