package factory_pattern.simple_factory;

/**
 * 高档车
 */
public class MidCar implements Car {
    @Override
    public void showLevel() {
        System.out.println("我是中档车");
    }
}
