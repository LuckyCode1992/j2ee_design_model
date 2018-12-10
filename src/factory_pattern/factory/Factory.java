package factory_pattern.factory;


import factory_pattern.simple_factory.*;

public class Factory {

    public static void main(String[] arg) {
        AbstractFactory factory = new LowFactory();
        Car lowCar = factory.creat();
        lowCar.showLevel();
    }
}
