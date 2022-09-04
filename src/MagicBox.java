import java.util.Random;

public class MagicBox<T> {
    protected T[] pieces;


    public MagicBox(int size) {
        this.pieces = (T[]) new Object[size];
    }

    public boolean put(T piece) {
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == null) {
                pieces[i] = piece;
                System.out.println("+1 piece in Magic Box!");
                return true;
            }
        }
        System.out.println("Magic Box is full!");
        return false;
    }

    public T pick() {
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == null) {
                throw new RuntimeException("Need more " + (pieces.length - i) + " pieces!");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(pieces.length);
        return pieces[randomInt];
    }

}