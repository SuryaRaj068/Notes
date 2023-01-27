package DesignPatterns.CreationalPattern.BUilder_pattern;

public abstract class FreshDrinks implements HotelItem {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    abstract public float price();

}
