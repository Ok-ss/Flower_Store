package flower.store;

public class Chamomile extends Flower {
    private static final int PRICE = 10;
    private static final int SEPAL_LENGTH = 10;

    Chamomile() {
        this.setColor(FlowerColor.BLUE);
        this.setSepalLength(SEPAL_LENGTH);
        this.setPrice(PRICE);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}
