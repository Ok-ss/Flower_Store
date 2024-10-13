package flower.store;

public class Tulip extends Flower {
    private static final int PRICE = 30;
    private static final int SEPAL_LENGTH = 40;

    Tulip() {
        this.setColor(FlowerColor.BLUE);
        this.setSepalLength(SEPAL_LENGTH);
        this.setPrice(PRICE);
        this.setFlowerType(FlowerType.TULIP);
    }
}