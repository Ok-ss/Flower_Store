package flower.store;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerBucket {
    private ArrayList<FlowerPack> packs;
    private ArrayList<FlowerType> types;
    private double price;

    FlowerBucket() {
        this.packs = new ArrayList<>();
        this.types = new ArrayList<>();
    }

    FlowerBucket(ArrayList<FlowerPack> packs) {
        this.packs = packs;
        for (FlowerPack p:packs) {
            this.types.add(p.getFlower().getFlowerType());
        }
    }

    public double getPrice() {
        return price;
    }

    public void add(FlowerPack pack) {
        this.packs.add(pack);
        this.price += pack.getPrice();
        if (!types.contains(pack.getFlower().getFlowerType())) {
            this.types.add(pack.getFlower().getFlowerType());
        }
    }

    
}
