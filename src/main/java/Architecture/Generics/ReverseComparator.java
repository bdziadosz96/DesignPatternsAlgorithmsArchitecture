package Architecture.Generics;

import java.util.Comparator;

public class ReverseComparator <T extends Person> implements Comparator<T>{
    private final Comparator <T> comparator;

    public ReverseComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return -Integer.compare(o1.getAge(), o2.getAge());
    }
}
