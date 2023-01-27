package DesignPatterns.CreationalPattern.Bridge_Pattern;

public class Maruti implements DesignCar {

    @Override
    public void showCarDesign(int Xdimention, int Ydimention, int radius) {
        System.out.println("This is Maruti car the raidus of car " + radius + " the dimention of car X " + Xdimention
                + " Y" + Ydimention);
    }

}
