public class Main {

    public static void main(String[] args) {
        BoxCache<Integer, Box<String, Float>> boxCache = new BoxCache<>();
        Box<String, Float> box = new Box<>("FloatBox");
        boxCache.put(1, box);
        boxCache.put(2, new Box<Boolean, Double>("Boolean to double Box"));

        System.out.println(boxCache.boxList.size());


    }
}
