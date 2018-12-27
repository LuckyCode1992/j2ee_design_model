package responsibility_chain;

public class HandlerC extends Handler {
    private int limit = 3;
    @Override
    public boolean handle(Request request) {
        if (request.getDay() <= limit) {
            System.out.println("HandlerC处理了这个问题");
            return true;
        }
        System.out.println("HandlerC处理了部分问题，其他问题交给下一个层级处理");
        return getNext().handle(request);
    }
}
