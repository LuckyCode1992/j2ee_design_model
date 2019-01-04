package iterator;

/**
 * 节点，linkedlist需要的东西
 * 链表节点
 */
public class Node {
    private Object data; //当前节点值
    private Node next;//下一个节点

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
