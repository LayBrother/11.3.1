import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;
    protected Random random = new Random();

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int rndRange = max - min + 1;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(rndRange) + min;
            }
        };
    }
}