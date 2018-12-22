package factory_pattern.super_factory;

import factory_pattern.abstract_factory.Iread;

/**
 * 运用反射之后，原本，需要一个抽象类，这里也可以直接变成一个具体类
 */
public class ProductFactory1 {
    //传入具体产品类名称
    static Iread creat(String className){
        Iread product =null;
        try {
            Class c = Class.forName(className);
            product = (Iread) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
