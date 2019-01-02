package command;

/**
 * 命令接收者
 * (求面积)
 */
public class PolyonCalc {
    //求面积
    public float getArea(Point pt[]) {
        float s;
        int size = pt.length;
        if (size < 3) {
            return 0;
        }
        s = pt[0].y * (pt[size - 1].x - pt[1].x);
        for (int i = 1; i < size; i++) {
            s += pt[i].y * (pt[(i - 1)].x - pt[(i + 1) % size].x);
        }
        return Math.abs((float) s / 2);
    }
    public float getLenth(Point pt[]){
        float len = 0;
        len = distance(pt[0],pt[pt.length-1]);
        for (int i = 0;i<pt.length-1;i++){
            len += distance(pt[i],pt[i+1]);
        }
        return len;
    }
    public float distance(Point one,Point two){
        return (float) Math.sqrt(Math.pow((one.x-two.x),2)+Math.pow((one.y-two.y),2));
    }

}

class Point {
    float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
