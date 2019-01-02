package command;

/**
 * 命令模式：
 * 将一个请求封装为一个对象，可通过不同的请求对一个命令进行参数化控制。
 * 主要需要，命令发送者（命令源），命令接收者（执行者），请求者（调度者）
 * 通常在设计模式中，都会存在这个调度者，目的是解耦命令源和命令执行。
 */
public class CommandTest {
    public static void main(String[] args) {

        CommandManger commandManger = new CommandManger();
        PolyonCalc polyonCalc = new PolyonCalc();
        Point pt[] = new Point[3];
        pt[0] = new Point(0, 0);
        pt[1] = new Point(1, 0);
        pt[2] = new Point(0, 1);
        addCommand(commandManger, polyonCalc, pt);

        Point pt2[] = new Point[4];
        pt2[0] = new Point(0, 0);
        pt2[1] = new Point(0, 1);
        pt2[2] = new Point(1, 1);
        pt2[3] = new Point(1, 0);
        addCommand(commandManger, polyonCalc, pt2);

        commandManger.executCommand();
    }

    private static void addCommand(CommandManger commandManger, PolyonCalc polyonCalc, Point[] pt) {
        AreaCommander commander = new AreaCommander(polyonCalc, pt);
        LenCommander lenCommander = new LenCommander(polyonCalc, pt);
        commandManger.add(commander);
        commandManger.add(lenCommander);
    }
}
