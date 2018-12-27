package responsibility_chain;

/**
 * 构建一个责任链关系，
 * 定义好，第一，第二，第三，，，职责
 */
public class ChainBuild {
    private Handler handlerA = new HandlerA();
    private Handler handlerB = new HandlerB();
    private Handler handlerC = new HandlerC();

    public void buildChain() {
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
    }

    /**
     * 发出请求
     * @param request
     */
    public void startReq(Request request) {
        handlerA.handle(request);
    }
}
