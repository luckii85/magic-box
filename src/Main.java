public class Main {
    public static void main(String[] args) {
        MagicBox box1 = new MagicBox(5);
        box1.put(5);
        box1.put(4);
        box1.put(3);
        box1.put(2);
        box1.put(1);
        box1.put(-1);
        for (int piece : box1.pieces) {
            System.out.print(piece);
        }
        System.out.println(box1.pick());
    }
}