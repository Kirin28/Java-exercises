import java.util.Scanner;
public class CountChars {
    public static void main (String []args) {
        Scanner userInput = new Scanner(System.in); 
        while(true) {
            System.out.println("What is the input string?");
            String userName = userInput.nextLine();
            int numOfChars = userName.length();

            if(numOfChars <= 0) {
            System.out.println("Please enter something into the program");
            
            } else {
            System.out.println(userName + " has " + numOfChars + " characters.");
            break;
         } 
        }
         
    }
}
