package factory_pattern.abstract_factory;

public class ImageFactory extends AbstractFactory0 {
    @Override
    public Iread creat() {
        return new ImageRead();
    }
}
