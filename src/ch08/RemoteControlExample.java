package ch08;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl.chagneBattery();
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);
        rc.turnOff();
    }
}
