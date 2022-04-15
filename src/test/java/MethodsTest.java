import Architecture.Generics.Employee;
import Architecture.Generics.Methods;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodsTest {
    private final Employee employee = new Employee("Kacper", 20);
    private final Employee employee2 = new Employee("Lukasz", 25);
    private final Employee employee3 = new Employee("Michal", 30);
    private final List<Employee> employeeList = new ArrayList<>();

    @BeforeEach
    void setupDataset() {
        employeeList.add(employee2);
        employeeList.add(employee);
        employeeList.add(employee3);
    }

    @AfterEach
    void clearData() {
        employeeList.clear();
    }

    @Test
    void testMinMethod() {
        final Employee result = Methods.getMin(employeeList);
        final Integer minAge = result.getAge();
        final String name = result.getName();

        assertEquals(result, employee);
        assertEquals(minAge, 20);
        assertEquals(name, "Kacper");
    }
}
