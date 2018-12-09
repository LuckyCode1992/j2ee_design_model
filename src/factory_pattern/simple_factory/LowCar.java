package factory_pattern.simple_factory;

/**
 * 高档车
 */
public class LowCar implements Car {
    @Override
    public void showLevel() {
        System.out.println("我是低档车");
    }
}
