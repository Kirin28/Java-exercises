import java.util.Scanner;
import java.util.ArrayList;
public class PrintQuotes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); 
        ArrayList<String> quotes = new ArrayList<String>();
        while(true) {
            System.out.println("What is the quote?");
            quotes.add(userInput.nextLine());
            System.out.println("Who said it?");
            quotes.add(userInput.nextLine());
            System.out.println(quotes.get(1) + " says, " + "\"" + quotes.get(0) + "\"");
            break;
         } 
        }
    }


  /*   public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); 
        while(true) {
            System.out.println("What is the quote?");
            String userQuote = userInput.nextLine();
            System.out.println("Who said it?");
            String userAuthor = userInput.nextLine();
            System.out.println(userAuthor + " says, " + "\"" + userQuote + "\"");
            break;
         } 
        } */