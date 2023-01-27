package DesignPatterns.CreationalPattern.Bridge_Pattern;

public class BridgeDemo {
    public static void main(String args[]) {
        Bus marutiCar = new Volvo(200, 100, 10, new Maruti());
        Bus BMW = new Volvo(300, 150, 200, new BMW());
        marutiCar.showDesign();
        BMW.showDesign();
    }

}
