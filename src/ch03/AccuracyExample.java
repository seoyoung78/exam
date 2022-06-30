package ch03;

public class AccuracyExample {
    public static void main(String[] args) {
        // 정확한 계산에는 부도옷수점 타입 사용x
        int apple1 = 1;
        double pieceUnit1 = 0.1;
        int number1 = 7;

        double result1 = apple1 - number1*pieceUnit1;

        System.out.println("사과 한개에서 0.7조각을 빼면, " + result1 + "조각이 남는다.");

        // 정수 연산으로 변경
        int totalPieces = apple1 * 10;
        int temp = totalPieces - number1;

        double result2 = temp/10.0;

        System.out.println("사과 한개에서 0.7조각을 빼면, " + result2 + "조각이 남는다.");
    }
}
