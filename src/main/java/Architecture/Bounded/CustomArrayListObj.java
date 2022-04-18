package Architecture.Bounded;

import java.util.AbstractList;

public class CustomArrayListObj<T> extends AbstractList<T> {
    private Object[] values;

    public CustomArrayListObj() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public T get(final int index) {
        return (T) values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    public boolean add(final T o) {
        Object[] newValues = new Object[size() + 1];
        for (int i = 0; i < size(); i++) {
            newValues[i] = values[i];
        }
        newValues[size()] = o;
        values = newValues;
        return true;
    }
}
