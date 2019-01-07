package visitor;

/**
 * 定义抽象需求分析接口（形状）
 */
public interface IShape {
    float getArea();//获取面积 -明确的需求分析

    float getLenth();//获取周长 -明确的需求分析

    Object accept(IVisitor visitor,String methos); //扩展需求 ，未知
}
