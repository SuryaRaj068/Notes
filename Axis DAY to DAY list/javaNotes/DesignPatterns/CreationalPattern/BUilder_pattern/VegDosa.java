package DesignPatterns.CreationalPattern.BUilder_pattern;

public class VegDosa extends Dosa {

    @Override
    public String ItemName() {
        return "VegDosa";
    }

    @Override
    public float price() {
        return 50f;
    }

}
