package Architecture.Generics;

import java.util.Comparator;
import java.util.List;

public class Methods {
    public static <T extends Person> T getMin(List<T> values) {
        return values.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .orElseThrow(IllegalArgumentException::new);
    }
}
