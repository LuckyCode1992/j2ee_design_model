package visitor;

import java.lang.reflect.Method;

public class TriangleVisitor implements IVisitor {
    @Override
    public Object visit(IShape triangle, String method) {
        Object result = null;
        Triangle t = (Triangle) triangle;
        try {
            Class classinfo = this.getClass();
            Method mt = classinfo.getMethod(method, Triangle.class);
            result = mt.invoke(this, new Object[]{t});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取重新坐标
     *
     * @param triangle
     * @return
     */
    public Object getCenter(Triangle triangle) {
        Point point = new Point();
        point.setX((triangle.x1 + triangle.x2 + triangle.x3) / 3);
        point.setY((triangle.y1 + triangle.y2 + triangle.y3) / 3);
        return point;
    }

    /**
     * 获取其内切圆半径
     */
    public Object getInnerCicleR(Triangle triangle) {
        float area = triangle.getArea();
        float len = triangle.getLenth();
        return new Float(2.0f * area / len);
    }


    class Point {
        float x, y;

        public Point() {
        }

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
    }
}
