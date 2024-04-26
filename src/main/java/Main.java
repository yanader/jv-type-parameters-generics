public class Main {

    public static void main(String[] args) {
        Box<String, Number> box1 = new Box("String-Number-Box");
//        Box<Character, Double> box2 = new Box("Char-Boolean-Box");

        box1.setLargestValue(2.0, 5);
        System.out.println(box1.getLargestValue());

    }
}
