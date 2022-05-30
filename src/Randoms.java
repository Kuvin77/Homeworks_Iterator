import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer>{
        @Override
        public boolean hasNext () {
            return true;
        }

        @Override
        public Integer next () {
            random = new Random();
            return random.nextInt(max - min + 1) + min;
        }
    }

    ;
}

