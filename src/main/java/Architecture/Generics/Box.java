package Architecture.Generics;

class Box <T> implements Comparable<T>{
    private final T first;
    private final T second;

    Box(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(T o) {
        return Integer.compare((Integer) first, (Integer) second);
    }
}
