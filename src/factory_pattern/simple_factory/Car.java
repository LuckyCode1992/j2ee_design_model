package factory_pattern.simple_factory;

/**
 * 定义一个产品模型，用接口，因为这个产品不需要自己生成
 * 比如，我们定义一个车，然后从其中一个维度去考虑，比如高档，中档，低档。
 */
public interface Car {
    final String UP_CAR = "UP_CAR";
    final String MID_CAR = "MID_CAR";
    final String LOW_CAR = "LOW_CAR";
    void showLevel();
}
