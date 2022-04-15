import Architecture.Generics.AgeComparator;
import Architecture.Generics.Employee;
import Architecture.Generics.Person;
import Architecture.Generics.ReverseComparator;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class ComparatorTests {
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
    void testAgeComparator() {
        assertFalse(employeeList.isEmpty());
        assertEquals(employeeList.get(0), employee2);
        assertEquals(employeeList.get(1), employee);
        assertEquals(employeeList.get(2), employee3);

        final AgeComparator<Person> ageComparator = new AgeComparator<>();

        employeeList.sort(ageComparator);
        assertEquals(employeeList.get(0), employee);
        assertEquals(employeeList.get(1), employee2);
        assertEquals(employeeList.get(2), employee3);
    }

    @Test
    void testReverseAgeComparator() {
        assertFalse(employeeList.isEmpty());
        assertEquals(employeeList.get(0), employee2);
        assertEquals(employeeList.get(1), employee);
        assertEquals(employeeList.get(2), employee3);

        final AgeComparator<Person> ageComparator = new AgeComparator<>();
        final ReverseComparator<Person> reverseComparator = new ReverseComparator<>(ageComparator);

        employeeList.sort(reverseComparator);
        assertEquals(employeeList.get(0), employee3);
        assertEquals(employeeList.get(1), employee2);
        assertEquals(employeeList.get(2), employee);
    }
}
