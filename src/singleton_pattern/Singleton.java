package singleton_pattern;

/**
 * 单例模式
 * <p>
 * 核心思想：构造方法私有化
 */
public class Singleton {

    private Singleton() {
    }

    //直接实例化（最简单，同时线程安全，通常我觉得这种就足够了，与下面的方式相比，仅仅是在程序运行开始，就存在）
    private static final Singleton singleton1 = new Singleton();

    public static Singleton getInstance1() {
        return singleton1;
    }

    //延迟实例化，其实就是在使用这个类的时候才实例化。我只写两种安全的方式

    //这种方式叫双重锁，就是因为singleton2==null这个是两次
    private static Singleton singleton2 = null;

    public static Singleton getSingleton2() {
        if (singleton2 == null) {
            synchronized (Singleton.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton();
                }
            }
        }
        return singleton2;
    }

    //最后一种是静态内部类，相较于前面一种，唯一有点就是提高了java虚拟机的维护效率，不过通常我们不需要管这个效率
    private static class My {
        public static final Singleton singleton3 = new Singleton();
    }
    public static final Singleton getSingleton3() {
        return My.singleton3;
    }

}

