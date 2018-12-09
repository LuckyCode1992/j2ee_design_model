package factory_pattern.simple_factory;

public class NoCar implements Car {
    @Override
    public void showLevel() {
        System.out.println("不好意思，没有这种车");
    }
}
