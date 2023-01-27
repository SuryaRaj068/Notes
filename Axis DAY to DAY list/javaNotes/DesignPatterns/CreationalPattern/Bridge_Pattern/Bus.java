package DesignPatterns.CreationalPattern.Bridge_Pattern;

public abstract class Bus {
    DesignCar DesignObj;

    Bus(DesignCar obj) {
        this.DesignObj = obj;
    }

    abstract void showDesign();

}
