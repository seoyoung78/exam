package ch06;

public class Car {
    // 필드
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
    int gas;

    // 생성자
    Car() {

    }

    Car(String model) {
//        this.model = model;
        this(model, "은색", 250);
    }

    Car(String model, String color) {
//        this.model = model;
//        this.color = color;
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // 메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas>0) {
                System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return; // 메소드 실행 종료
            }
        }
    }

    boolean stop;

    // Getter
    public int getSpeed() {
        return speed;
    }
    public boolean isStop() {
        return stop;
    }

    // Setter
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
