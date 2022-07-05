package ch06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: "+ result2);

        myCalc.powerOff();

        myCalc.execute();

        // 메소드 오버로딩
        double result3 = myCalc.areaRectangle(10);
        double result4 = myCalc.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + result3);
        System.out.println("직사각형 넓이 = " + result4);

        // 정적 멤버 사용
        double result5 = 10 * 10 * Calculator.pi;
        int result6 = Calculator.plus1(10, 5);
        int result7 = Calculator.minus(10, 5);

        System.out.println("result5: " + result5);
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);
    }
}
