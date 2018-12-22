package factory_pattern.super_factory;

import factory_pattern.abstract_factory.Iread;

/**
 * 反射技术，实现工厂创建
 * 这样，无论增加多少具体工厂类，抽象工厂类都不需要做任何修改。
 * 当然，如果只是，上面这一条优点，工厂模式，和抽象工厂模式，都是具备的。
 * 但是，这仅仅是为了后面抽象产品作铺垫
 */
public abstract class AbstractFactory1 {
    public abstract Iread creat();

    //传入具体工厂类的名称
    static AbstractFactory1 creat(String className) {
        AbstractFactory1 factory1 = null;
        try {
            Class c = Class.forName(className);
            factory1 = (AbstractFactory1) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return factory1;
    }
}
