package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Store store;
    private Flower rose;
    private Flower tulip;
    private FlowerPack rosePack;
    private FlowerPack tulipPack;
    private FlowerBucket bucketOne;
    private FlowerBucket bucketTwo;
    private static final int QUANTITY = 10;
    private static final int Q_TULIP = 20;

    @BeforeEach
    public void setUp() {
        store = new Store();
        rose = new Rose();
        tulip = new Tulip();

        rosePack = new FlowerPack(rose, QUANTITY);
        tulipPack = new FlowerPack(tulip, Q_TULIP);

        bucketOne = new FlowerBucket();
        bucketOne.add(rosePack);

        bucketTwo = new FlowerBucket();
        bucketTwo.add(tulipPack);

        store.addBucket(bucketOne);
        store.addBucket(bucketTwo);
    }

    @Test
    public void testAddBucket() {
        Assertions.assertEquals(2, store.searchBucket(
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty()).size());
    }

    @Test
    public void testSearchPackByFlowerType() {
        ArrayList<FlowerPack> result = store.searchPack(
                            Optional.of(FlowerType.ROSE),
                            Optional.empty(),
                            Optional.empty());

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(rosePack, result.get(0));
    }

    @Test
    public void testSearchPackByQuantity() {
        ArrayList<FlowerPack> result = store.searchPack(
                                        Optional.empty(),
                                        Optional.of(QUANTITY),
                                        Optional.empty());
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(rosePack, result.get(0));
    }

    @Test
    public void testSearchPackByPrice() {
        ArrayList<FlowerPack> result = store.searchPack(
                                        Optional.empty(),
                                        Optional.empty(),
                            Optional.of(rosePack.getPrice()));
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(rosePack, result.get(0));
    }

    @Test
    public void testSearchBucketByFlowerTypes() {
        ArrayList<FlowerType> flowerTypes = new ArrayList<>();
        flowerTypes.add(FlowerType.ROSE);

        ArrayList<FlowerBucket> result = store.searchBucket(
                                        Optional.of(flowerTypes),
                                        Optional.empty(),
                                        Optional.empty());
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(bucketOne, result.get(0));
    }

    @Test
    public void testSearchBucketByNumberOfPacks() {
        ArrayList<FlowerBucket> result = store.searchBucket(
                                            Optional.empty(),
                                            Optional.of(1),
                                            Optional.empty());
        Assertions.assertEquals(2, result.size());
    }

    @Test
    public void testSearchBucketByPrice() {
        ArrayList<FlowerBucket> result = store.searchBucket(
                                            Optional.empty(),
                                            Optional.empty(),
                                            Optional.of(bucketOne.getPrice()));
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(bucketOne, result.get(0));
    }

    @Test
public void testSearchPackByFlowerTypeAndQuantity() {
    ArrayList<FlowerPack> result = store.searchPack(
        Optional.of(FlowerType.ROSE), 
        Optional.of(QUANTITY), 
        Optional.empty()
    );
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(rosePack, result.get(0));
}

@Test
public void testSearchPackByFlowerTypeAndPrice() {
    ArrayList<FlowerPack> result = store.searchPack(
        Optional.of(FlowerType.TULIP), 
        Optional.empty(), 
        Optional.of(tulipPack.getPrice())
    );
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(tulipPack, result.get(0));
}

@Test
public void testSearchPackByAllCriteria() {
    
    ArrayList<FlowerPack> result = store.searchPack(
        Optional.of(FlowerType.ROSE), 
        Optional.of(QUANTITY), 
        Optional.of(rosePack.getPrice())
    );
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(rosePack, result.get(0));
}

@Test
public void testSearchBucketByFlowerTypesAndNumOfPacks() {
    ArrayList<FlowerType> flowerTypes = new ArrayList<>();
    flowerTypes.add(FlowerType.ROSE);

    ArrayList<FlowerBucket> result = store.searchBucket(
        Optional.of(flowerTypes), 
        Optional.of(1), 
        Optional.empty()
    );
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(bucketOne, result.get(0));
}

@Test
public void testSearchBucketByFlowerTypesAndPrice() {
    ArrayList<FlowerType> flowerTypes = new ArrayList<>();
    flowerTypes.add(FlowerType.TULIP);

    ArrayList<FlowerBucket> result = store.searchBucket(
        Optional.of(flowerTypes), 
        Optional.empty(), 
        Optional.of(bucketOne.getPrice())
    );
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(bucketTwo, result.get(0));
}

@Test
public void testSearchBucketByAllCriteria() {
    ArrayList<FlowerType> flowerTypes = new ArrayList<>();
    flowerTypes.add(FlowerType.ROSE);

    ArrayList<FlowerBucket> result = store.searchBucket(
        Optional.of(flowerTypes), 
        Optional.of(1), 
        Optional.of(bucketOne.getPrice())
    );
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(bucketOne, result.get(0));
}


}
