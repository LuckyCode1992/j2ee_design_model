package factory_pattern.factory;

import factory_pattern.simple_factory.Car;
import factory_pattern.simple_factory.MidCar;

public class MidFactory extends AbstractFactory {
    @Override
    public Car creat() {
        return new MidCar();
    }
}
