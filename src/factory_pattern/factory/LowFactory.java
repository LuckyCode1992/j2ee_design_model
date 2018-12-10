package factory_pattern.factory;

import factory_pattern.simple_factory.Car;
import factory_pattern.simple_factory.LowCar;

public class LowFactory extends AbstractFactory {
    @Override
    public Car creat() {
        return new LowCar();
    }
}
