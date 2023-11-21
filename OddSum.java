import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddSum {
        public static int calculateSum() {
            List<Integer> randomNums = new ArrayList<>();
            Random randomNum = new Random();
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                randomNums.add(randomNum.nextInt(100) + 1);
                }
            for (int i = 0; i < randomNums.size(); i++) {
                if(i % 2 != 0) {
                    sum += randomNums.get(i);
                }
            }
            return sum;
        }


    public static void main(String[] args) {
        int result = calculateSum();
        System.out.println("Sum = " + result);
    }
}

//alternative solution:
//    public static int calculateSum() {
//        List<Integer> randomNums = new ArrayList<>();
//        Random randomNum = new Random();
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            randomNums.add(randomNum.nextInt(100) + 1);
//            }
//        List<Integer> filteredArray = randomNums.stream().filter(num -> num % 2 == 0).toList();
//        for (int j = 0; j < filteredArray.size(); j++) {
//            sum += filteredArray.get(j);
//    }
//        return sum;
//    }

//someone else's solution:
//import java.util.ArrayList;
//        import java.util.List;
//        import java.util.Random;

//public class RandomOddSum {
//
//    public static int calculateSum() {
//        // Create list of 100 random integers between 1 and 50 to avoid too large output
//        List<Integer> randomNumbers = new ArrayList<>();
//        Random rand = new Random();
//        for (int i = 0; i < 100; i++) {
//            randomNumbers.add(rand.nextInt(51));
//        }
//
//        // Square number if odd, then sum
//        int sumOfOddNumbersSquared = 0;
//        for (int number : randomNumbers) {
//            if (number % 2 != 0) {
//                int squaredNumber = number * number;
//                sumOfOddNumbersSquared += squaredNumber;
//            }
//        }
//
//        return sumOfOddNumbersSquared;
//    }
//
//    public static void main(String[] args) {
//        int result = calculateSum();
//        System.out.println("Sum = " + result);
//    }
//}
