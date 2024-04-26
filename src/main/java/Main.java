public class Main {

    public static void main(String[] args) {
        Box<Integer> box1 = new Box();
        box1.castValue(box1.getClass(), "Hello");
    }
}
