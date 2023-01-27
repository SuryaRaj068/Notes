package DesignPatterns.CreationalPattern.BUilder_pattern;

public class MainClass {
    public static void main(String[] args) {
        MainBuilderDemo mainOrder = new MainBuilderDemo();
        Order order1 = mainOrder.orderVegItem();
        System.out.println("veg item is orderd");
        order1.showItem();
        System.out.println("total cost = " + order1.getTotalCost());
        System.out.println("NonVeg item is orderd");
        Order order2 = mainOrder.orderNonVegItem();
        order2.showItem();
        System.out.println("total cost = " + order2.getTotalCost());

    }

}
