package flower.store;

public class Rose extends Flower {
    private static final int PRICE = 30;
    private static final int SEPAL_LENGTH = 20;
    
    Rose() {
        this.setColor(FlowerColor.RED);
        this.setSepalLength(SEPAL_LENGTH);
        this.setPrice(PRICE);
        this.setFlowerType(FlowerType.ROSE);
    }
}
