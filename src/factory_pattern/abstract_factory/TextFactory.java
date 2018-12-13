package factory_pattern.abstract_factory;

public class TextFactory extends AbstractFactory0 {
    @Override
    public Iread creat() {
        return new TextRead();
    }
}
