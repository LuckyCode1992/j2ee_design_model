package command;

public class LenCommander implements ICommand {
    PolyonCalc calc;
    Point pt[];

    public LenCommander(PolyonCalc calc, Point[] pt) {
        this.calc = calc;
        this.pt = pt;
    }

    @Override
    public float calc() {
        return calc.getLenth(pt);
    }
}
