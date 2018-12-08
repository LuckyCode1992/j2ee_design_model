package reflection;

public class A {
    void funA() {
        System.out.println("funA");
    }

    private void funB(String b) {
        System.out.println(b);
    }

    private String name;
    public int age;

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    public A(int age) {
        this.age = age;
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
