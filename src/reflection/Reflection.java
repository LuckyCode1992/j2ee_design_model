package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 程序运行时获取已知名称的类或已有对象相关信息的一种机制
 * 方法，属性，父类，实例类型的判断等
 * <p>
 * 反过来映射——反射
 * <p>
 * Class类：代表一个类
 * Constructor类：代表类的构造方法
 * Field 类：代表类的成员变量
 * Method类：代表类的方法
 * clazz.getDeclaredMethod(name)：可以调用类中的所有方法（不包括父类中继承的方法）
 * clazz.getMethod(name)：可以调用类中有访问权限的方法（包括父类中继承的方法）
 * 属性也是同样道理，所以，用哪个方法，看具体情况
 */
public class Reflection {

    public static void main(String[] args) {

        A a = new A();
        String name = a.getClass().getName();
        System.out.println(name);

        try {
            //1.利用反射，获取类信息
            Class classInfo = Class.forName("reflection.A");
            Constructor[] constructors = classInfo.getConstructors();
            System.out.println("构造方法：");
            for (Constructor constructor : constructors) {
                System.out.println(constructor.toString());
            }
            System.out.println("属性：");
            Field fields[] = classInfo.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.toString());
            }
            System.out.println("方法：");
            Method methods[] = classInfo.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.toString());
            }

            //2.创建对象 统一方式调用
            //构造方法，并没有什么规律，所以，先打印一下，对应着写
            for (Constructor constructor : constructors) {
                System.out.println("constructor：" + constructor.toString());
            }

            //无参构造方法
            A a0 = (A) constructors[1].newInstance();
            //一个参数
            A a1 = (A) constructors[3].newInstance("hello");
            A a2 = (A) constructors[0].newInstance(25);
            //两个参数
            A a3 = (A) constructors[2].newInstance("hello", 25);

            System.out.println("a0：" + a0.toString());
            System.out.println("a1：" + a1.toString());
            System.out.println("a11：" + a2.toString());
            System.out.println("a2：" + a3.toString());

            //另外一种更科学的方法
            Constructor c0 = classInfo.getConstructor();
            Constructor c1 = classInfo.getConstructor(String.class);
            Constructor c2 = classInfo.getConstructor(int.class);
            Constructor c3 = classInfo.getConstructor(String.class, int.class);

            A ac1 = (A) c0.newInstance();
            A ac2 = (A) c1.newInstance("hello");
            A ac3 = (A) c2.newInstance(23);
            A ac4 = (A) c3.newInstance("hello", 23);

            System.out.println("ac1：" + ac1.toString());
            System.out.println("ac2：" + ac2.toString());
            System.out.println("ac3：" + ac3.toString());
            System.out.println("ac4：" + ac4.toString());

            //3.对属性赋值并获取，以ac1为例
            Map<String, Object> map = new HashMap<String, Object>();
            //先将值放进一个map，key就是要赋值的变量
            map.put("name", "kk");
            map.put("age", 12);
            for (Field field : fields) {
                //这一步很关键
                field.setAccessible(true);
                for (String key : map.keySet()) {
                    if (field.getName().equals(key)) {
                        field.set(ac1, map.get(key));
                        System.out.println("ac1：" + "key=" + key + " value=" + field.get(ac1));
                    }
                }

            }

            //4.反射调用方法 依然以ac1为例
            Method method1 = classInfo.getDeclaredMethod("funA");
            method1.invoke(ac1);

            Method method2 = classInfo.getDeclaredMethod("funB", String.class);
            //注意，私有方法，私有属性访问都需要setAccessible(true)
            method2.setAccessible(true);
            method2.invoke(ac1, "你好反射");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
