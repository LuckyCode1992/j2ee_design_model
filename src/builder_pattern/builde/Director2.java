package builder_pattern.builde;

import builder_pattern.Product;

public class Director2 {
    private Ibuilde2 ibuilde2;

    public Director2(Ibuilde2 ibuilde2) {
        this.ibuilde2 = ibuilde2;
    }
    public Product build(){
        return ibuilde2.create();
    }
}
