package flower.store;

public class Tulip extends Flower {
    private static int price = 30;
    private static int sLength = 40;
    Tulip() {
        this.setColor(FlowerColor.BLUE);
        this.setSepalLength(sLength);
        this.setPrice(price);
        this.setFlowerType(FlowerType.TULIP);
    }
}