package factory_pattern.simple_factory;


/**
 * 关键点：产品和工厂
 * 定制抽象产品接口
 * 定制具体产品实现类
 * 定制工厂类
 *
 * 不过，实际应用中，只有很简单的情况下才会使用这个，但是，很简单的情况下，也不太需要这种，所以，这个只是作为了解，实际并没有什么卵用
 * 实际开发应用中会用的是工厂模式和抽象工厂
 */
public class SimpleFactory {

    public static Car creatCar(String level) {
        Car car = null;

        //下面也可以用swich case
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
