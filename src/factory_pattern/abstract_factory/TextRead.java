package factory_pattern.abstract_factory;

public class TextRead implements Iread<String> {
    @Override
    public String read(String... in) {
        return in+".我读到了文本";
    }
}
