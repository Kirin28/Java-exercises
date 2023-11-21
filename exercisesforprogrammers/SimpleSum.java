package exercisesforprogrammers;

import java.util.ArrayList;

public class SimpleSum {
    public static void main(String[] args) {
//        int sum = 0;
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        for (int number : numbers) {
//            sum += number;
//        }
//        System.out.println(sum);
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            sum += number;
        }
        System.out.print(sum);
    }
}
