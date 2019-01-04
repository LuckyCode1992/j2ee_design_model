package iterator;

public class MyLinkedList implements MyCollection {
    private Node head = null;//链表首节点
    private int size = 0;//链表容易大小
    private Node tail = null;//链表尾节点

    @Override
    public void add(Object o) {
        Node node = new Node(o);//将o封装尾链表节点对象
        if (head == null) {
            head = node;
            tail = node;
            node.setNext(null);
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator iterator() {
        return null;
    }

    private class LinkedListMyIterator implements MyIterator {

        private Node currentNode = head;

        @Override
        public Object next() {
            Node node = currentNode;
            currentNode = currentNode.getNext();
            return node.getData();//返回当前节点元素值
        }

        @Override
        public boolean hasNest() {
            if (currentNode == null) return false;
            return true;
        }
    }
}
