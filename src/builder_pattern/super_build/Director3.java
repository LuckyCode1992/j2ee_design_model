package builder_pattern.super_build;

import builder_pattern.Product;
import builder_pattern.builde.Ibuilde2;

public class Director3<T> {
    private Ibuild3 ibuilde3;

    public Director3(Ibuild3 ibuilde3) {
        this.ibuilde3 = ibuilde3;
    }

    public T build() {
        return (T) ibuilde3.create();
    }
}
