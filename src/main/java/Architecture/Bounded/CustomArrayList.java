package Architecture.Bounded;

import java.util.AbstractList;

public class CustomArrayList<T> extends AbstractList<T> {
    private T[] values;

    public CustomArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public T get(final int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    public boolean add(final T o) {
        T[] newValues = (T[]) new Object[size() + 1];
        for (int i = 0; i < size(); i++) {
            newValues[i] = values[i];
        }

        newValues[size()] = o;
        values = newValues;
        return true;
    }
}
