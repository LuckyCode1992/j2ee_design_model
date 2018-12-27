package responsibility_chain;

/**
 * 具体处理者B
 */
public class HandlerB extends Handler {
    private int limit = 2;

    @Override
    public boolean handle(Request request) {
        if (request.getDay() <= limit) {
            System.out.println("HandlerB处理了这个问题");
            return true;
        }
        System.out.println("HandlerB处理了部分问题，其他问题交给下一个层级处理");
        return getNext().handle(request);
    }
}
