package builder_pattern;

import builder_pattern.easy_builder.BuildProduct1;
import builder_pattern.easy_builder.Director;
import builder_pattern.easy_builder.Ibuild;

/**
 * 生成器模式，也称为建造者模式。
 * 这种模式作用：创建复杂对象的问题 ，分离构建和表示。
 *
 * 普通对象，class A {
 *     String a;
 *     String b;
 * }
 * 创建这个对象，就可以简单的 new A（），然后就可以调用了。
 *
 * 但是，class P{
 *     Unit1 u1;
 *     Util2:u2
 * }
 * 这样的对象，你需要创建u1,u2然后才能完成P的创建。生成器模式，就应运而生。
 *
 * 生成器的核心就是，n个生成方法，一个组合组合方法。把n个部件建造好，然后组合成一个完整的产品。
 */
public class BuilderTest {
    public static void main(String[] args) {

        //简单的运用生成器模式实例
        Ibuild ibuild = new BuildProduct1();//这里根据自己的需要，定义创建自己需要的产品
        //将定义好的产品，放到调度者（指挥者），由调度者，去指挥各个单位生成组件，然后组合到一起。产生真正的产品
        Director director = new Director(ibuild);
        Product p = director.build();

    }
}
