package iterator;

import java.util.Arrays;

public class MyArraylist implements MyCollection {
    private Object[] elementData;
    private int size;

    public MyArraylist(int size) {
        elementData = new Object[size];
        this.size = 0;
    }

    public MyArraylist() {
        elementData = new Object[8];
        this.size = 0;
    }

    public Object get(int index) {
        return elementData[index];
    }


    @Override
    public void add(Object o) {
        if (this.size == elementData.length) {
            int newSize = size * 2;//容器扩容，拷贝原数据
            elementData = Arrays.copyOf(elementData, newSize);
        }
        elementData[size] = o;//添加元素
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator iterator() {

        return new ArrayListMyIterator();
    }

    private class ArrayListMyIterator implements MyIterator {
        private int currentIndex = 0;

        @Override
        public Object next() {
            Object o = elementData[currentIndex];
            currentIndex++;
            return o;
        }

        @Override
        public boolean hasNest() {
            if (currentIndex >= size) return false;
            return true;
        }
    }
}
