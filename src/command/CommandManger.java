package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令（请求）调度者，管理者
 */
public class CommandManger {
    List<ICommand> commands = new ArrayList<>();

    public void add(ICommand command) {
        commands.add(command);
    }

    public void remove(ICommand command) {
        commands.remove(command);
    }

    public void clear(ICommand command) {
        commands.clear();
    }

    public void executCommand() {
        for (int i = 0; i < commands.size(); i++) {
            float value = commands.get(i).calc();
            if (commands.get(i) instanceof AreaCommander)
                System.out.println("这个面积是：" + value);
            if (commands.get(i) instanceof LenCommander)
                System.out.println("这个周长是：" + value);
        }
    }
}
