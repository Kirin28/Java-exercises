package exercisesforprogrammers;
import java.util.ArrayList;

public class TargetHeartRate {
    private static int age;
    private static int restingHours;

    public TargetHeartRate(int age, int restingHours) {
        this.age = age;
        this.restingHours = restingHours;
    }

    public void calculateHeartRate() {
        ArrayList<Integer> rateArray = new ArrayList<>();
        for(int i = 55; i <= 95; i += 5) {
            float intensity = i / 100; //casting float to i (because i is an int) (float) in / 100; however, I dont need to cast because float have enough space for an int
            double rate = (((220 - age) - restingHours) * intensity) + restingHours;
            int rateRounded = (int) Math.round(rate);
            rateArray.add(rateRounded);
            System.out.println(rateArray);
        }
    }
    public static void main (String[] args) {
        TargetHeartRate test1 = new TargetHeartRate(22, 65);
        test1.calculateHeartRate();
    }
}
