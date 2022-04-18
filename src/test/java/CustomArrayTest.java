import Architecture.Bounded.CustomArrayList;
import Architecture.Bounded.CustomArrayListObj;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomArrayTest {

    @Test
    void customArrayListTest() {
        CustomArrayList<String> strings = new CustomArrayList<>();
        String test1 = "test1";
        strings.add(test1);

        assertTrue(strings.size() > 0);
        assertTrue(strings.contains(test1));
    }

    @Test
    void customArrayListObjTest() {
        CustomArrayListObj<String> strings = new CustomArrayListObj<>();
        String test1 = "test1";
        strings.add(test1);

        assertTrue(strings.size() > 0);
        assertTrue(strings.contains(test1));
    }
}
