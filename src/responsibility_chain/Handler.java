package responsibility_chain;

/**
 * 抽象处理者
 */
public abstract class Handler {
    private Handler next;//这里用的是多态的概念，定义处理者

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
    public abstract boolean handle(Request request);//处理方法
}
