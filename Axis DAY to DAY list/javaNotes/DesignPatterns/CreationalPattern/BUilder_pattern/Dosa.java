package DesignPatterns.CreationalPattern.BUilder_pattern;

public abstract class Dosa implements HotelItem {

    public Packing packing() {
        return new Wrapper();
    }

    @Override
    abstract public float price();

}
