package ch06;

public class Computer {
    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    // ... 사용 시 자동으로 배열 생성되어 매개값으로 사용
    int sum2(int ... values) {
        int sum = 0;
        for (int i = 0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
