package builder_pattern.easy_builder;

import builder_pattern.Product;

/**
 * 这是一个调度者。对Ibuild进行封装
 */
public class Director {

    private Ibuild ibuild;

    public Director(Ibuild ibuild) {
        this.ibuild = ibuild;
    }

    /**
     * 产品的构建过程进行隐藏，开闭原则
     * @return
     */
    public Product build(){
        ibuild.creatUnit1();
        ibuild.creatUnit2();
        ibuild.creatUnit3();
        return ibuild.composite();
    }
}
