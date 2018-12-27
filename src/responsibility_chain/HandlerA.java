package responsibility_chain;

/**
 * 具体处理者A
 */
public class HandlerA extends Handler {
    private int limit = 1;

    /**
     * 解释一下，如果，request请求的day是再A职责范围内，那么就由A进行处理
     * 否则，就将这个请求，传递给下一个处理者
     *
     * @param request
     * @return
     */
    @Override
    public boolean handle(Request request) {
        if (request.getDay() <= limit) {
            System.out.println("HandlerA处理了这个问题");
            return true;
        }
        System.out.println("HandlerA处理了部分问题，其他问题交给下一个层级处理");
        return getNext().handle(request);
    }

}
