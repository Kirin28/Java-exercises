package exercisesforprogrammers;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class RetirementCalculator {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatYear = DateTimeFormatter.ofPattern("yyyy");
        String currentYear = date.format(formatYear);

        while(true) {
            System.out.println("What is your current age?");
            int age = Integer.parseInt(userInput.nextLine());
            System.out.println("At what age would you like to retire?");
            int retirementAge = Integer.parseInt(userInput.nextLine());
            System.out.println("You have " + (retirementAge - age) + " years left until you can retire.");
            System.out.println("It's " + currentYear + ", so you can retire in " + (Integer.parseInt(currentYear) + (retirementAge - age)) + ".");
            break;
        }
    }
}
