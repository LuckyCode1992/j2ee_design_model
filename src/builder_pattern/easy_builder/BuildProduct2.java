package builder_pattern.easy_builder;

import builder_pattern.Product;
import builder_pattern.Unit1;
import builder_pattern.Unit2;
import builder_pattern.Unit3;

public class BuildProduct2 implements Ibuild {
    Product p = new Product();


    @Override
    public void creatUnit1() {
        p.u1 = new Unit1();//创建unit，实际场景，会在这里面做一些操作，这里只是表示。
    }

    @Override
    public void creatUnit2() {
        p.u2 = new Unit2();
    }

    @Override
    public void creatUnit3() {
        p.u3 = new Unit3();
    }

    @Override
    public Product composite() {
        return p;
    }
}
