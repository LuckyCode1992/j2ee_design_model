package visitor;

/**
 * 定义一个三角形
 */
public class Triangle implements IShape {
    float x1, x2, x3, y1, y2, y3;

    public Triangle() {
    }

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public float getArea() {
        //海伦公式： S = P*（P-A）*(P-B)*(P-C)开方，P = （a+b+c）/2
        float a = getDist(x1, y1, x2, y2);
        float b = getDist(x2, y2, x3, y3);
        float c = getDist(x3, y3, x1, y1);
        float p = (a + b + c) / 2;

        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public float getLenth() {
        float a = getDist(x1, y1, x2, y2);
        float b = getDist(x2, y2, x3, y3);
        float c = getDist(x3, y3, x1, y1);
        return a + b + c;
    }

    @Override
    public Object accept(IVisitor visitor,String method) {
        return visitor.visit(this,method);
    }

    /**
     * 求两点的距离
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public float getDist(float x1, float y1, float x2, float y2) {
        return (float) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

}
