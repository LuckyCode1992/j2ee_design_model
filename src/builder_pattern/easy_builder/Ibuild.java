package builder_pattern.easy_builder;

import builder_pattern.Product;

/**
 * 定义n个建造（创建）方法
 * 一个组合方法
 */
public interface Ibuild {
    void creatUnit1();

    void creatUnit2();

    void creatUnit3();

    Product composite();

}
