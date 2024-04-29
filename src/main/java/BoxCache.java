import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BoxCache<K, V extends BoxOperations<? extends Number>> {

    Map<Integer, Box<?, ? extends Number>> boxList;

    public BoxCache() {
        boxList = new HashMap<>();
    }

    public void put(Integer i, Box<?, ? extends Number> box) {
        boxList.put(i, box);
    }

    public Collection<Box<?, ? extends Number>> getAll() {
        return this.boxList.values();
    }
}
