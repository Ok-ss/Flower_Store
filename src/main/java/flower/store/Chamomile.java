package flower.store;

public class Chamomile extends Flower{
    private static int price = 10;
    private static int sLength = 10;

    Chamomile() {
        this.setColor(FlowerColor.BLUE);
        this.setSepalLength(sLength);
        this.setPrice(price);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}
