package exercisesforprogrammers;

import java.util.Scanner;
public class Hello {

public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What is your name?");

    String userName = userInput.nextLine();  // Read user input
    System.out.println("exercisesforprogrammers.Hello, " + userName + ", nice to meet you!");  // Output user input
}
}

