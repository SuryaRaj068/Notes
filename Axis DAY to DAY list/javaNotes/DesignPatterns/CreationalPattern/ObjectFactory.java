package DesignPatterns.CreationalPattern;

public class ObjectFactory {

    public FactoryPatternDemoDraw drawTheShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Rectangle")) {
            return new FactoryRectangle();
        }
        if (type.equalsIgnoreCase("Triangle")) {
            return new FactoryTriangle();
        }
        if (type.equalsIgnoreCase("square")) {

        }
        return null;

    }

}
