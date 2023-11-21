package exercisesforprogrammers;

import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); 
        while (true) {
            System.out.println("Enter a noun:");
            String noun = userInput.nextLine();
            System.out.println("Enter a verb:");
            String verb = userInput.nextLine();
            System.out.println("Enter an adjective:");
            String adjective = userInput.nextLine();
            System.out.println("Enter an adverb:");
            String adverb = userInput.nextLine();
            System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?" + " That's hilarious!" );
            break;
        }

    }
}