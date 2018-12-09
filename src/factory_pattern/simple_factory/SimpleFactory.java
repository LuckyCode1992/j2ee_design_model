package factory_pattern.simple_factory;


/**
 * 关键点：产品和工厂
 */
public class SimpleFactory {

    public static Car creatCar(String level) {
        Car car = null;
        if (level.equals(Car.UP_CAR)) {
            car = new UpCar();
        } else if (level.equals(Car.MID_CAR)) {
            car = new MidCar();
        }else if (level.equals(Car.LOW_CAR)){
            car = new LowCar();
        }else {
            car = new NoCar();
        }
        return car;
    }

    public static void main(String[] arg) {
        Car car1 = SimpleFactory.creatCar("超级档次");
        car1.showLevel();

        Car car2 = SimpleFactory.creatCar(Car.MID_CAR);
        car2.showLevel();
    }
}
