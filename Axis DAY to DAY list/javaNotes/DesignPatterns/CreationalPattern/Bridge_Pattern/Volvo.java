package DesignPatterns.CreationalPattern.Bridge_Pattern;

public class Volvo extends Bus {

    int radius, x, y;

    Volvo(int x, int y, int radius, DesignCar obj) {
        super(obj);
        this.x = x;
        this.y = y;
        this.radius = radius;
        // TODO Auto-generated constructor stub
    }

    @Override
    void showDesign() {
        DesignObj.showCarDesign(x, y, radius);

    }

}
