package iterator;

import java.util.*;

/**
 * 提供一种方法访问一个容器对象中的各个元素，
 * 而又不需要暴露该对象的内部细节，是一种只应用于容器对象遍历的设计模式，
 * 适合迭代器模式的情景，主要是遍历集合对象，不需要要知道对象在集合中的存储方式
 * 可以同时使用多个迭代器遍历一个集合
 */
public class IteratorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("aaa");
        v.add("bbb");
        v.add("ccc");
        System.out.println("Vector traverse");
        traverse(v);
        System.out.println();


        LinkedList<String> l = new LinkedList<>();
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        l.add("aaa");
        System.out.println("LinkedList traverse");
        traverse(l);
        System.out.println();

        Set<String> s = new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        System.out.println("Set traverse");
        traverse(s);
        System.out.println();

        MyArraylist myArraylist = new MyArraylist();
        myArraylist.add("111");
        myArraylist.add("222");
        myArraylist.add("333");
        System.out.println("MyArraylist traverse");
        myTraverse(myArraylist);
        System.out.println();

    }

    private static void myTraverse(MyCollection myCollection) {
        MyIterator myIterator = myCollection.iterator();
        while (myIterator.hasNest()){
            String st = (String) myIterator.next();
            System.out.println(st);
        }
    }

    private static void traverse(Collection<String> c) {
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
