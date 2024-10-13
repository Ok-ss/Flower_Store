package flower.store;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_QUANTITY = 1000;



//ROSE PACK
    @Test
    public void testRosePack() {
        double priceR = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        Rose rose = new Rose();
        rose.setPrice(priceR);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        FlowerPack pack = new FlowerPack(rose, quantity);
        Assertions.assertEquals(pack.getPrice(), priceR*quantity);
    }

    @Test
    public void testEmptyRosePack() {
        double priceR = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        Rose rose = new Rose();
        rose.setPrice(priceR);
        int quantity = 0;

        FlowerPack pack = new FlowerPack(rose, quantity);
        Assertions.assertEquals(pack.getPrice(), priceR*quantity);
    }

//TULIP PACK 
    @Test 
    public void testTulipPack() {
        double priceT = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        Tulip tulip = new Tulip();
        tulip.setPrice(priceT);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        FlowerPack pack = new FlowerPack(tulip, quantity);
        Assertions.assertEquals(pack.getPrice(), quantity*priceT);
    }

    @Test
    public void testEmptyTulipPack() {
        double priceT = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        Tulip tulip = new Tulip();
        tulip.setPrice(priceT);
        int quantity = 0;
    
        FlowerPack pack = new FlowerPack(tulip, quantity);
        Assertions.assertEquals(pack.getPrice(), quantity*priceT);
    }


//CHAMOMILE PACK  
    @Test
    public void testChamomilePack() {
        double priceC = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        Chamomile chamomile = new Chamomile();
        chamomile.setPrice(priceC);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        FlowerPack pack = new FlowerPack(chamomile, quantity);
        Assertions.assertEquals(pack.getPrice(), quantity*priceC);
    }

    @Test
    public void testEmptyChamomilePack() {
        double priceC = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        Chamomile chamomile = new Chamomile();
        chamomile.setPrice(priceC);
        int quantity = 0;

        FlowerPack pack = new FlowerPack(chamomile, quantity);
        Assertions.assertEquals(pack.getPrice(), quantity*priceC);
    }
}
