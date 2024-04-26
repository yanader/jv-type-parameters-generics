public class Main {

    public static void main(String[] args) {
        Box<String> box1 = new Box();
        Object t = box1.castValue(box1.getClass(), "Hello");
        System.out.println(t);

    }
}
