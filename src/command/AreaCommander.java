package command;

/**
 * 命令发送者
 */
public class AreaCommander implements ICommand {
    PolyonCalc calc;
    Point pt[];

    public AreaCommander(PolyonCalc calc, Point[] pt) {
        this.calc = calc;
        this.pt = pt;
    }

    @Override
    public float calc() {
        return calc.getArea(pt);
    }
}
