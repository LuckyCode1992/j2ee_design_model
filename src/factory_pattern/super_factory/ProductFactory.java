package factory_pattern.super_factory;

import factory_pattern.abstract_factory.Iread;

public class ProductFactory<T> {
    public T creat(String className){
        T product = null;
        try {
            Class c = Class.forName(className);
            product = (T) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
