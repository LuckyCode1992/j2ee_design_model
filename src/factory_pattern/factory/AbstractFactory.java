package factory_pattern.factory;

import factory_pattern.simple_factory.Car;

/**
 * 工厂模式和简单工厂模式的差别就在这里
 * 一个抽象工厂，定义创建方法
 * 再由具体的实现工厂去实现。
 *
 * 优点是，如果需要新增其他类型的车，不需要修改原有代码，只需要新增具体的factory，不过缺点就是增加了类。
 */
public abstract class AbstractFactory {
    public abstract Car creat();
}
