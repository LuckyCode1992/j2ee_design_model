package builder_pattern.builde;

import builder_pattern.Product;

public interface Ibuilde2 {
    /**
     *  void creatUnit1();
     *
     *     void creatUnit2();
     *
     *     void creatUnit3();
     *
     *     Product composite();
     * @return
     */
    Product create();//仅仅定义一个创建方法，不包含流程。之前的Ibuiild是包含流程的，创建3个unit后再组合，如果只是一个创建方法，就把创建单元的过程隐藏，分解出去了。
}
