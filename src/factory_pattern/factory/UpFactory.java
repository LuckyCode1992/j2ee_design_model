package factory_pattern.factory;

import factory_pattern.simple_factory.Car;
import factory_pattern.simple_factory.UpCar;

public class UpFactory extends AbstractFactory {
    @Override
    public Car creat() {
        return new UpCar();
    }
}
