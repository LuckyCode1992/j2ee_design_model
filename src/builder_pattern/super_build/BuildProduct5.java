package builder_pattern.super_build;

import builder_pattern.Product;
import builder_pattern.Unit1;
import builder_pattern.Unit2;
import builder_pattern.Unit3;

//在定义产品建造者的时候，定义需要什么样的产品即可，当然，对应下方的创建和组合，也会跟着产品而改变。
public class BuildProduct5 implements Ibuild3<Product> {

    Product p = new Product();


    /**
     * =下面依然是创建n个单元，但是，如何组合这些单元，完全由当前这个build实现决定，灵活度更高。
     */

    public void creatUnit1() {
        p.u1 = new Unit1();//创建unit，实际场景，会在这里面做一些操作，这里只是表示。
    }


    public void creatUnit2() {
        p.u2 = new Unit2();
    }


    public void creatUnit3() {
        p.u3 = new Unit3();
    }

    /**
     * 重点在下面这里
     *
     * @return
     */
    @Override
    public Product create() {
        //任意方式，创建需要的单元，也可以一个都不要。
        creatUnit1();
        creatUnit2();
        creatUnit3();
        return composite();
    }

    public Product composite() {
        //做你想做的操作，想要的组合方式，这里

        return p;
    }

}
