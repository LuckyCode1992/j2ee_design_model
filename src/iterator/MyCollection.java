package iterator;

/**
 * 聚合容器接口
 */
public interface MyCollection {
     void add(Object o);
     int size();
     MyIterator iterator();
}
