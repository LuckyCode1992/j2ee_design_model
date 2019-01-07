package visitor;

/**
 * 访问者模式
 * 一个作用于某对象结构中的各个元素的操作。它可以在不改变各个元素的类的前提下，定义作用于这些元素的新操作.
 * 适用于，想对集合中的对象增加一些新的操作，而不想改变修改对象的类
 *
 * 访问者模式，主要角色：
 * IElement:抽象的事物元素功能接口，定义明确需求和可变需求，就是Ishpae
 * Element ： 具体功能实现
 * IVisitor:访问者接口，为访问者对象声明一个Visit方法，用来代表为对象结构添加的功能
 * Visitor：具体访问者实现类，实现要正真被添加到对象结构中的功能
 */
public class VisitorTest {

    public static void main(String[] args) {

        IVisitor visitor = new TriangleVisitor();
        IShape shape = new Triangle(0, 0, 2, 0, 0, 2);
        System.out.println("========");
        float area = shape.getArea();
        System.out.println("area:" + area);
        System.out.println("========");
        float lenth = shape.getLenth();
        System.out.println("lenth:" + lenth);

        System.out.println("========");
        TriangleVisitor.Point point = (TriangleVisitor.Point) shape.accept(visitor, "getCenter");
        System.out.println("中心坐标:" + "x=" + point.getX() + " y=" + point.getY());

        System.out.println("========");
        float r = (float) shape.accept(visitor, "getInnerCicleR");
        System.out.println("内切圆半径:" + r);


    }
}
