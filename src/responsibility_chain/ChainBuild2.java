package responsibility_chain;

import java.util.ArrayList;
import java.util.List;

public class ChainBuild2 {
    private List<Handler> handlers = new ArrayList<>();

    public ChainBuild2(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public ChainBuild2() {
    }


    public void setHandlers(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public void buildChain() {
        for (int i = 0; i < handlers.size(); i++) {
            if (i + 1 < handlers.size()){
                handlers.get(i).setNext(handlers.get(i+1));
            }
        }
    }
    public void startReq(Request request) {
        if (handlers.size()==0){
            System.out.println("没有人处理这个请求");
        }else {
            handlers.get(0).handle(request);
        }
    }
}
