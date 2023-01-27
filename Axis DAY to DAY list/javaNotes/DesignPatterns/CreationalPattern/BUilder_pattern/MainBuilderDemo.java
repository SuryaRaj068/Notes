package DesignPatterns.CreationalPattern.BUilder_pattern;

public class MainBuilderDemo {

    public Order orderVegItem() {
        Order order = new Order();
        order.addItems(new VegDosa());
        order.addItems(new OrangeJuice());
        return order;

    }

    public Order orderNonVegItem() {
        Order order = new Order();
        order.addItems(new NonVegDosa());
        order.addItems(new MangoJuice());
        return order;

    }

}
