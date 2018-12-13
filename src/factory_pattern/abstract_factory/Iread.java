package factory_pattern.abstract_factory;

/**
 * 定义一个泛型接口，定义一个可变参数输入的方法
 * @param <T>
 */
public interface Iread<T> {
    T read(String... in);
}
