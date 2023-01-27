package DesignPatterns.CreationalPattern.Bridge_Pattern;

public class BMW implements DesignCar {

    @Override
    public void showCarDesign(int Xdimention, int Ydimention, int radius) {
        // TODO Auto-generated method stub
        System.out.println("This is Bmw car the raidus of car " + radius + " the dimention of car X " + Xdimention
                + " Y" + Ydimention);

    }

}
