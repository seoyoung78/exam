package ch05;

public class AdvancedFroExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 83, 87};

        int sum = 0;
        for (int score: scores) {
            sum += score;
        }
        System.out.println("첨수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
