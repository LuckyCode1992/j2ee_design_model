package builder_pattern.super_build;

/**
 * 定义产品为一个泛型，这样，再沿用之前的方法，就可以灵活的创造不同的产品了。
 * @param <T>
 */
public interface Ibuild3<T> {
     T create();
}
