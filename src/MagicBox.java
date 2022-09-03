import java.util.Random;

public class MagicBox {
    protected int[] pieces;


    public MagicBox(int size) {
        this.pieces = new int[size];
    }

    public boolean put(int piece) {
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == 0) {
                pieces[i] = piece;
                System.out.println("+1 piece in Magic Box!");
                return true;
            }
        }
        System.out.println("Magic Box is full!");
        return false;
    }

    public int pick() {
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == 0) {
                throw new RuntimeException("Need more " + (pieces.length - i) + " pieces!");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(pieces.length);
        return pieces[randomInt];
    }

}