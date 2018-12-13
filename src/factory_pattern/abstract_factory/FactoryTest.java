package factory_pattern.abstract_factory;


/**
 * 其实抽象工厂和工厂，基本是一样的，不同的地方是：
 * 工厂模式，是一个工厂生成一种类型的产品。
 * 我这里，其实也不完全是抽象工厂，而抽象工厂通常也没有使用，通常会对其进行优化，
 * 就是通过泛型，进行不同类型的表示。
 */
public class FactoryTest {
    public static void main(String[] arg) {
        AbstractFactory0 textFactory = new TextFactory();
        Iread read = textFactory.creat();
       System.out.println(read.read("你好"));
    }
}
