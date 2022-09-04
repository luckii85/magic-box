public class Main {
    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox<>(2);
        box1.put("One");
        box1.put("Two");
        box1.put("Three");
        System.out.println(box1.pick());
        for (String piece : box1.pieces) {
            System.out.print(piece);
        }


    }
}