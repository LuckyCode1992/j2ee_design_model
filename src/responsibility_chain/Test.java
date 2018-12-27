package responsibility_chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式，核心是责任（请求）处理类 Handler，责任层级（关系）类Chain,请求类Request.
 * 责任链，其实就是把一个事件，通过层层筛选过滤，交由到该某个类处理的地方去处理。
 * 不过，也可以对其进行稍微的变化，变为，每层做自己力所能及的事，剩下的事情交由下一级处理。
 * 设计模式是灵活运用的，要根据自己的情况，灵活变通。
 */
public class Test {
    public static void main(String[] args) {

        //这种职责链模式，存在的问题是，如果新增一个职责层级，需要增加新的处理类，还要修改Chain类，
        Request request = new Request(3);
//        ChainBuild chainBuild = new ChainBuild();
//        chainBuild.buildChain();
//        chainBuild.startReq(request);

        //这种职责链模式，解决了，新增一个层级时，只需要新增处理类，不需要修改Chain类，但会在调用的地方，添加处理类。
        ChainBuild2 chainBuild2 = new ChainBuild2();
        List<Handler> handlers = new ArrayList<>();
        handlers.add(new HandlerA());
        handlers.add(new HandlerB());
        handlers.add(new HandlerC());
        chainBuild2.setHandlers(handlers);
        chainBuild2.buildChain();
        chainBuild2.startReq(request);


    }
}
