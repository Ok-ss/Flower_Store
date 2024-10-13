package flower.store;

public class Rose extends Flower {
    private static int price = 30;
    private static int sLength = 40;
    
    Rose() {
        this.setColor(FlowerColor.RED);
        this.setSepalLength(sLength);
        this.setPrice(price);
        this.setFlowerType(FlowerType.ROSE);
    }
}
